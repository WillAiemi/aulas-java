import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        boolean lista = false;
        String r = "\n";
        String s = "";
        String op;
        boolean flag;
        
        do{
            flag = false;
            System.out.print("Ativar modo lista?\n(S/N): ");
            op = leia.next();
            switch(op){
                case "S": case "s":
                    lista = true;
                    break;
                case "N": case "n":
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente.\n");
                    flag = true;
            }
        } while(flag);
        
        System.out.print("Quantos nomes deseja inserir? ");
        String [] nomes = new String[leia.nextInt()];
        String [] nomesInvertido = new String[nomes.length];
        
        int j = nomes.length;
        
        for (int i = 0; i < nomes.length; i++){
            System.out.print((i+1)+"º nome: ");
            nomes[i] = leia.next();
            j--;
            nomesInvertido[j] = nomes[i];
            
            if(lista){
                r += nomes[i]+"\n";
                s = "\n" + nomesInvertido[j] + s;
            }
        }
        
        if(!lista){
            r = Arrays.toString(nomes);
            s = Arrays.toString(nomesInvertido);
        }
        
        System.out.print("\fNomes inseridos: " + r + 
                "\nNomes na ordem inversa: " + s);
    }
}
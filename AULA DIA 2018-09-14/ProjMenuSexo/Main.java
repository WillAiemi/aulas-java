import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        boolean quebra;
        String sexo;
        
        System.out.print("Informe os dados" +
                "\nNome: ");
        String nome = leia.next();
        System.out.println("Escolha o sexo:");
        do{
            System.out.print("1 - Masculino\n2 - Feminino\nDigite a opção: ");
            sexo = leia.next();
            switch(sexo){
                case "1":
                    sexo = "Masculino";
                    quebra = true;
                    break;
                case "2":
                    sexo = "Feminino";
                    quebra = true;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    quebra = false;
            }
        } while (!quebra);
        System.out.print("\fDados: " +
                "\nNome: " + nome +
                "\nSexo: " + sexo);
    }
}
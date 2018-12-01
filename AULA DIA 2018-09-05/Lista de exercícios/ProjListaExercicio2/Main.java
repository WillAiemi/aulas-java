import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        float pesoIdeal;
        
        System.out.println("Insira os dados da pessoa");
        System.out.print("Nome: ");
        String nome = leia.next();
        
        System.out.print("Idade: ");
        byte idade = leia.nextByte();
        
        System.out.print("Sexo(M/F): ");
        String sexo = leia.next();
        
        System.out.print("Altura(em metros): ");
        float altura = leia.nextFloat();
        
        if(sexo.equalsIgnoreCase("M")){
            pesoIdeal = (72.7f * altura)-58;
        } else {
            pesoIdeal = (62.1f * altura) - 44.7f;
        }
        
        System.out.print("\fDados da pessoa:"+
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nAltura: " + altura + "m" +
                "\nPeso ideal: " + pesoIdeal + "Kg");
    }
}
   
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira os dados do aluno");
        System.out.print("Nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Nota 1: ");
        float nota1 = leia.nextFloat();
        
        System.out.print("Nota 2: ");
        float nota2 = leia.nextFloat();
        
        System.out.print("Frequência(em %): ");
        float frequencia = leia.nextFloat();
        
        float media = (nota1+nota2)/2;
        
        String mensagem = "Aluno reprovado.";
        
        if(media >= 6){
            if (frequencia < 75){
                mensagem = "Aluno aprovado por média e reprovado por frequência.";
            } else {
                mensagem = "Aluno aprovado.";
            }
        } else if (frequencia >= 75){
            mensagem = "Aluno reprovado por média e aprovado por frequência.";
        }
        
        System.out.print("\fDados do aluno:" +
                "\nNome: " + nome +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 +
                "\nMédia: " + media +
                "\nFrequência: " + frequencia +
                "\n" + mensagem);
    }
}
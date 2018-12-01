import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double[] meuArray = new double[30];
        double mediaGeral = 0;
        double maiorMedia = 0;
        
        System.out.println("Insira as médias dos alunos: ");
        for (int i=0; i<30; i++){
            System.out.print("Aluno "+(i+1)+": ");
            meuArray[i] = leia.nextDouble();
            if(meuArray[i]>maiorMedia){
                maiorMedia = meuArray[i];
            }
            mediaGeral += meuArray[i];
        }
        mediaGeral = mediaGeral/30;
        System.out.print("\fResultados:" +
                "\nMédia geral da turma: " + mediaGeral +
                "\nMaior média: " + maiorMedia);
    }
}
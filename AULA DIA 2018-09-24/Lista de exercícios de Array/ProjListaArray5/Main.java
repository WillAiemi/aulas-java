import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Defina quantos números serão inseridos: ");
        int[] array = new int[leia.nextInt()];
        
        System.out.print("Insira o número de procura: ");
        int y = leia.nextInt();
        int qtdY = 0;
        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+"º número: ");
            array[i] = leia.nextInt();
            if (array[i] == y){
                qtdY++;
            }
        }
        
        System.out.print("\fFoi computado o número " + y + " um total de " + qtdY + " vezes.");
    }
}
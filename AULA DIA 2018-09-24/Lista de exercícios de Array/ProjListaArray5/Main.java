import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Defina quantos n�meros ser�o inseridos: ");
        int[] array = new int[leia.nextInt()];
        
        System.out.print("Insira o n�mero de procura: ");
        int y = leia.nextInt();
        int qtdY = 0;
        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+"� n�mero: ");
            array[i] = leia.nextInt();
            if (array[i] == y){
                qtdY++;
            }
        }
        
        System.out.print("\fFoi computado o n�mero " + y + " um total de " + qtdY + " vezes.");
    }
}
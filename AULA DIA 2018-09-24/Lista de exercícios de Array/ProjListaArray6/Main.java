import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Defina quantos números serão inseridos: ");
        int[] array = new int[leia.nextInt()];
        int indiceMaior = 0;
        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+"º número: ");
            array[i] = leia.nextInt();
            
            if (array[i] > array[indiceMaior]){
                indiceMaior = i;
            }
        }
        
        System.out.print("\fO maior número encontra-se no índice " + indiceMaior+".");
        System.out.print("\n\n\n"+Arrays.toString(array));
    }
}
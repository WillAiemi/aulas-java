import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int[] meuArray = new int[100];
        for (int i=0; i<100; i++){
            meuArray[i] = i+1;
        }
        System.out.println("\fAqui est� os 100 n�meros!");
        for (int i=0; i<100; i++){
            System.out.println(meuArray[i]);
        }
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        int qtdNegativo = 0;
        System.out.print("Quantidade de números a ser inserido: ");
        int[] array = new int[leia.nextInt()];
        
        for (int i=0; i<array.length; i++){
            System.out.print((i+1)+"º número: ");
            array[i] = leia.nextInt();
            
            if(array[i] < 0){
                qtdNegativo++;
            }
        }
        System.out.print("\fForam inseridos "+qtdNegativo+" números negativos.");        
    }
}
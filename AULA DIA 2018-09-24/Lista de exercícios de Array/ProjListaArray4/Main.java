import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int qtdPar = 0;
        int qtdImpar = 0;
        System.out.print("Quantos n�meros ser�o inseridos: ");
        int[] array = new int[leia.nextInt()];
        
        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+"� n�mero: ");
            array[i] = leia.nextInt();
            if(array[i] != 0){
                if(array [i] % 2 == 0){
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }
        
        System.out.print("\fForam computados " + qtdPar +
                " pares e " + qtdImpar + " �mpares.");
    }
}
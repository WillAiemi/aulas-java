import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("---Insira 10 números---\n");
        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+"º núméro: ");
            array[i] = leia.nextDouble();
        }
    }
}
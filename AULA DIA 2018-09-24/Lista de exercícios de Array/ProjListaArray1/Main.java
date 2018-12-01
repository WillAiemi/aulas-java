import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double[] array = {10, 2, 7, 9, 379};
        System.out.print("Os números são: " + array[0]);
        for(int i=1; i<array.length;i++){
            System.out.print(", "+array[i]);
        }
    }
}
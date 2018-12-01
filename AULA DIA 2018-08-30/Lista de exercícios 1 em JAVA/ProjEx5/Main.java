import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int numA;
        int numB;
        int numC;
        int temp;
        
        System.out.println("Insira números inteiros");
        System.out.print("A: ");
        numA = leia.nextInt();
        System.out.print("B: ");
        numB = leia.nextInt();
        System.out.print("C: ");
        numC = leia.nextInt();
        
        temp = numA;
        numA = numB;
        numB = numC;
        numC = temp;

        System.out.println("Valores trocados");
        System.out.println("A: " + numA);
        System.out.println("B: " + numB);
        System.out.println("C: " + numC);
    }
}
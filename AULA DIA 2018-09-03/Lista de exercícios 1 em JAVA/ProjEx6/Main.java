import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        
        System.out.println("Insira os valores de A, B e C");
        System.out.print("A: ");
        a = leia.nextDouble();
        System.out.print("B: ");
        b = leia.nextDouble();
        System.out.print("C: ");
        c = leia.nextDouble();
        
        x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        
        System.out.print("\f");
        System.out.println("A: "+a+" B: "+b+" C: "+c);
        System.out.println("x': "+x1);
        System.out.println("x'': "+x2);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num;
        double resultado;
        
        System.out.print("Insira um número: ");
        num = leia.nextInt();
        
        resultado = Math.pow(num,2);
        
        System.out.print("\f");
        System.out.println("Número: "+num);
        System.out.println("Número ao quadrado: "+resultado);        
    }
}
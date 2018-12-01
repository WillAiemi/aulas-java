import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int resultado;
        
        System.out.println("Insira os números");
        System.out.print("Número 1: ");
        num1 = leia.nextInt();
        System.out.print("Número 2: ");
        num2 = leia.nextInt();
        System.out.print("Número 3: ");
        num3 = leia.nextInt();
                
        resultado = (num1+num2)*(num2+num3);
        
        System.out.print("\f");
        System.out.println("Número 1: "+num1);
        System.out.println("Número 2: "+num2);
        System.out.println("Número 3: "+num3);
        System.out.println("A soma do primeiro com o segundo vezes");
        System.out.println("o segundo somado com o terceiro é: "+resultado);
    }
}
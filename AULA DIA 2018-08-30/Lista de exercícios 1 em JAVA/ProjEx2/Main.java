import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        double soma;
        double produto;
        double media;
        
        System.out.println("Insira os números");
        System.out.print("Número 1: ");
        num1 = leia.nextDouble();
        System.out.print("Número 2: ");
        num2 = leia.nextDouble();
        System.out.print("Número 3: ");
        num3 = leia.nextDouble();
        System.out.print("Número 4: ");
        num4 = leia.nextDouble();
        System.out.print("Número 5: ");
        num5 = leia.nextDouble();
        
        soma = num1+num2+num3+num4+num5;
        produto = num1*num2*num3*num4*num5;
        media = soma/5;
        
        System.out.print("\f");
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }
}
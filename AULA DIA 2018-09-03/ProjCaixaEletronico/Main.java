import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int saque;
        int notas100;
        double notas50;
        int notas20;
        int notas10;
        int notas5;
        int notas2;
        
        System.out.print("Insira o saque desejado: ");
        saque = leia.nextInt();
        
        notas100 = saque / 100;
        notas50 = saque % 100 / 50;
        notas20 = saque % 100 % 50 / 20;
        notas10 = saque % 100 % 50 % 20 / 10;
        notas5 = saque % 100 % 50 % 20 % 10 / 5;
        notas2 = saque % 100 % 50 % 20 % 10 % 5 / 2;
        
        System.out.print("\f");
        System.out.println("Saque de: "+saque);
        System.out.println("Notas de 100: "+notas100);
        System.out.println("Notas de 50: "+notas50);
        System.out.println("Notas de 20: "+notas20);
        System.out.println("Notas de 10: "+notas10);
        System.out.println("Notas de 5: "+notas5);
        System.out.println("Notas de 2: "+notas2);
    }
}
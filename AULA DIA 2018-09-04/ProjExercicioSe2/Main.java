import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String check;
        
        System.out.print("Insira um número: ");
        int num = leia.nextInt();
        
        if(num == 0){
            check = "nulo";
        } else if (num % 2 == 0){
            check = "par";
        } else {
            check = "ímpar";
        }
        
        System.out.print("\f");
        System.out.print("O número "+num+" é "+check+".");
    }
}
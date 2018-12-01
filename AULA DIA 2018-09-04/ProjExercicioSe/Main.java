import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String check;
        
        System.out.print("Insira um número: ");
        float num = leia.nextFloat();
        
        if(num > 0){
            check = "positivo";
        } else if (num < 0){
            check = "negativo";
        } else {
            check = "nulo";
        }
        
        System.out.print("\f");
        System.out.print("O número "+num+" é "+check+".");
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int num = leia.nextInt();
        String resultado = "nulo";
        
        if (num > 0) {
            if (num % 2 == 0){
                resultado = "par e positivo";
            } else {
                resultado = "ímpar e positivo";
            }
        } else if(num < 0){
            if(num % 2 == 0){
                resultado = "par e negativo";
            } else {
                resultado = "ímpar e negativo";
            }
        }
        
        System.out.print("\f");
        System.out.print("O número "+num+" é "+resultado);
    }
}
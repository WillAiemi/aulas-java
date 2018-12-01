import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double salarioBase;
        double salarioFinal;
                
        System.out.print("Insira o salário: ");
        salarioBase = leia.nextDouble();
        
        salarioFinal = salarioBase*1.05*0.93;
        
        System.out.print("\f");
        System.out.println("---Resultado---");
        System.out.println("Salário: R$"+salarioBase);
        System.out.println("Salário final: R$"+salarioFinal);        
    }
}
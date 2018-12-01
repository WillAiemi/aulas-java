import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double salario;
        double salarioMinimo;
        double nDeSalarios;
        
        System.out.print("Informe o seu salário: R$");
        salario = leia.nextDouble();
        System.out.print("Informe o salário mínimo: R$");
        salarioMinimo = leia.nextDouble();
        
        nDeSalarios = salario/salarioMinimo;
        
        System.out.print("\f");
        System.out.println("O total de salários mínimos é "+nDeSalarios);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double salarioFixo;
        double vendas;
        double comissao;
        double salarioFinal;
        
        System.out.print("Insira o salário fixo: ");
        salarioFixo = leia.nextDouble();
        System.out.print("Insira o total em vendas: ");
        vendas = leia.nextDouble();
        
        comissao = vendas*0.04;
        salarioFinal = salarioFixo+comissao;
        
        System.out.print("\f");
        System.out.println("Comissão: R$" + comissao);
        System.out.println("Salário final: R$" + salarioFinal);
    }
}
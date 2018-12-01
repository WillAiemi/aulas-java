import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        int chapa;
        double valorHora;
        int cargaHoraria;
        double salarioBase;
        
        System.out.println("Informe os dados do funcionário");
        System.out.print("Nome: ");
        nome = leia.next();
        System.out.print("Chapa: ");
        chapa = leia.nextInt();
        System.out.print("Valor Hora: ");
        valorHora = leia.nextDouble();
        System.out.print("Carga Horária: ");
        cargaHoraria = leia.nextInt();
        
        salarioBase = valorHora*cargaHoraria;

        System.out.print("\f");
        
        System.out.println("Dados do funcionário");
        System.out.println("Nome: " + nome);
        System.out.println("Chapa: " + chapa);
        System.out.println("Valor hora: " + valorHora);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Salário Base: R$" + salarioBase);
    }
}
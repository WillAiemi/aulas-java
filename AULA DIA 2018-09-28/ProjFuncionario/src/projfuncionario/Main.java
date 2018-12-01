package projfuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.print("Informe os dados do funcionário 1: "
                + "\nNome: ");
        f1.nome = leia.next();
        System.out.print("Valor hora: ");
        f1.valorHora = leia.nextDouble();
        System.out.print("Carga horária do mês: ");
        f1.cargaHorariaMes = leia.nextDouble();
        
        System.out.print("Informe os dados do funcionário 2: "
                + "\nNome: ");
        f2.nome = leia.next();
        System.out.print("Valor hora: ");
        f2.valorHora = leia.nextDouble();
        System.out.print("Carga horária do mês: ");
        f2.cargaHorariaMes = leia.nextDouble();
        
        System.out.print("\n\nDados do funcionário 1: "
                + "\nNome: " + f1.nome
                + "\nValor hora: R$" + f1.valorHora
                + "\nCarga horária mês: " + f1.cargaHorariaMes
                + "\nSalário: R$" + f1.calcularSalario());
        
        System.out.print("\n\nDados do funcionário 2: "
                + "\nNome: " + f2.nome
                + "\nValor hora: R$" + f2.valorHora
                + "\nCarga horária mês: " + f2.cargaHorariaMes
                + "\nSalário: R$" + f2.calcularSalario());
    }
}

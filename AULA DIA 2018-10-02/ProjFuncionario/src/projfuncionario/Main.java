package projfuncionario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        System.out.print("Informe os dados do funcionário 1: "
                + "\nNome: ");
        f1.setNome(leia.next());
        System.out.print("Salário: ");
        f1.setSalario(leia.nextDouble());

        System.out.print("\nInforme os dados do funcionário 2: "
                + "\nNome: ");
        f2.setNome(leia.next());
        System.out.print("Salário: ");
        f2.setSalario(leia.nextDouble());

        System.out.print("\n\nDados do funcionário 1: "
                + f1.mostrarTudo()
                + "\n\nDados do funcionário 2: "
                + f2.mostrarTudo() + "\n");
    }
}

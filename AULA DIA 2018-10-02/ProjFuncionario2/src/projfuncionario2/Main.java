package projfuncionario2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.print("\fInsira os dados do funcionário 1: "
                + "\nNome: ");
        f1.setNome(leia.next());
        System.out.print("Chapa: ");
        f1.setChapa(leia.nextInt());
        System.out.print("Valor hora: ");
        f1.setValorHora(leia.nextDouble());
        System.out.print("Carga horária trabalhada: ");
        f1.setCargaHorariaTrabalhada(leia.nextDouble());
        
        System.out.print("\n\fInsira os dados do funcionário 2: "
                + "\nNome: ");
        f2.setNome(leia.next());
        System.out.print("Chapa: ");
        f2.setChapa(leia.nextInt());
        System.out.print("Valor hora: ");
        f2.setValorHora(leia.nextDouble());
        System.out.print("Carga horária trabalhada: ");
        f2.setCargaHorariaTrabalhada(leia.nextDouble());
        
        System.out.print("\n\n\fDados do funcionário 1"
                + f1.toString()
                + "\nDados do funcionário 2"
                + f2.toString());
    }
}
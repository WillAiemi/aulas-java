package projconstrutor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Tela.limparTela();
        System.out.print("Informe os dados: "
                + "\nNome: ");
        String nome = leia.next();
        
        System.out.print("CPF: ");
        long cpf = leia.nextLong();
        
        System.out.print("RG: ");
        String rg = leia.next();
        
        System.out.print("E-mail: ");
        String email = leia.next();
        
        System.out.print("Celular: ");
        String celular = leia.next();
        
        System.out.print("Salário: ");
        double salario = leia.nextDouble();
        
        Funcionario f = new Funcionario(nome, cpf, rg, email, celular, salario);
        Tela.limparTela();
        byte op;
        do {
            System.out.print("Inserir telefone residencial?"
                    + "\n1 - Sim."
                    + "\n2 - Não."
                    + "\nDigite a opção: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.print("Telefone residencial: ");
                    f.setFoneResidencial(leia.next());
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 1 && op != 2);
        Tela.limparTela();
        do {
            System.out.print("Inserir e-mail alternativo?"
                    + "\n1 - Sim."
                    + "\n2 - Não."
                    + "\nDigite a opção: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.print("E-mail alternativo: ");
                    f.setEmailAlternativo(leia.next());
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 1 && op != 2);
        Tela.limparTela();
        System.out.print("Dados do funcionário: " + f.toString());
    }
}

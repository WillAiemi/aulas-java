package projenderecotarde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe os dados do endereço 1\n"
                + "Rua: ");
        String rua = leia.next();

        System.out.print("Número: ");
        int numero = leia.nextInt();

        byte op;
        String complemento = "Casa";
        Tela.limparTela();
        do {
            System.out.print("Deseja alterar o complemento de " + complemento + " para outro?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            Tela.limparTela();

            switch (op) {
                case 1:
                    System.out.print("Complemento: ");
                    complemento = leia.next();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);

        System.out.print("Bairro: ");
        String bairro = leia.next();

        System.out.print("Cep: ");
        String cep = leia.next();

        Tela.limparTela();
        
        String cidade = "Canoas";
        
        do {
            System.out.print("Deseja alterar a cidade de " + cidade + " para outra?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.print("Cidade: ");
                    cidade = leia.next();
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);

        Tela.limparTela();
        
        String uf = "RS";
        
        do {
            System.out.print("Deseja alterar unidade federativa de " + uf + " para outra?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            Tela.limparTela();
            
            switch (op) {
                case 1:
                    System.out.print("UF: ");
                    uf = leia.next();
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);
        
        Tela.limparTela();
        
        System.out.print("Email: ");
        String email = leia.next();
        
        String emailAlternativo = null;
        
        do {
            System.out.print("Deseja inserir um email alternativo?"
                    + "\n1 - Sim."
                    + "\n2 - Não."
                    + "Digite aqui a ação desejada: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    emailAlternativo = leia.next();
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 1 || op != 2);
        
        Endereco e1 = new Endereco(rua, numero, bairro, cep, email);
        
        e1.setEmailAlternativo(emailAlternativo);
                
        System.out.print("Informe os dados do endereço 1\n"
                + "Rua: ");
        rua = leia.next();

        System.out.print("Número: ");
        numero = leia.nextInt();

        complemento = "Casa";
        Tela.limparTela();
        do {
            System.out.print("Deseja alterar o complemento de " + complemento + " para outro?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            Tela.limparTela();

            switch (op) {
                case 1:
                    System.out.print("Complemento: ");
                    complemento = leia.next();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);

        System.out.print("Bairro: ");
        bairro = leia.next();

        System.out.print("Cep: ");
        cep = leia.next();

        Tela.limparTela();
        
        cidade = "Canoas";
        
        do {
            System.out.print("Deseja alterar a cidade de " + cidade + " para outra?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.print("Cidade: ");
                    cidade = leia.next();
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);

        Tela.limparTela();
        
        uf = "RS";
        
        do {
            System.out.print("Deseja alterar unidade federativa de " + uf + " para outra?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            Tela.limparTela();
            
            switch (op) {
                case 1:
                    System.out.print("UF: ");
                    uf = leia.next();
                case 2:
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }
        } while (op < 1 || op > 2);
        
        Tela.limparTela();
        
        System.out.print("Email: ");
        email = leia.next();
        
        emailAlternativo = null;
        
        do {
            System.out.print("Deseja inserir um email alternativo?"
                    + "\n1 - Sim."
                    + "\n2 - Não."
                    + "Digite aqui a ação desejada: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    emailAlternativo = leia.next();
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 1 || op != 2);
        
        Endereco e2 = new Endereco(rua, numero, bairro, cep, email);
        
        e2.setEmailAlternativo(emailAlternativo);

        Tela.limparTela();

        System.out.println("Dados do endereço 1" + e1);
        System.out.print("Dados do endereço 2" + e2);
    }

}

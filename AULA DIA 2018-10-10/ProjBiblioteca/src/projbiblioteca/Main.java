package projbiblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locacao l = new Locacao();
        System.out.print("Informe os dados"
                + "\nLIVRO"
                + "\nTítulo: ");
        l.getLivro().setTitulo(leia.next());
        System.out.print("Gênero: ");
        l.getLivro().setGenero(leia.next());
        System.out.print("Autor: ");
        l.getLivro().setAutor(leia.next());
        System.out.print("Valor da locação desse livro: ");
        l.setValorLocacao(leia.nextDouble());
        
        Tela.limparTela();
        
        int dia;
        int mes;
        int ano;
        do {
            System.out.print("DATA ATUAL"
                    + "\nDia: ");
            dia = leia.nextInt();
            System.out.print("Mês: ");
            mes = leia.nextInt();
            System.out.print("Ano: ");
            ano = leia.nextInt();
            Tela.limparTela();
            if (Validador.checaDatas(dia, mes, ano)) {
                break;
            }
            System.out.print("\nData inválida\n");
        } while(true);
        
        Tela.limparTela();
                
        byte op;
        boolean flag = true;
        int contador = 0;
        double multa;
        do {
            contador++;
            multa = contador-7;
            if (multa < 0) {
                multa = 0;
            }
            l.setValorMulta(0*0.5);
            System.out.print("DATA: " + dia + "/" + mes + "/" + ano
                    + "\nEscolhe uma ação abaixo(cada ação vale 1 dia):"
                    + "\nStatus do livro: " + l.getLivro().mostrarStatus());
            if (l.getLivro().status) {
                System.out.print("\n1 - Locar livro.");
            } else {
                System.out.print("\n1 - Devolver livro.(R$" + l.calcularLocacao() + ")");
            }
            System.out.print("\n2 - Fazer nada."
                    + "\n3 - Dados do livro."
                    + "\n4 - Cadastrar usuário."
                    + "\n5 - Cadastrar funcionário."
                    + "\nDigite aqui a opção: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    if (l.getLivro().status) {
                        l.locarLivro();
                        System.out.print("Data da locação: "
                                + "\nDia: ");
                        l.getDataLocacao().setDia(leia.nextInt());
                        System.out.print("Mês: ");
                        l.getDataLocacao().setMes(leia.nextInt());
                        System.out.print("Ano: ");
                        l.getDataLocacao().setAno(leia.nextInt());
                        contador = 0;
                    } else {
                        l.devolverLivro();
                        System.out.print("Data da devolução: "
                                + "\nDia: ");
                        l.getDataDevolucao().setDia(leia.nextInt());
                        System.out.print("Mês: ");
                        l.getDataDevolucao().setMes(leia.nextInt());
                        System.out.print("Ano: ");
                        l.getDataDevolucao().setAno(leia.nextInt());
                        flag = false;
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.print("Dados do livro: " + l.getLivro());
                    break;
                case 4:
                    System.out.print("USUÁRIO"
                            + "\nNome: ");
                    l.getUsuario().setNome(leia.next());
                    System.out.print("Código: ");
                    l.getUsuario().setCodigo(leia.nextInt());
                    System.out.print("CPF: ");
                    l.getUsuario().setCpf(leia.nextLong());
                    System.out.print("Endereço"
                            + "\nRua: ");
                    l.getUsuario().getEndereco().setRua(leia.next());
                    System.out.print("Número: ");
                    l.getUsuario().getEndereco().setNumero(leia.nextInt());
                    System.out.print("Bairro: ");
                    l.getUsuario().getEndereco().setBairro(leia.next());
                    break;
                case 5:
                    System.out.print("FUNCIONÁRIO"
                            + "\nNome: ");
                    l.getFuncionario().setNome(leia.next());
                    System.out.print("CPF: ");
                    l.getFuncionario().setCpf(leia.nextLong());
                    System.out.print("Chapa: ");
                    l.getFuncionario().setChapa(leia.next());
                    System.out.print("Salário: ");
                    l.getFuncionario().setSalario(leia.nextDouble());
                    System.out.print("Endereço"
                            + "\nRua: ");
                    l.getFuncionario().getEndereco().setRua(leia.next());
                    System.out.print("Número: ");
                    l.getFuncionario().getEndereco().setNumero(leia.nextInt());
                    System.out.print("Bairro: ");
                    l.getFuncionario().getEndereco().setBairro(leia.next());
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
            dia++;
            if (!(Validador.checaDatas(dia, mes, ano))) {
                dia = 1;
                mes++;
                if (!(Validador.checaDatas(dia, mes, ano))) {
                    mes = 1;
                    ano++;
                }
            }
        } while (flag);
        
        System.out.print(":::::DADOS DA LOCAÇÃO:::::" + l);

    }
}

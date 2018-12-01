package projbibliotecareal;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner leia = new Scanner(System.in);
        Locacao l = new Locacao();
        byte op;
        boolean flag = true;
        do {
            System.out.print(":::::::::::::::::::::: Sistema de Cadastramento ::::::::::::::::::::::"
                    + "\nEscolha uma opção abaixo"
                    + "\n[1] - Cadastrar funcionário"
                    + "\n[2] - Cadastrar usuário"
                    + "\n[3] - Cadastrar livro"
                    + "\n[4] - Mostrar todos os dados do cadastro"
                    + "\n[5] - Ir para locação"
                    + "\n[0] - Sair do sistema"
                    + "\n\nDigite aqui opção: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.print("Informe os dados do funcionário."
                            + "\nNome: ");
                    l.getFuncionario().setNome(leia.next());
                    System.out.print("CPF: ");
                    l.getFuncionario().setCpf(leia.nextLong());
                    System.out.print("Chapa: ");
                    l.getFuncionario().setChapa(leia.next());
                    System.out.print("Salário: R$");
                    l.getFuncionario().setSalario(leia.nextDouble());
                    System.out.print("Endereço"
                            + "\nRua: ");
                    l.getFuncionario().getEndereco().setRua(leia.next());
                    System.out.print("Número: ");
                    l.getFuncionario().getEndereco().setNumero(leia.nextInt());
                    System.out.print("Bairro: ");
                    l.getFuncionario().getEndereco().setBairro(leia.next());                    
                    break;
                case 2:
                    System.out.print("Informe os dados do usuário."
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
                case 3:
                    System.out.print("Informe os dados do livro."
                            + "\nTítulo: ");
                    l.getLivro().setTitulo(leia.next());
                    System.out.print("Gênero: ");
                    l.getLivro().setGenero(leia.next());
                    System.out.print("Autor: ");
                    l.getLivro().setAutor(leia.next());
                    break;
                case 4:
                    System.out.print("USUÁRIO" + l.getUsuario() + "\n"
                            + "FUNCIONÁRIO" + l.getFuncionario() + "\n"
                            + "LIVRO" + l.getLivro() + "\n");
                    break;
                case 5:
                    do {
                        System.out.print("::::::::::::::::: Sistema de Locação ::::::::::::::::::"
                                + "\nEscolha uma opção abaixo"
                                + "\n[1] - Locar livro"
                                + "\n[2] - Devolver livro"
                                + "\n[3] - Mostrar os dados do livro locado"
                                + "\n[4] - Mostra os dados do livro devolvido"
                                + "\n[0] - Sair"
                                + "\n\nDigite aqui a opção: ");
                        op = leia.nextByte();
                        Tela.limparTela();
                        switch (op) {
                            case 1:
                                l.locarLivro();
                                System.out.print("Insira a data de locação."
                                        + "\nDia: ");
                                l.getDataLocacao().setDia(leia.nextInt());
                                System.out.print("Mês: ");
                                l.getDataLocacao().setMes(leia.nextInt());
                                System.out.print("Ano: ");
                                l.getDataLocacao().setAno(leia.nextInt());
                                Tela.limparTela();
                                System.out.print("Livro locado.\n\n");
                                break;
                            case 2:
                                l.devolverLivro();
                                System.out.print("Insira a data de devolução."
                                        + "\nDia: ");
                                l.getDataDevolucao().setDia(leia.nextInt());
                                System.out.print("Mês: ");
                                l.getDataDevolucao().setMes(leia.nextInt());
                                System.out.print("Ano: ");
                                l.getDataDevolucao().setAno(leia.nextInt());
                                Tela.limparTela();
                                System.out.print("Livro devolvido.\n\n");
                                break;
                            case 3:
                                System.out.print(l + "\n");
                                break;
                            case 4:
                                System.out.print(l + "\n" 
                                        + "Valor total a pagar: " + l.calcularLocacao() + "\n");
                                break;
                            case 0:
                                flag = false;
                                break;
                            default:
                                System.out.print("\nOpção inválida. Tente novamente\n");
                        }
                    } while (flag);
                    flag = true;
                    break;
                case 0:
                    System.out.print("Programa encerrado.\n");
                    flag = false;
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (flag);
    }
}
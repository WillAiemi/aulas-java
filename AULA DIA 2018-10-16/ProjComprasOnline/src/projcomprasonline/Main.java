package projcomprasonline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.print("Cadastro da biblioteca\n"
                + "Nome: ");
        b.setNome(leia.next());
        System.out.print("CNPJ: ");
        b.setCnpj(leia.nextLong());
        Tela.limparTela();
        byte op;
        do {
            System.out.print("::::::::::::::::::::::::::::::::::::::::::::::::::::::::LIVRARIA ONLINE::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                    + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::ESCOLHA UMA OPÇÃO ABAIXO::::::::::::::::::::::::::::::::::::::::::::::::::::"
                    + "\n:: 1 - CADASTRAR LIVRO"
                    + "\n:: 2 - MOSTRAR TODOS OS LIVROS"
                    + "\n:: 3 - MOSTRAR QUANTIDADE DE LIVROS"
                    + "\n:: 4 - ESVAZIAR CARRINHO"
                    + "\n:: 0 - SAIR"
                    + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                    + "\nDIGITE AQUI A OPÇÃO DESEJADA: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    Livro l = new Livro();
                    System.out.print("Título: ");
                    l.setTitulo(leia.next());
                    System.out.print("Gênero: ");
                    l.setGenero(leia.next());
                    System.out.print("Autor: ");
                    l.setAutor(leia.next());
                    System.out.print("Valor unitário: ");
                    l.setValorUnitario(leia.nextDouble());
                    Tela.limparTela();
                    b.getLista().add(l);
                    System.out.print("\nLivro cadastrado.\n");
                    break;
                case 2:
                    if (b.getLista().isEmpty()) {
                        System.out.print("Não há produtos.");
                    } else {
                        System.out.print(b);
                    }
                    break;
                case 3:
                    System.out.print("Quantidade de livros: " + b.getLista().size());
                    break;
                case 4:
                    if (b.getLista().isEmpty()) {
                        System.out.print("\nNão há produtos para excluir.\n");
                    } else {
                        System.out.print("Tem certeza que deseja EXCLUIR tudo?"
                                + "\n1 - SIM"
                                + "\n2 - NÃO"
                                + "\nDigite a opção: ");
                        op = leia.nextByte();
                        Tela.limparTela();
                        if (op == 1) {
                            b.getLista().clear();
                            System.out.print("\nExclusão executada com êxito.\n");
                        } else {
                            System.out.print("\nOperação cancelada.");
                        }
                    }
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 0);
    }
}
package projassociacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.print("Informe os dados da biblioteca: "
                + "\nNome: ");
        b.setNome(leia.next());
        System.out.print("CNPJ: ");
        b.setCnpj(leia.nextLong());
        
        Tela.limparTela();
        
        System.out.print("Informe os dados do livro 1: "
                + "\nTítulo: ");
        b.getLivro1().setTitulo(leia.next());
        System.out.print("Gênero: ");
        b.getLivro1().setGenero(leia.next());
        System.out.print("Autor: ");
        b.getLivro1().setAutor(leia.next());
        System.out.print("ISBN: ");
        b.getLivro1().setIsbn(leia.next());
        
        Tela.limparTela();
        
        System.out.print("Informe os dados do livro 1: "
                + "\nTítulo: ");
        b.getLivro2().setTitulo(leia.next());
        System.out.print("Gênero: ");
        b.getLivro2().setGenero(leia.next());
        System.out.print("Autor: ");
        b.getLivro2().setAutor(leia.next());
        System.out.print("ISBN: ");
        b.getLivro2().setIsbn(leia.next());
        
        Tela.limparTela();
        
        System.out.print("Dados da biblioteca: " + b);
    }
}
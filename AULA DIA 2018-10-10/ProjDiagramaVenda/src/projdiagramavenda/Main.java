package projdiagramavenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Venda v = new Venda();
        System.out.print("Informe os dados da compra."
                + "\nCódigo: ");
        v.setCodigo(leia.nextInt());
        System.out.print("Data da venda"
                + "\nDia: ");
        v.getDataVenda().setDia(leia.nextByte());
        System.out.print("Mês: ");
        v.getDataVenda().setMes(leia.nextByte());
        System.out.print("Ano: ");
        v.getDataVenda().setAno(leia.nextInt());
        
        Tela.limparTela();
        
        System.out.print("Primeiro livro."
                + "\nTítulo: ");
        v.getLivro1().setTitulo(leia.next());
        System.out.print("ISBN: ");
        v.getLivro1().setIsbn(leia.nextLong());
        System.out.print("Autor: ");
        v.getLivro1().setAutor(leia.next());
        System.out.print("Valor: ");
        v.getLivro1().setValor(leia.nextDouble());
        System.out.print("Data de lançamento"
                + "\nDia: ");
        v.getLivro1().getDataLancamento().setDia(leia.nextByte());
        System.out.print("Mês: ");
        v.getLivro1().getDataLancamento().setMes(leia.nextByte());
        System.out.print("Ano: ");
        v.getLivro1().getDataLancamento().setAno(leia.nextInt());
        
        Tela.limparTela();
        
        System.out.print("Segundo livro."
                + "\nTítulo: ");
        v.getLivro2().setTitulo(leia.next());
        System.out.print("ISBN: ");
        v.getLivro2().setIsbn(leia.nextLong());
        System.out.print("Autor: ");
        v.getLivro2().setAutor(leia.next());
        System.out.print("Valor: ");
        v.getLivro2().setValor(leia.nextDouble());
        System.out.print("Data de lançamento"
                + "\nDia: ");
        v.getLivro2().getDataLancamento().setDia(leia.nextByte());
        System.out.print("Mês: ");
        v.getLivro2().getDataLancamento().setMes(leia.nextByte());
        System.out.print("Ano: ");
        v.getLivro2().getDataLancamento().setAno(leia.nextInt());
        
        Tela.limparTela();
        
        System.out.print("::::Dados da Venda::::" + v);
    }
}
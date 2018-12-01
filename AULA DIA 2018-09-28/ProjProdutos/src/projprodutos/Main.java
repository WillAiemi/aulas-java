package projprodutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        Produto objProduto3 = new Produto();
        
        System.out.print("Cadastrar produto 1: "
                + "\nNome: ");
        objProduto1.nome = leia.next();
        System.out.print("Descrição: ");
        objProduto1.descricao = leia.next();
        System.out.print("Valor: ");
        objProduto1.valor = leia.nextDouble();
        
        System.out.print("Cadastrar produto 2: "
                + "\nNome: ");
        objProduto2.nome = leia.next();
        System.out.print("Descrição: ");
        objProduto2.descricao = leia.next();
        System.out.print("Valor: ");
        objProduto2.valor = leia.nextDouble();
        
        System.out.print("Cadastrar produto 3: "
                + "\nNome: ");
        objProduto3.nome = leia.next();
        System.out.print("Descrição: ");
        objProduto3.descricao = leia.next();
        System.out.print("Valor: ");
        objProduto3.valor = leia.nextDouble();
        
        System.out.print("\n\nProduto 1:"
                + "\nNome: " + objProduto1.nome
                + "\nDescrição: " + objProduto1.descricao
                + "\nValor: " + objProduto1.valor);
        System.out.print("\n\nProduto 2:"
                + "\nNome: " + objProduto2.nome
                + "\nDescrição: " + objProduto2.descricao
                + "\nValor: " + objProduto2.valor);
        System.out.print("\n\nProduto 3:"
                + "\nNome: " + objProduto3.nome
                + "\nDescrição: " + objProduto3.descricao
                + "\nValor: " + objProduto3.valor);
    }
}
package projassociacaoaluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno a = new Aluno();
        System.out.print("Informe os dados do aluno: "
                + "\nNome: ");        
        a.setNome(leia.next());
        System.out.print("Idade: ");
        a.setIdade(leia.nextByte());
        
        Tela.limparTela();
        
        System.out.print("Informe os dados da avaliação 1."
                + "\nDescrição: ");
        a.getAvaliacao1().setDescricao(leia.next());
        System.out.print("Nota: ");
        a.getAvaliacao1().setNota(leia.nextDouble());
        
        Tela.limparTela();
        
        System.out.print("Informe os dados da avaliação 2."
                + "\nDescrição: ");
        a.getAvaliacao2().setDescricao(leia.next());
        System.out.print("Nota: ");
        a.getAvaliacao2().setNota(leia.nextDouble());
        
        System.out.print("Dados do aluno: " + a);
    }
}
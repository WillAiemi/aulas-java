
package projaluno;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        System.out.print("Informe os dados do aluno 1"
                + "\nNome: ");
        a1.nome = leia.next();
        System.out.print("Nota 1: ");
        a1.nota1 = leia.nextDouble();
        System.out.print("Nota 2: ");
        a1.nota2 = leia.nextDouble();
        
        System.out.print("Informe os dados do aluno 1"
                + "\nNome: ");
        a2.nome = leia.next();
        System.out.print("Nota 1: ");
        a2.nota1 = leia.nextDouble();
        System.out.print("Nota 2: ");
        a2.nota2 = leia.nextDouble();
        
        System.out.print("\n\nDados do aluno 1"
                + "\nNome: " + a1.nome
                + "\nNota 1: " + a1.nota1
                + "\nNota 2: " + a1.nota2
                + "\nMédia: " + a1.calcularMedia()
                + "\nSituação: " + a1.verificarSituacao());
        
        System.out.print("\n\nDados do aluno 2"
                + "\nNome: " + a2.nome
                + "\nNota 1: " + a2.nota1
                + "\nNota 2: " + a2.nota2
                + "\nMédia: " + a2.calcularMedia()
                + "\nSituação: " + a2.verificarSituacao());
    }
}
package projnadador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Nadador n1 = new Nadador();
        Nadador n2 = new Nadador();
        
        System.out.print("Informe os dados do nadador 1: "
                + "\nNome: ");
        n1.setNome(leia.next());
        System.out.print("Idade: ");
        n1.setIdade(leia.nextByte());
        
        System.out.print("\nInforme os dados do nadador 2: "
                + "\nNome: ");
        n2.setNome(leia.next());
        System.out.print("Idade: ");
        n2.setIdade(leia.nextByte());
        
        System.out.print("\n\nDados do nadador 1: "
                + n1.toString()
                + "\nDados do nadador 2: "
                + n2.toString());
    }
}

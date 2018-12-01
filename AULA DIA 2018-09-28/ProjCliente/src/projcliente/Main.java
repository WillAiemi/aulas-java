
package projcliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        
        System.out.print("Informe os dados do cliente 1: "
                + "\nNome: ");
        c1.nome = leia.next();
        System.out.print("CPF: ");
        c1.cpf = leia.next();
        System.out.print("RG: ");
        c1.rg = leia.next();
        System.out.print("Endereço: ");
        c1.endereco = leia.next();
        System.out.print("Renda bruta: ");
        c1.rendaBruta = leia.nextDouble();
        System.out.print("Limite: ");
        c1.limite = leia.nextDouble();
        
        System.out.print("Informe os dados do cliente 2: "
                + "\nNome: ");
        c2.nome = leia.next();
        System.out.print("CPF: ");
        c2.cpf = leia.next();
        System.out.print("RG: ");
        c2.rg = leia.next();
        System.out.print("Endereço: ");
        c2.endereco = leia.next();
        System.out.print("Renda bruta: ");
        c2.rendaBruta = leia.nextDouble();
        System.out.print("Limite: ");
        c2.limite = leia.nextDouble();
        
        System.out.print("\n\nDados do cliente 1: "
                + "\nNome: " + c1.nome
                + "\nCPF: " + c1.cpf
                + "\nRG: "+ c1.rg
                + "\nEndereço: "+ c1.endereco
                + "\nRenda bruta: " + c1.rendaBruta
                + "\nLimite: " + c1.limite);
        
        System.out.print("\n\nDados do cliente 2: "
                + "\nNome: " + c2.nome
                + "\nCPF: " + c2.cpf
                + "\nRG: "+ c2.rg
                + "\nEndereço: "+ c2.endereco
                + "\nRenda bruta: " + c2.rendaBruta
                + "\nLimite: " + c2.limite);
        
    }  
}
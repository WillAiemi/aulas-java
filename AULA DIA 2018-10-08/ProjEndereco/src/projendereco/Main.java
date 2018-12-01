package projendereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();
        
        System.out.print("Informe o endereço 1: "
                + "\nRua: ");
        e1.setRua(leia.next());
        System.out.print("Número: ");
        e1.setNumero(leia.nextInt());
        System.out.print("Complemento: ");
        e1.setComplemento(leia.next());
        System.out.print("Bairro: ");
        e1.setBairro(leia.next());
        System.out.print("CEP: ");
        e1.setCep(leia.next());
        System.out.print("Cidade: ");
        e1.setCidade(leia.next());
        System.out.print("UF: ");
        e1.setUf(leia.next());
        
        System.out.print("\nInforme o endereço 2: "
                + "\nRua: ");
        e2.setRua(leia.next());
        System.out.print("Número: ");
        e2.setNumero(leia.nextInt());
        System.out.print("Complemento: ");
        e2.setComplemento(leia.next());
        System.out.print("Bairro: ");
        e2.setBairro(leia.next());
        System.out.print("CEP: ");
        e2.setCep(leia.next());
        System.out.print("Cidade: ");
        e2.setCidade(leia.next());
        System.out.print("UF: ");
        e2.setUf(leia.next());
        
        Tela.limparTela();
        System.out.print("Dados do endereço 1: "
                + e1.toString()
                + "\nDados do endereço 2: "
                + e2.toString());
    }
}
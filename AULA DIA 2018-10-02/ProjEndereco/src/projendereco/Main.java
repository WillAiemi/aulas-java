package projendereco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Endereco e1 = new Endereco();

        System.out.print("Informe o endereço"
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

        System.out.print("\n\nEndereço completo"
                + e1.toString());
    }
}

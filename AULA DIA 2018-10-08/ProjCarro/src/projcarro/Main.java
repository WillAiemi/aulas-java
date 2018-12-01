package projcarro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe os dados do carro."
                + "\nMarca: ");
        String marca = leia.next();
        System.out.print("Modelo: ");
        String modelo = leia.next();
        System.out.print("Valor: ");
        double valor = leia.nextDouble();
        
        Carro c = new Carro(marca, modelo, valor);
        
        byte op;
        do {
            System.out.print("Escolhe uma ação abaixo: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op > 1 || op < 2);
        
        Tela.limparTela();
        
        System.out.print("Dados do carro" + c.toString());
        
    }
}
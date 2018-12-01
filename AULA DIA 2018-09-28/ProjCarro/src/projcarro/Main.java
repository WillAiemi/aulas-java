
package projcarro;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        System.out.print("Informe os dados do carro 1"
                + "\nMarca: ");
        c1.marca = leia.next();
        System.out.print("Modelo: ");
        c1.modelo = leia.next();
        System.out.print("Chassi: ");
        c1.chassi = leia.next();
        System.out.print("Ano de fabricação: ");
        c1.anoFabricacao = leia.nextInt();
        System.out.print("Ano do modelo: ");
        c1.anoModelo = leia.nextInt();
        System.out.print("Valor unitário: ");
        c1.valorUnitario = leia.nextDouble();
        System.out.print("Quantidade: ");
        c1.quantidade = leia.nextInt();
        System.out.print("Nível do tanque: ");
        c1.nivelTanque = leia.nextDouble();
        System.out.print("Média km/L: ");
        c1.mediaKmLitro = leia.nextDouble();
        
        System.out.print("Informe os dados do carro 2"
                + "\nMarca: ");
        c2.marca = leia.next();
        System.out.print("Modelo: ");
        c2.modelo = leia.next();
        System.out.print("Chassi: ");
        c2.chassi = leia.next();
        System.out.print("Ano de fabricação: ");
        c2.anoFabricacao = leia.nextInt();
        System.out.print("Ano do modelo: ");
        c2.anoModelo = leia.nextInt();
        System.out.print("Valor unitário: ");
        c2.valorUnitario = leia.nextDouble();
        System.out.print("Quantidade: ");
        c2.quantidade = leia.nextInt();
        System.out.print("Nível do tanque: ");
        c2.nivelTanque = leia.nextDouble();
        System.out.print("Média km/L: ");
        c2.mediaKmLitro = leia.nextDouble();
        
        System.out.print("\n\nDados do carro 1"
                + "\nMarca: " + c1.marca
                + "\nModelo: " + c1.modelo
                + "\nChassi: " + c1.chassi
                + "\nAno de fabricação: " + c1.anoFabricacao
                + "\nAno do modelo: " + c1.anoModelo
                + "\nValor unitário: R$" + c1.valorUnitario
                + "\nQuantidade: " + c1.quantidade
                + "\nNível do tanque: " + c1.nivelTanque
                + "\nMédia km/L: " + c1.mediaKmLitro
                + "\nValor total: R$" + c1.calcularValorTotalDoVeiculo()
                + "\nDistância a percorrer: " + c1.calcularDistanciaAPercorrer());
        
        System.out.print("\n\nDados do carro 2"
                + "\nMarca: " + c2.marca
                + "\nModelo: " + c2.modelo
                + "\nChassi: " + c2.chassi
                + "\nAno de fabricação: " + c2.anoFabricacao
                + "\nAno do modelo: " + c2.anoModelo
                + "\nValor unitário: R$" + c2.valorUnitario
                + "\nQuantidade: " + c2.quantidade
                + "\nNível do tanque: " + c2.nivelTanque
                + "\nMédia km/L: " + c2.mediaKmLitro
                + "\nValor total: R$" + c2.calcularValorTotalDoVeiculo()
                + "\nDistância a percorrer: " + c2.calcularDistanciaAPercorrer());
    }
}
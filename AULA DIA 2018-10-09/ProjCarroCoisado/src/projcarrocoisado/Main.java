package projcarrocoisado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro c = new Carro();
        
        System.out.print("Informe os dados do carro."
                + "\nFabricante: ");
        c.setFabricante(leia.next());
        System.out.print("Marca: ");
        c.setMarca(leia.next());
        System.out.print("Modelo: ");
        c.setModelo(leia.next());
        System.out.print("Tipo: ");
        c.setTipo(leia.next());
        System.out.print("Ano de fabricação: ");
        c.setAnoFabricacao(leia.nextInt());
        System.out.print("Potência em CV: ");
        c.setPotenciaCv(leia.nextInt());
        System.out.print("Valor à vista: ");
        c.setValorAVista(leia.nextDouble());
        System.out.print("Taxa: ");
        c.setTaxa(leia.nextDouble());
        System.out.print("Consumo médio em Km/L: ");
        c.setConsumoMedioKmLitro(leia.nextDouble());
        System.out.print("Quantidade de combustível: ");
        c.setQtdDeCombustivel(leia.nextDouble());
        Tela.limparTela();
        byte op;
        boolean flag = true;
        do {
            System.out.print("Escolhe uma ação abaixo: "
                    + "\n1 - Calcular distancia a percorrer."
                    + "\n2 - Calcular consumo."
                    + "\n3 - Abastecer."
                    + "\n4 - Mostrar nível do tanque."
                    + "\n5 - Mostrar todos os dados do carro."
                    + "\n0 - Sair.");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.println("Distância a percorrer: " + c.calcularDistanciaAPercorrer() + "\n");
                    break;
                case 2:
                    System.out.print("Kilometros a percorrer: ");
                    System.out.println("Consumo: " + c.calcularConsumo(leia.nextDouble()) + "\n");
                    break;
                case 3:
                    System.out.print("Valor do combustível: R$");
                    double combustivel = leia.nextDouble();
                    System.out.print("Valor a abastecer: R$");
                    c.abastecer(combustivel, leia.nextDouble());
                    break;
                case 4:
                    System.out.println("Nível do tanque: " + c.getQtdDeCombustivel() + "\n");
                    break;
                case 5:
                    System.out.println("Dados do carro: " + c.toString());
                    break;
                case 0:
                    flag = false;
                    System.out.println("Programa encerrado.\n");
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (flag);
    }
}
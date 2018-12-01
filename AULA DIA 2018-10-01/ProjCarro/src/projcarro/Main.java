package projcarro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro c1 = new Carro();
        
        System.out.print("Informe os dados do carro 1"
                + "\nMarca: ");
        c1.marca = leia.next();
        System.out.print("Modelo: ");
        c1.modelo = leia.next();
        System.out.print("Ano de fabricação: ");
        c1.anoFabricacao = leia.nextInt();
        System.out.print("Ano do modelo: ");
        c1.anoModelo = leia.nextInt();
        System.out.print("Autonomia: ");
        c1.autonomia = leia.nextDouble();
        System.out.print("Nível do tanque: ");
        c1.nivelTanque = leia.nextDouble();
        System.out.print("Valor por litro de combustível: ");
        c1.valorLitroCombustivel = leia.nextDouble();
        
        System.out.print(c1.mostrarTudo());
    }
}
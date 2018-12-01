import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double precoLitro;
        double autonomia;
        double distancia;
        double litrosTotal;
        double gastoTotal;
        
        System.out.println("Dados para a viagem");
        System.out.print("Preço por litro: ");
        precoLitro = leia.nextDouble();
        System.out.print("Km por litro de combustível: ");
        autonomia = leia.nextDouble();
        System.out.print("Distância a percorrer(em Km): ");
        distancia = leia.nextDouble();
        
        litrosTotal = distancia/autonomia;
        gastoTotal = litrosTotal*precoLitro;
        
        System.out.print("\f");
        System.out.println("Dados da Viagem");
        System.out.println("Preço por litro: " + precoLitro);
        System.out.println("Km por litro de combustível: " + autonomia);
        System.out.println("Distância a percorrer(em Km): " + distancia);
        System.out.println("Total de litros: " + litrosTotal);
        System.out.println("Gasto total na viagem: R$" + gastoTotal);
    }
}
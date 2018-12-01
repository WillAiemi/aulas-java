import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double custoConsumidor;
        double custoFabrica;
        
        System.out.print("Insira o custo de fábrica do automóvel: R$");
        custoFabrica = leia.nextDouble();
        
        custoConsumidor = custoFabrica*1.73;
        
        System.out.print("\f");
        System.out.println("Custo de fábrica: R$"+custoFabrica);
        System.out.println("Custo para o consumidor: R$"+custoConsumidor);
    }
}
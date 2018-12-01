package projvendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Vendedor v = new Vendedor();
        
        System.out.print("Informe os dados."
                + "\nNome: ");
        v.setNome(leia.next());
        System.out.print("Valor total vendido: ");
        v.setValorTotalVendido(leia.nextFloat());
        System.out.print("Meta: ");
        v.setMeta(leia.nextFloat());
        
        System.out.print("\n\nDados do vendedor"
                + v.toString());
    }
}
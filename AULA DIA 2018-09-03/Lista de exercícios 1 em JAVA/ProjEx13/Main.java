import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int nDeLatas;
        int nDeRefri600;
        int nDe2L;
        double total;
        double totalLitros;
        
        System.out.println("Insira a quantidade vendida de");
        System.out.print("Latas: ");
        nDeLatas = leia.nextInt();
        System.out.print("Refri 600mL: ");
        nDeRefri600 = leia.nextInt();
        System.out.print("Refri 2 Litros: ");
        nDe2L = leia.nextInt();
        
        totalLitros = nDeLatas*0.35 + nDeRefri600*0.6 + nDe2L*2;
        total = nDeLatas*1.20 + nDeRefri600*1.80 + nDe2L*2.80;
        
        System.out.print("\f");
        System.out.println("Foram vendidas "+nDeLatas+" latas,"+nDeRefri600+" garrafas");
        System.out.println("600mL e "+nDe2L+" garrafas de 2 litros.");
        System.out.println("Totalizando "+totalLitros+"L e R$"+total+".");
    }
}
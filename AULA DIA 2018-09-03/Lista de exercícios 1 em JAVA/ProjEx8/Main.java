import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double peso;
        double engordar;
        double emagrecer;
        
        System.out.print("Informe seu peso(em Kg): ");
        peso = leia.nextDouble();
        
        engordar = peso*1.15;
        emagrecer = peso*0.8;
        
        System.out.print("\f");
        System.out.println("Peso atual: "+peso+"Kg");
        System.out.println("Se engordar 15%: "+engordar+"Kg");
        System.out.println("Se emagrecer 20%: "+emagrecer+"Kg");
    }
}
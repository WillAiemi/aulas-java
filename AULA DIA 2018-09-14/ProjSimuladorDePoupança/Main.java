import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Bem-vindo ao Simulador de Poupança!" +
                "\nPor favor, informe os dados." +
                "\nValor do depósito: ");
        double valorDeposito = leia.nextDouble();
        System.out.print("Valor desejado: ");
        double valorDesejado = leia.nextDouble();
        
        double valorAtingido = valorDeposito;
        int meses = 0;
        do{
            valorAtingido = valorAtingido*1.006;
            meses = meses+1;
        } while(valorDesejado>valorAtingido);
        
        System.out.print("\fA sua poupança atingirá um total de R$" + valorAtingido +
                "\nem " + meses + " meses.");
    }
}
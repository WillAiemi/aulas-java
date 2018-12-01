import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int totalDias;
        int anos;
        int meses;
        int dias;
        
        System.out.print("Quantos dias de vida você tem? ");
        totalDias = leia.nextInt();
        
        anos = totalDias / 365;
        meses = totalDias % 365 / 30;
        dias = totalDias % 365 % 30;
        
        System.out.print("\f");
        System.out.println("Você viveu aproximadamente "+anos+" anos,\n"
        + meses + " meses e "+dias+" dias.");
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int anoNasc;
        int idade;
        int idade2020;
        int anoAtual;
        
        System.out.print("Em que ano estamos? ");
        anoAtual = leia.nextInt();
        System.out.print("Que ano você nasceu? ");
        anoNasc = leia.nextInt();
        
        idade = anoAtual-anoNasc;
        idade2020 = 2020-anoNasc;
        
        System.out.print("\f");
        System.out.println("Você tem aproximadamente " +idade+ " anos e");
        System.out.println("terá "+idade2020+" anos em 2020.");
    }
}
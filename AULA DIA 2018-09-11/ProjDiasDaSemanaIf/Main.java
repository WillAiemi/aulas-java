import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro: ");
        int num = leia.nextInt();
        
        String diaDaSemana;
        
        if(num == 1){
            diaDaSemana = "Domingo";
        } else if(num == 2){
            diaDaSemana = "Segunda-feira";
        } else if(num == 3){
            diaDaSemana = "Terça-feira";
        } else if(num == 4){
            diaDaSemana = "Quarta-feia";
        } else if(num == 5){
            diaDaSemana = "Quinta-feira";
        } else if(num == 6){
            diaDaSemana = "Sexta-feira";
        } else if(num == 7){
            diaDaSemana = "Sábado";
        } else {
            diaDaSemana = "inválido";
        }
        
        System.out.print("\fO número é " + num + " e o dia da semana é " + diaDaSemana + ".");
    }
}
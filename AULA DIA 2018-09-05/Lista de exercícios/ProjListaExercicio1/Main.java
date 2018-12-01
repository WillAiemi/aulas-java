import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String diaSemana;
        
        System.out.print("Insira um número inteiro: ");
        int num = leia.nextInt();
        
        if (num == 1){
            diaSemana = "domingo";
        } else if(num == 2){
            diaSemana = "segunda-feira";
        } else if(num == 3){
            diaSemana = "terça-feira";
        } else if(num == 4){
            diaSemana = "quarta-feira";
        } else if(num == 5){
            diaSemana = "quinta-feira";
        } else if(num == 6){
            diaSemana = "sexta-feira";
        } else if(num == 7){
            diaSemana = "sábado";
        } else {
            diaSemana = "invalido";
        }
        
        System.out.print("\fO número é " + num + " e o dia da semana é " + diaSemana);
    }
}
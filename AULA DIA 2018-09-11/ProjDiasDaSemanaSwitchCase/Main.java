import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        byte num = 0;
        String diaDaSemana;
        System.out.print("Insira um número inteiro: ");
        
        do{
            num = leia.nextByte();
            switch( num ){
                case 1:
                    diaDaSemana = "Domingo";
                    break;
                case 2:
                    diaDaSemana = "Segunda-feira";
                    break;
                case 3:
                    diaDaSemana = "Terça-feira";
                    break;
                case 4:
                    diaDaSemana = "Quarta-feira";
                    break;
                case 5:
                    diaDaSemana = "Quinta-feira";
                    break;
                case 6:
                    diaDaSemana = "Sexta-feira";
                    break;
                case 7:
                    diaDaSemana = "Sábado";
                    break;
                default:
                    diaDaSemana = "inválido.\nDigite novamente: ";
                    break;
            }
            System.out.print("\fO número é " + num + " e o dia da semana é " + diaDaSemana );
        }while(num < 1 || num > 7);
    }
}
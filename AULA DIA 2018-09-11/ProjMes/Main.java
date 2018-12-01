import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        byte num;
        System.out.print("Insira um número inteiro referente ao mês: ");
        do{
            num = leia.nextByte();
            String mes;
            switch(num){
                case 1:
                    mes = "janeiro";
                    break;
                case 2:
                    mes = "fevereiro";
                    break;
                case 3:
                    mes = "março";
                    break;
                case 4:
                    mes = "abril";
                    break;
                case 5:
                    mes = "maio";
                    break;
                case 6:
                    mes = "junho";
                    break;
                case 7:
                    mes = "julho";
                    break;
                case 8:
                    mes = "agosto";
                    break;
                case 9:
                    mes = "setembro";
                    break;
                case 10:
                    mes = "outubro";
                    break;
                case 11:
                    mes = "novembro";
                    break;
                case 12:
                    mes = "dezembro";
                    break;
                default:
                    mes = "\fMês inválido, digite novamente: ";
            }
            System.out.print("\fO número é "+num+" e o mês é "+mes);
        }while(num < 1 || num > 12);
    }
}
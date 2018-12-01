import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String validade;
        int fevereiro;
        
        System.out.print("::::::::VALIDAÇÃO DE DATA::::::::" +
                "\nInsira o dia: ");
        int dia = leia.nextInt();
        
        System.out.print("Insira o mês: ");
        int mes = leia.nextInt();
        
        System.out.print("Insira o ano: ");
        int ano = leia.nextInt();
        
        if ((dia > 0 && dia <= 31 && mes > 0 && mes <= 12) && (((mes == 2) && ((dia <= 28) || ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0) && dia <= 29))) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) || (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))) {
            validade = "válido: ";
        } else {
            validade = "inválido: ";
        }
        /*
        if(dia > 0 && dia <= 31 && mes > 0 && mes <= 12){
            if(mes == 2 && dia <= 29){
                if (!((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) && dia == 29){
                    validade = "inválido: ";
                } else {
                    validade = "válido: ";
                }
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30){
                validade = "válida: ";
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                validade = "válida: ";
            } else {
                validade = "inválida: ";
            }
        } else {
            validade = "inválida: ";
        }
        */
        System.out.print("\fData "+validade + dia + "/" + mes + "/" + ano);
    }
}
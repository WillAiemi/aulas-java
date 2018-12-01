import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira seus dados" +
                "\nNome: ");
        String nome = leia.next();
        System.out.print("---Nascimento---\n" +
                "Dia: ");
        byte diaNasc = leia.nextByte();
        System.out.print("Mês: ");
        byte mesNasc = leia.nextByte();
        System.out.print("Ano: ");
        int anoNasc = leia.nextInt();
        System.out.print("---Atual---\n" +
                "Dia: ");
        byte diaAtual = leia.nextByte();
        System.out.print("Mês: ");
        byte mesAtual = leia.nextByte();
        System.out.print("Ano: ");
        int anoAtual = leia.nextInt();
        
        String signo;
        int idade;
        
        if(mesAtual > mesNasc && diaAtual > diaNasc){
            idade = anoAtual - anoNasc;
        } else {
            idade = anoAtual - anoNasc - 1;
        }
        
        switch(mesNasc){
            case 1:
                if(diaNasc <= 21){
                    signo = "Capricórnio";
                    break;
                }
            case 2:
                if(diaNasc <= 18 || mesNasc == 1){
                    signo = "Aquário";
                    break;
                }
            case 3:
                if(diaNasc <= 19){
                    signo = "Peixes";
                    break;
                }
            case 4:
                if(diaNasc <= 20){
                    signo = "Áries";
                    break;
                }
            case 5:
                if(diaNasc <= 20 || mesNasc == 4){
                    signo = "Touro";
                    break;
                }
            case 6:
                if(diaNasc <= 21 || mesNasc == 5){
                    signo = "Gêmeos";
                    break;
                }
            case 7:
                if(diaNasc <= 21){
                    signo = "Câncer";
                    break;
                }
            case 8:
                if(diaNasc <= 22){
                    signo = "Leão";
                    break;
                }
            case 9:
                if(diaNasc <= 22 || mesNasc == 8){
                    signo = "Virgem";
                    break;
                }
            case 10:
                if(diaNasc <= 22 || mesNasc == 9){
                    signo = "Libra";
                    break;
                }
            case 11:
                if(diaNasc <= 21 || mesNasc == 10){
                    signo = "Escorpião";
                    break;
                }
            case 12:
                if(diaNasc <= 21 || mesNasc == 11){
                    signo = "Sagitário";
                    break;
                }
            default:
                signo = "Capricórnio";
        }
        System.out.print("\fDados\n" +
                "Nome: " + nome +
                "\nData de Nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc +
                "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual +
                "\nIdade: " + idade + " anos" +
                "\nSigno: " + signo);
    }
}
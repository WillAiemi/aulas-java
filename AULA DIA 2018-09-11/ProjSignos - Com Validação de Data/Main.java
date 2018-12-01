import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        byte diaNasc;
        byte mesNasc;
        int anoNasc;
        byte diaAtual;
        byte mesAtual;
        int anoAtual;
        String signo;
        int idade;
        
        System.out.print("\fInsira seus dados" +
                "\nNome: ");
        String nome = leia.next();
        
        System.out.println("---Nascimento---");
        while(true){
            System.out.print("Dia: ");
            diaNasc = leia.nextByte();
            System.out.print("Mês: ");
            mesNasc = leia.nextByte();
            System.out.print("Ano: ");
            anoNasc = leia.nextInt();
            if ((anoNasc > 0 && diaNasc > 0 && diaNasc <= 31 && mesNasc > 0 && mesNasc <= 12) && (((mesNasc == 2) && ((diaNasc <= 28) || ((anoNasc % 4 == 0) && (anoNasc % 100 != 0 || anoNasc % 400 == 0) && diaNasc <= 29))) || ((mesNasc == 4 || mesNasc == 6 || mesNasc == 9 || mesNasc == 11) && diaNasc <= 30) || (mesNasc == 1 || mesNasc == 3 || mesNasc == 5 || mesNasc == 7 || mesNasc == 8 || mesNasc == 10 || mesNasc == 12))) {
                break;
            }
            System.out.println("Data inválida. Insira novamente.");
        }
        
        System.out.println("---Atual---");
        while(true){    
            System.out.print("Dia: ");
            diaAtual = leia.nextByte();
            System.out.print("Mês: ");
            mesAtual = leia.nextByte();
            System.out.print("Ano: ");
            anoAtual = leia.nextInt();
            if ((anoAtual > 0 && diaAtual > 0 && diaAtual <= 31 && mesAtual > 0 && mesAtual <= 12) && (((mesAtual == 2) && ((diaAtual <= 28) || ((anoAtual % 4 == 0) && (anoAtual % 100 != 0 || anoAtual % 400 == 0) && diaAtual <= 29))) || ((mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) && diaAtual <= 30) || (mesAtual == 1 || mesAtual == 3 || mesAtual == 5 || mesAtual == 7 || mesAtual == 8 || mesAtual == 10 || mesAtual == 12))) {
                break;
            }
            System.out.println("Data inválida. Insira novamente.");
        }
        
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
                if(diaNasc <= 19 || mesNasc == 2){
                    signo = "Peixes";
                    break;
                }
            case 4:
                if(diaNasc <= 20 || mesNasc == 3){
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
                if(diaNasc <= 21 || mesNasc == 6){
                    signo = "Câncer";
                    break;
                }
            case 8:
                if(diaNasc <= 22 || mesNasc == 7){
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
        System.out.print("\fDados da pessoa\n" +
                "Nome: " + nome +
                "\nData de Nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc +
                "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual +
                "\nIdade: " + idade + " anos" +
                "\nSigno: " + signo);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votosTotais = 0;
        String mensagem;
        String chapaEmpate1;
        String chapaEmpate2;
        boolean empate = false;
        boolean flag = true;
        String chapa3 = "\n::Digite 3 para votar na chapa 3::";
        
        
        do{
            mensagem = "";
            System.out.print("::::::::::ELEIÇÕES 2018:::::::::::" +
                    "\n::Digite 1 para votar na chapa 1::" +
                    "\n::Digite 2 para votar na chapa 2::" +
                    chapa3 +
                    "\n::::::::::::::::::::::::::::::::::" +
                    "\nVoto: ");
            int voto = leia.nextInt();
            switch (voto){
                case 1:
                    votos1 = votos1+1;
                    votosTotais = votosTotais+1;
                    break;
                case 2:
                    votos2 = votos2 + 1;
                    votosTotais = votosTotais+1;
                    break;
                case 3:
                    if(!empate){
                        votos3 = votos3+1;
                        votosTotais = votosTotais+1;
                        break;
                    }
                default:
                    mensagem = "Voto inválido. Tente novamente.";
            }
            if(votosTotais == 100 || votos1 > 50 || votos2 > 50 || votos3 > 50){
                empate = (votos1 == votos2 || votos2 == votos3 || votos1 == votos3);
                if (empate){
                    
                } else {
                    break;
                }
            }
            System.out.println("\fFaltam " +(100-votosTotais)+" votos.\n\n"+mensagem);
        }while(flag);
        
        System.out.print("\fVOTAÇÃO ENCERRADA" +
                "\nResultados: " +
                "\nChapa 1: " + votos1 + " votos" +
                "\nChapa 2: " + votos2 + " votos" +
                "\nChapa 3: " + votos3 + " votos");
    }
}
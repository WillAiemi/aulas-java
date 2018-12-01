import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votosTotais = 0;
        String mensagem;
        boolean empate = false;
        boolean flag = true;
        String chapas = "\n::Digite 1 para votar na chapa 1::" +
                        "\n::Digite 2 para votar na chapa 2::" +
                        "\n::Digite 3 para votar na chapa 3::";
        boolean empate1 = false;
        boolean empate2 = false;
        boolean empate3 = false;
        
        do{
            mensagem = "";
            System.out.print("::::::::::ELEIÇÕES 2018:::::::::::" + chapas +
                    "\n::::::::::::::::::::::::::::::::::" +
                    "\nVoto: ");
            int voto = leia.nextInt();
            switch (voto){
                case 1:
                    if(!empate1){
                        votos1 = votos1+1;
                        votosTotais = votosTotais+1;
                        break;
                    }
                case 2:
                    if(!empate2){
                        votos2 = votos2 + 1;
                        votosTotais = votosTotais+1;
                        break;
                    }
                case 3:
                    if(!empate3){
                        votos3 = votos3+1;
                        votosTotais = votosTotais+1;
                        break;
                    }
                default:
                    mensagem = "Voto inválido. Tente novamente.";
            }
            int votosFaltantes = 100-votosTotais;
            if(votosTotais >= 100 || votos1 > (votosFaltantes+votos2) || votos1 > (votosFaltantes+votos3) || votos2 > (votosFaltantes+votos1) || votos2 > (votosFaltantes+votos3) || votos3 > (votosFaltantes+votos1) || votos3 > (votosFaltantes+votos2)){
                empate = (votos1 == votos2 && votos3<votos2 || votos2 == votos3 && votos1<votos3 || votos1 == votos3 && votos2<votos1);
                if(empate){
                    if (votos1==votos2){
                        chapas = "\nEMPATE ENTRE CHAPA 1 E CHAPA 2" +
                                 "\n::Digite 1 para votar na chapa 1::" +
                                 "\n::Digite 2 para votar na chapa 2::";
                        empate3 = true;
                    } else if (votos2==votos3) {
                        chapas = "\nEMPATE ENTRE CHAPA 2 E CHAPA 3" +
                                 "\n::Digite 1 para votar na chapa 2::" +
                                 "\n::Digite 2 para votar na chapa 3::";
                        empate1 = true;
                    } else if(votos1==votos3){
                        chapas = "\nEMPATE ENTRE CHAPA 1 E CHAPA 3" +
                                 "\n::Digite 1 para votar na chapa 1::" +
                                 "\n::Digite 2 para votar na chapa 3::";
                        empate2 = true;
                    }
                } else {
                    System.out.print("\fVOTAÇÃO ENCERRADA" +
                            "\nResultados: " +
                            "\nChapa 1: " + votos1 + " votos" +
                            "\nChapa 2: " + votos2 + " votos" +
                            "\nChapa 3: " + votos3 + " votos");
                    break;
                }
            } else {
                System.out.println("\fFaltam " +(votosFaltantes)+" votos.\n\n"+mensagem);
            }
        }while(true);
    }
}
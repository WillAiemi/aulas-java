import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Cadastro de funcionários");
        boolean flag;
        String sexo;
        int sexoM = 0;
        int sexoF = 0;

        do{
            System.out.print("\n1 - Cadastrar novo candidato" +
                    "\n2 - Encerrar" +
                    "\nDigite a ação desejada: ");
            int opcao = leia.nextInt();
            switch(opcao){
                case 1:
                    do{
                        while(true){
                            System.out.print("Sexo(M/F): ");
                            sexo = leia.next();
                            if(sexo.equalsIgnoreCase("m")){
                                sexoM = sexoM+1;
                                break;
                            } else if(sexo.qualsIgnoreCase("f")){
                                sexoF = sexoF+1;
                                break;
                            } else {
                                System.out.print("Opção inválida. Tente novamente.");
                            }
                        }
                        
                        while(true){
                            System.out.print("
                        }
                    } while();
            }
        }while(true);
    }
}
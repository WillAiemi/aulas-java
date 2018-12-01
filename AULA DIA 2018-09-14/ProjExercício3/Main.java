import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        boolean flag;
        byte opcao;
        
        System.out.print("Informe os dados do funcionário" +
                "\nNome: ");
        String nome = leia.next();
        System.out.print("Valor total da passagem mensal: ");
        double valorPassagem = leia.nextDouble();
        System.out.print("Valor hora: ");
        double valorHora = leia.nextDouble();
        System.out.print("Total de horas trabalhadas: ");
        int horasTrabalhadas = leia.nextInt();
        
        double salarioBruto = valorHora*horasTrabalhadas;
        
        double valorVT = 0;
        do{
            flag = false;
            System.out.print("1 - Ganha Vale-Transporte" +
                    "\n2 - Não ganha Vale-Transporte" +
                    "\nDigite a opção desejada: ");
            opcao = leia.nextByte();
            switch (opcao){
                case 1:
                    valorVT = salarioBruto*1.06;
                    if(valorVT>valorPassagem){
                        valorVT = valorPassagem;
                    }
                    break;
                case 2:
                    valorVT = 0;
                    break;
                default:
                    System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
                    flag = true;
            }
        } while(flag);
        
        double insalubridade = 0;
        do{
            flag = false;
            System.out.print(":::::::::::Opção de insalubridade:::::::::::" +
                    "\nEscolha uma opção abaixo" +
                    "\n1 - Mínimo" +
                    "\n2 - Médio" +
                    "\n3 - Máximo" +
                    "\n0 - Não recebe");
            opcao = leia.nextByte();
            switch(opcao){
                case 1:
                    insalubridade = 1103.66*0.1;
                    break;
                case 2:
                    insalubridade = 1103.66*0.2;
                    break;
                case 3:
                    insalubridade = 1103.66*0.4;
                    break;
                case 0:
                    insalubridade = 0;
                    break;
                default:
                    System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
                    flag = true;
            }
        } while(flag);
        
        double INSS;
        if(salarioBruto <= 1659.38){
            INSS = salarioBruto*0.08;
        } else if(salarioBruto <= 2765.66){
            INSS = salarioBruto*0.09;
        } else if(salarioBruto <= 5531.31){
            INSS = salarioBruto*0.11;
        } else {
            INSS = 5531.31*0.11;
        }
        
        double salarioLiquido = salarioBruto - INSS - valorVT + insalubridade;
        System.out.print("\f");
        String mensagem;
        flag = true;
        do{
            System.out.print("::::::::::::INFORMAÇÕES DO FUNCIONÁRIO::::::::::::" +
                "\nEscolha uma opção abaixo:" +
                "\n1 - Mostrar todos os dados do funcionário" +
                "\n2 - Ver descontos" +
                "\n3 - Ver benefícios" +
                "\n4 - Ver Salário Líquido" +
                "\n0 - Sair" +
                "\nDigite aqui a opção desejada: ");
            opcao = leia.nextByte();
            switch(opcao){
                case 1:
                    System.out.print("\fDADOS DO FUNCIONÁRIO" +
                            "\nNome: " + nome +
                            "\nValor da passagem: R$" + valorPassagem +
                            "\nValor hora: R$" + valorHora +
                            "\nHoras trabalhadas: " + horasTrabalhadas + "h" +
                            "\nSalário bruto: R$" + salarioBruto +
                            "\nValor do Vale-Transporte: R$" + valorVT +
                            "\nValor da insalubridade: R$" + insalubridade +
                            "\nValor do INSS: R$" + INSS +
                            "\nSalário Líquido: R$" + salarioLiquido);
                    break;
                case 2:
                    System.out.println("\fDESCONTOS" +
                            "\nValor do Vale-Transporte: R$" + valorVT +
                            "\nValor do INSS: R$" + INSS);
                    break;
                case 3:
                    System.out.println("\fBENEFÍCIOS" +
                            "\nValor da insalubridade: R$" + insalubridade);
                    break;
                case 4:
                    System.out.println("\fSalário Liquido: R$" + salarioLiquido);
                case 0:
                    System.out.print("\fPrograma encerrado.");
                    flag = false;
                    break;
                default:
                    System.out.println("\fOPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
            }
        } while(flag);
    }
}
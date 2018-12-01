import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        byte opcao;
        String mensagem;
        do{
            System.out.print("Escolha uma opção abaixo:" +
                    "\n1 - Mostrar Salário Bruto" +
                    "\n2 - Mostrar Valor de horas extras" +
                    "\n3 - Mostrar Valor do VT" +
                    "\n4 - Mostrar Valor do INSS" +
                    "\n5 - Mostrar Valor de Insalubridade" +
                    "\n6 - Mostrar Valor do Salário Família" +
                    "\n7 - Mostrar Valor do plano de carreira" +
                    "\n8 - Mostrar Valor total de plano de saúde" +
                    "\n9 - Mostrar Valor do Salário Líquido" +
                    "\n10 - Cadastrar novo funcionário" +
                    "\n11 - Sair do sistema" +
                    "Digite aqui a opção desejada:");
            opcao = leia.nextByte();
            switch (opcao) {
                case 1:
                    mensagem = "\f1	O salário é: R$ 1000";
                    break;
                case 2:
                    mensagem = "\f2	O valor hora é R$: 10";
                    break;
                case 3:
                    mensagem = "\f3	O valor do vale transporte é: R$ 60";
                    break;
                case 4:
                    mensagem = "\f4	O valor do INSS é: R$ 110";
                    break;
                case 5:
                    mensagem = "\f5	O valor da Insalubridade é: R$ 400";
                    break;
                case 6:
                    mensagem = "\f6	O valor do Salário Família é: $ 350";
                    break;
                case 7:
                    mensagem = "\f7	O valor do Plano de carreira é: R$ 500";
                    break;
                case 8:
                    mensagem = "\f8	O valor do Plano de saúde é: R$ 600";
                    break;
                case 9:
                    mensagem = "\f9	O valor do Salário Líquido é: R$ 800";
                    break;
                case 10:
                    mensagem = "\f10	Funcionário cadastrado";
                    break;
                case 11:
                    mensagem = "\f11	Sistema encerrado";
                    break;
                default:
                    mensagem = "\fOpção inválida. Tente novamente";
            }
            System.out.println(mensagem);
        }while(opcao != 11);
    }
}
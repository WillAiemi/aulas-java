package projfuncionariodesafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        boolean flag;
        byte op;
        Funcionario f = new Funcionario();
        boolean flagMain;
        do{
            System.out.print(":::::::::::::::::::::Cadastro de funcionário:::::::::::::::::::::"
                    + "\nNome: ");
            f.setNome(leia.next());
            System.out.print("Chapa: ");
            f.setChapa(leia.nextInt());
            System.out.print("CPF: ");
            f.setCpf(leia.nextLong());
            System.out.print("RG: ");
            f.setRg(leia.next());
            System.out.print("Endereço: ");
            f.setEndereco(leia.next());
            System.out.print("Telefone: ");
            f.setFone(leia.next());

            do {
                flag = false;
                System.out.print("Escolhe o sexo conforme abaixo:"
                        + "\n1 - Masculino"
                        + "\n2 - Feminino"
                        + "\nDigite a opção: ");
                op = leia.nextByte();
                switch (op) {
                    case 1:
                        f.setSexo("Masculino");
                        break;
                    case 2:
                        f.setSexo("Feminino");
                        break;
                    default:
                        System.out.print("\nOpção inválida. Tente novamente\n");
                        flag = true;
                }
            } while (flag);

            System.out.print("Email: ");
            f.setEmail(leia.next());
            System.out.print("Cargo: ");
            f.setCargo(leia.next());
            System.out.print("Quantidade de dependentes: ");
            f.setQuantidadeDeDependentes(leia.nextByte());
            System.out.print("Quantidade de filhos: ");
            f.setQuantidadeDeFilhos(leia.nextByte());
            System.out.print("Anos em serviço na empresa: ");
            f.setTempoDeServicoAno(leia.nextByte());
            System.out.print("Valor hora: ");
            f.setValorHora(leia.nextDouble());
            System.out.print("Carga horária base: ");
            f.setCargaHorariaBase(leia.nextDouble());
            System.out.print("Horas extras: ");
            f.setQuantidadeDeHorasExtras(leia.nextDouble());

            do {
                flag = false;
                System.out.print("Escolha do Vale Transporte conforme abaixo: "
                        + "\n1 - Sim, ganha VT"
                        + "\n2 - Não, não ganha VT"
                        + "\nDigite a opção: ");
                op = leia.nextByte();
                switch (op) {
                    case 1:
                        f.receberVT();
                        System.out.print("Digite o valor das passagens: ");
                        f.setValorPagoEmPassagens(leia.nextDouble());
                        break;
                    case 2:
                        f.cancelarVT();
                        break;
                    default:
                        System.out.print("\nOpção inválida. Tente novamente\n");
                        flag = true;
                }
            } while (flag);

            do {
                flag = false;
                System.out.print("Escolha o grau de insalubridade: "
                        + "\n1 - Máximo 40%"
                        + "\n2 - Médio 20%"
                        + "\n3 - Mínimo 10%"
                        + "\n0 - Nenhum"
                        + "Digite a opção: ");
                f.setGrauInsalubridade(leia.nextByte());
                if (f.getGrauInsalubridade() < 0 || f.getGrauInsalubridade() > 3) {
                    flag = true;
                    System.out.print("\nOpção inválida. Tente novamente\n");
                }
            } while (flag);
            
            do {
                System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                        + ":::::::::::::::::::::::ESCOLHA UMA OPÇÃO: :::::::::::::::::::::::"
                        + "\n:::::1 - Mostrar nome e Salário Bruto                       :::::"
                        + "\n:::::2 - Mostrar nome e Valor de horas extras               :::::"
                        + "\n:::::3 - Mostrar nome e Valor do VT                         :::::"
                        + "\n:::::4 - Mostrar nome e Valor do INSS                       :::::"
                        + "\n:::::5 - Mostrar nome e Valor da Insalubridade              :::::"
                        + "\n:::::6 - Mostrar nome e Valor do Salário Família            :::::"
                        + "\n:::::7 - Mostrar nome e Valor do plano de carreira          :::::"
                        + "\n:::::8 - Mostrar nome e Valor total de plano de saúde       :::::"
                        + "\n:::::9 - Mostrar nome e Valor do Salário Líquido            :::::"
                        + "\n:::::10- Mostrar todos os dados e cálculos de funcionário   :::::"
                        + "\n:::::11- Cadastrar novo funcionário                         :::::"
                        + "\n:::::0 - Sair do sistema                                    :::::"
                        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                        + "Digite aqui a sua opção: ");
                op = leia.nextByte();
                switch (op) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.print("\nOpção inválida. Tente novamente\n");
                }
            } while (flag);
        } while(flagMain);
    }
}

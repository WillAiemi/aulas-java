package projagencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Agencia a = new Agencia();
        byte op;
        boolean flag;
        boolean esteCaso = true;
        String r = "";
        System.out.print(":::::::::::::::::::::::::::AGÊNCIA::::::::::::::::::::::::::::"
                + "\n:: NOME: ");
        a.setNome(leia.next());
        System.out.print(":: NÚMERO: ");
        a.setNumero(leia.nextLong());
        Tela.limparTela();
        do {
            System.out.print(":::::::::::::::::::::::GERENCIAR CONTAS:::::::::::::::::::::::\n"
                    + "::  1  -  CADASTRAR CONTA                                   ::\n"
                    + "::  2  -  MOSTRAR TODAS AS CONTAS                           ::\n"
                    + "::  3  -  MOSTRAR QUANTIDADE DE CONTAS                      ::\n"
                    + "::  4  -  PESQUISAR CONTAS POR MÊS DE ABERTURA              ::\n"
                    + "::  5  -  MOSTRAR A MÉDIA DE LIMITES                        ::\n"
                    + "::  6  -  MOSTRAR O MAIOR LIMITE                            ::\n"
                    + "::  7  -  MOSTRAR A MÉDIA DE SALDOS                         ::\n"
                    + "::  8  -  MOSTRAR O MENOR SALDO                             ::\n"
                    + "::  9  -  MOSTRAR TODOS OS DADOS DA AGÊNCIA                 ::\n"
                    + "::  10 -  PESQUISAR CONTA POR NÚMERO                        ::\n"
                    + "::  11 -  ALTERAR SALDO DA CONTA PESQUISANDO POR NÚMERO     ::\n"
                    + "::  12 -  REMOVER CONTA PESQUISANDO POR NÚMERO              ::\n"
                    + "::  13 -  EXCLUIR TODOS AS CONTAS                           ::\n"
                    + "::  0  -  SAIR                                              :: \n"
                    + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO: ");
            op = leia.nextByte();

            Tela.limparTela();

            switch (op) {
                case 1:
                    Conta c = new Conta();
                    boolean breaker = false;
                    System.out.print("::::::::::::::::::::CADASTRAMENTO DE CONTA::::::::::::::::::::");
                    do {
                        flag = false;
                        System.out.print("\n:: NÚMERO: ");
                        c.setNumero(leia.nextLong());
                        
                        if (a.pesquisarContaPorNumero(c.getNumero()) != null) {
                            do {
                                System.out.print("O número de conta inserido já existe."
                                        + "\n1 - Tentar novamente."
                                        + "\n2 - Cancelar cadastro."
                                        + "\nDigite aqui a opção: ");
                                op = leia.nextByte();
                                Tela.limparTela();
                                switch (op) {
                                    case 1:
                                        flag = true;
                                        break;
                                    case 2:
                                        breaker = true;
                                        break;
                                    default:
                                        System.out.print("\nOpção inválida. Tente novamente\n");
                                }
                            } while (op != 1 && op != 2);
                        }
                    } while (flag);
                    Tela.limparTela();
                    if (breaker) {
                        System.out.print("Cadastro de conta cancelado.\n\n");
                        break;
                    }

                    System.out.print(":: SALDO: ");
                    c.setSaldo(leia.nextDouble());
                    Tela.limparTela();
                    System.out.print(":: LIMITE: ");
                    c.setLimite(leia.nextDouble());
                    Tela.limparTela();
                    do {
                        flag = false;
                        System.out.print(Formatador.titulo("DATA DE ABERTURA")
                                + "\n:: DIA: ");
                        c.getDataDeAbertura().setDia(leia.nextByte());
                        System.out.print(":: MÊS: ");
                        c.getDataDeAbertura().setMes(leia.nextByte());
                        System.out.print(":: ANO: ");
                        c.getDataDeAbertura().setAno(leia.nextInt());
                        Tela.limparTela();
                        if (!(c.getDataDeAbertura().validaData())) {
                            System.out.print("Data inválida. Tente novamente.\n\n");
                            flag = true;
                        }
                    } while (flag);
                    
                    a.getContas().add(c);
                    System.out.print("Cadastro realizado com sucesso.\n\n");
                    break;
                case 2:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print(a.mostrarContas());
                    }
                    break;
                case 3:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print("No momento há " + a.getContas().size() + " contas cadastradas na agência.\n\n");
                    }
                    break;
                case 4:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        Agencia temp = new Agencia();
                        System.out.print(":::::::::::::PESQUISAR CONTAS POR MÊS DE ABERTURA:::::::::::::"
                                + "\n:: Insira o mês para pesquisar: ");
                        temp.setContas(a.pesquisarContaPorMesDeAbertura(leia.nextByte()));
                        Tela.limparTela();
                        if (temp.getContas().isEmpty()) {
                            System.out.print("Não foram encontradas contas com abertura no mês especificado.\n\n");
                            break;
                        }
                        System.out.print("::::::::::::::::::::::CONTAS ENCONTRADAS::::::::::::::::::::::\n\n"
                                + temp.mostrarContas());
                    }
                    break;
                case 5:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print("A média dos limites é: R$" + a.calcularMediaDeLimite() + "\n\n");
                    }
                    break;
                case 6:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print("O maior limite é: R$" + a.mostrarMaiorLimite() + "\n\n");
                    }
                    break;
                case 7:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print("A média dos saldos é: R$" + a.calcularMediaDeSaldo() + "\n\n");
                    }
                    break;
                case 8:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print("O menor saldo é: R$" + a.mostrarMenorSaldo() + "\n\n");
                    }
                    break;
                case 9:
                    System.out.print(a);
                    break;
                case 10:
                    r = "::::::::::::::::::PESQUISAR CONTA POR NÚMERO::::::::::::::::::";
                    esteCaso = false;
                case 11:
                    if (esteCaso) {
                        r = "::::::::ALTERAR SALDO DA CONTA PESQUISANDO POR NÚMERO:::::::::";
                        esteCaso = false;
                    }
                case 12:
                    if (esteCaso) {
                        r = ":::::::::::::REMOVER CONTA PESQUISANDO POR NÚMERO:::::::::::::";
                    }
                    esteCaso = true;
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print(r + "\n:: Insira o número da conta para pesquisa: ");
                        Conta ce = a.pesquisarContaPorNumero(leia.nextLong());
                        Tela.limparTela();
                        if (ce == null) {
                            System.out.print("Não há nenhuma conta com o número informado.\n\n");
                        } else {
                            switch (op) {
                                case 10:
                                    System.out.print(":::::::::::::::::::::::CONTA ENCONTRADA:::::::::::::::::::::::"
                                            + ce + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n");
                                    break;
                                case 11:
                                    System.out.print(":::::::::::::::::::::::CONTA ENCONTRADA:::::::::::::::::::::::"
                                            + ce + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                            + "\nInsira o novo saldo: ");
                                    ce.setSaldo(leia.nextDouble());
                                    Tela.limparTela();
                                    System.out.print("Saldo alterado com sucesso.\n\n");
                                    break;
                                case 12:
                                    System.out.print(":::::::::::::::::::::::CONTA ENCONTRADA:::::::::::::::::::::::"
                                            + ce
                                            + "::::::::::::::::::::::::EXCLUIR CONTA?::::::::::::::::::::::::"
                                            + "\n:: Tem certeza que deseja EXCLUIR a conta?                  ::"
                                            + "\n:: Para CONFIRMAR tecle 1.                                  ::"
                                            + "\n:: Para CANCELAR tecle outro número.                        ::"
                                            + "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                            + "\n:: Digite sua opção: ");
                                    op = leia.nextByte();
                                    Tela.limparTela();
                                    if (op == 1) {
                                        a.getContas().remove(ce);
                                        System.out.print("Conta removida com sucesso.\n\n");
                                    } else {
                                        System.out.print("Exclusão cancelada.\n\n");
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 13:
                    if (a.getContas().isEmpty()) {
                        System.out.print("Não há contas na agência.\n\n");
                    } else {
                        System.out.print(":::::::::::::::::::EXCLUIR TODAS AS CONTAS?:::::::::::::::::::"
                                + "\n:: Tem certeza que deseja EXCLUIR todas as contas?          ::"
                                + "\n:: Para CONFIRMAR tecle 1.                                  ::"
                                + "\n:: Para CANCELAR tecle outro número.                        ::"
                                + "\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                + "\n:: Digite sua opção: ");
                        op = leia.nextByte();
                        Tela.limparTela();
                        if (op == 1) {
                            a.getContas().clear();
                            System.out.print("Todas as contas foram excluídas com sucesso.\n\n");
                        } else {
                            System.out.print("Exclusão cancelada.\n\n");
                        }
                    }
                    break;
                case 0:
                    System.out.print("Programa encerrado.\n\n");
                    break;
                default:
                    System.out.print("\nOpção inválida. Tente novamente\n");
            }
        } while (op != 0);
    }
}

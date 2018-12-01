package projhotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Hotel h = new Hotel();

        System.out.print(":::::::::::::::::::::::::::HOTEL:::::::::::::::::::::::::::"
                + "\n:: NOME: ");
        h.setNome(leia.next());
        System.out.print(":: CNPJ: ");
        h.setCnpj(leia.nextLong());

        Tela.limparTela();

        byte op;
        do {
            System.out.print(":::::::::::::::::::::SISTEMA DE HOTELARIA::::::::::::::::::\n"
                    + "::  1  -  CADASTRAR HOSPEDE	                         ::\n"
                    + "::  2  -  MOSTRAR TODOS OS HOSPEDES                      ::\n"
                    + "::  3  -  MOSTRAR QUANTIDADE DE HOSPEDES                 ::\n"
                    + "::  4  -  PESQUISAR HOSPEDES POR SEXO                    ::\n"
                    + "::  5  -  PESQUISAR HOSPEDE POR CPF                      ::\n"
                    + "::  6  -  ALTERAR NOME POR CPF                           ::\n"
                    + "::  7  -  EXCLUIR HÓSPEDE POR CPF                        ::\n"
                    + "::  8  -  EXCLUIR TODOS OS HOSPEDES                      ::\n"
                    + "::  0  -  SAIR                                           ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO: ");
            op = leia.nextByte();

            Tela.limparTela();
            
            String r;
            
            switch (op) {
                case 1:
                    Hospede hos = new Hospede();
                    System.out.print(":::::::::::::::::::::CADASTRAR HOSPEDE:::::::::::::::::::::"
                            + "\n:: NOME: ");
                    hos.setNome(leia.next());

                    Tela.limparTela();

                    boolean flag = true;
                    boolean breaker = false;
                    do {
                        System.out.print(":: CPF: ");
                        hos.setCpf(leia.nextLong());

                        Tela.limparTela();

                        if (h.pesquisarHospedePorCpf(hos.getCpf()) != null) {
                            do {
                                System.out.print("O CPF informado já foi cadastrado."
                                        + "\n1 - Tentar novamente."
                                        + "\n2 - Cancelar cadastro."
                                        + "\nDigite a opção: ");
                                op = leia.nextByte();

                                Tela.limparTela();

                                switch (op) {
                                    case 1:
                                        break;
                                    case 2:
                                        breaker = true;
                                        flag = false;
                                        break;
                                    default:
                                        System.out.print("Opção inválida. Tente novamente\n\n");
                                }
                            } while (op != 1 && op != 2);
                        } else {
                            flag = false;
                        }
                    } while (flag);

                    if (breaker) {
                        System.out.print("Cadastro de hóspede cancelado.\n\n");
                        break;
                    }

                    do {
                        flag = false;
                        System.out.print(":: ESCOLHA O SEXO"
                                + "\n:: 1 - MASCULINO"
                                + "\n:: 2 - FEMININO"
                                + "\n:: DIGITE A OPÇÃO: ");
                        op = leia.nextByte();

                        Tela.limparTela();

                        switch (op) {
                            case 1:
                                hos.setSexo("Masculino");
                                break;
                            case 2:
                                hos.setSexo("Feminino");
                                break;
                            default:
                                System.out.print("Opção inválida. Tente novamente\n\n");
                                flag = true;
                        }
                    } while (flag);

                    h.getLista().add(hos);

                    System.out.print("Hospede cadastrado com sucesso.\n\n");
                    break;
                case 2:
                    System.out.print(h);
                    break;
                case 3:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hospedes para mostrar.\n\n");
                    } else {
                        r = "Estão cadastrados " + h.getLista().size() + " hóspedes.\n\n";
                        if (h.getLista().size() == 1) {
                            r = "Está cadastrado somente 1 hóspede.\n\n";
                        }
                        System.out.print(r);
                    }
                    break;
                case 4:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hospedes para pesquisar.\n\n");
                    } else {
                        String sexo = "";
                        do {
                            System.out.print(":::::::::::::::PESQUISA DE HÓSPEDES POR SEXO:::::::::::::::"
                                    + "\n:: 1 - MASCULINO                                         ::"
                                    + "\n:: 2 - FEMININO                                          ::"
                                    + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                    + "\n:: DIGITE A OPÇÃO DE PESQUISA: ");
                            op = leia.nextByte();

                            Tela.limparTela();

                            switch (op) {
                                case 1:
                                    sexo = "Masculino";
                                    break;
                                case 2:
                                    sexo = "Feminino";
                                    break;
                                default:
                                    System.out.print("\nOpção inválida. Tente novamente\n");
                            }
                        } while (op < 1 || op > 2);

                        ArrayList<Hospede> hospedesPorSexo = h.pesquisarHospedesPorSexo(sexo);

                        if (hospedesPorSexo.isEmpty()) {
                            System.out.print("Não há hospedes correspondentes a pesquisa.\n\n");
                        } else {
                            Hotel temp = new Hotel();
                            temp.setLista(hospedesPorSexo);
                            System.out.print("Foram encontrados " + hospedesPorSexo.size() + " hóspedes correspondentes a pesquisa." + temp.mostrarHospedes() + "\n\n");
                        }
                    }
                    break;
                case 5:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hospedes para pesquisar.\n\n");
                    } else {
                        System.out.print("::::::::::::::::PESQUISA DE HÓSPEDE POR CPF::::::::::::::::"
                                + "\n:: CPF para pesquisa: ");
                        Hospede hosPesquisado = h.pesquisarHospedePorCpf(leia.nextLong());

                        Tela.limparTela();

                        if (hosPesquisado == null) {
                            System.out.print("Não há nenhum hóspede com o CPF informado.\n\n");
                        } else {
                            System.out.print("::::::::::::::::::::::CPF ENCONTRADO:::::::::::::::::::::::"
                                    + hosPesquisado
                                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n");
                        }
                    }
                    break;
                case 6:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hóspedes para alterar.\n\n");
                    } else {
                        System.out.print("::::::::::::::ALTERAR NOME DE HÓSPEDE POR CPF::::::::::::::"
                                + "\n:: Informe o CPF do hóspede para alteração: ");
                        long cpf = leia.nextLong();
                        Hospede hosPesquisado = h.pesquisarHospedePorCpf(cpf);

                        Tela.limparTela();

                        if (hosPesquisado == null) {
                            System.out.print("Não há nenhum hóspede com o CPF informado.\n\n");
                        } else {
                            System.out.print("::::::::::::::ALTERAR NOME DE HÓSPEDE POR CPF::::::::::::::"
                                    + hosPesquisado
                                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                    + "\n:: Informe o novo nome: ");
                            hosPesquisado.setNome(leia.next());
                        }
                    }
                    break;
                case 7:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hóspedes para excluir.\n\n");
                    } else {
                        System.out.print("::::::::::::::::::EXCLUIR HÓSPEDE POR CPF::::::::::::::::::"
                                + "\n:: Informe o CPF do hóspede a ser excluído: ");
                        long cpf = leia.nextLong();
                        Hospede hosPesquisado = h.pesquisarHospedePorCpf(cpf);

                        Tela.limparTela();

                        if (hosPesquisado == null) {
                            System.out.print("Não há nenhum hóspede com o CPF informado.\n\n");
                        } else {
                            System.out.print("::::::::::::::::::EXCLUIR HÓSPEDE POR CPF::::::::::::::::::"
                                    + hosPesquisado
                                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                    + "\n:: Tem certeza que deseja EXCLUIR " + hosPesquisado.getNome() + "?" + Hospede.espacosToString(hosPesquisado.getNome(), 30)
                                    + "\n:: Para CONFIRMAR tecle 1.                               ::"
                                    + "\n:: Para CANCELAR tecle outro número.                     ::"
                                    + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                    + "\n:: Digite sua opção: ");
                            int confirma = leia.nextInt();
                            Tela.limparTela();
                            if (confirma == 1) {
                                h.getLista().remove(hosPesquisado);
                                System.out.print("Hóspede excluído com sucesso.\n\n");
                            } else {
                                System.out.print("Exclusão cancelada.\n\n");
                            }
                        }
                    }
                    break;
                case 8:
                    if (h.getLista().isEmpty()) {
                        System.out.print("Não há hóspedes para excluir.\n\n");
                    } else {
                        System.out.print(":::::::::::::::::::::EXCLUIR HÓSPEDES?:::::::::::::::::::::"
                                + "\n:: Tem certeza que deseja EXCLUIR todos os hóspedes?     ::"
                                + "\n:: Para CONFIRMAR tecle 1.                               ::"
                                + "\n:: Para CANCELAR tecle outro número.                     ::"
                                + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                                + "\n:: Digite sua opção: ");
                        int confirma = leia.nextInt();
                        Tela.limparTela();
                        if (confirma == 1) {
                            h.getLista().clear();
                            System.out.print("Todos os hóspedes foram excluídos com sucesso.\n\n");
                        } else {
                            System.out.print("Exclusão cancelada.\n\n");
                        }
                    }
                    break;
                case 0:
                    System.out.print("Programa encerrado.\n\n");
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente\n\n");
            }

        } while (op
                != 0);
    }
}

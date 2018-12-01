package projdiagramacarro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Revenda r = new Revenda();

        System.out.print("::::::::::::::::::::::::REVENDEDORA::::::::::::::::::::::::\n"
                + ":: NOME: ");
        r.setNome(leia.next());
        System.out.print(":: CNPJ: ");
        r.setCnpj(leia.nextLong());
        byte op;
        Tela.limparTela();
        do {
            System.out.print("::::::::::::::::::::::SISTEMA REVENDA::::::::::::::::::::::\n"
                    + "::  1 - CADASTRAR CARRO	                                 ::\n"
                    + "::  2 - MOSTRAR TODOS OS CARROS                          ::\n"
                    + "::  3 - MOSTRAR QUANTIDADE DE CARROS                     ::\n"
                    + "::  4 - CALCULAR O VALOR TOTAL DE CARROS NO PÁTIO        ::\n"
                    + "::  5 - EXCLUIR TODOS OS CARROS                          ::\n"
                    + "::  0 - SAIR                                             ::\n"
                    + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + "DIGITE A OPÇÃO: ");
            op = leia.nextByte();

            Tela.limparTela();

            switch (op) {
                case 1:
                    Carro c = new Carro();
                    System.out.print(":::::::::::::::::::::CADASTRO DE CARRO:::::::::::::::::::::\n"
                            + ":: MARCA: ");
                    c.setMarca(leia.next());
                    System.out.print(":: ANO: ");
                    c.setAno(leia.nextInt());
                    System.out.print(":: PLACA: ");
                    c.setPlaca(leia.next());
                    System.out.print(":: VALOR: ");
                    c.setValor(leia.nextDouble());

                    r.getLista().add(c);

                    Tela.limparTela();

                    System.out.print("Carro cadastrado com sucesso.\n\n");
                    break;
                case 2:
                    if (r.getLista().isEmpty()) {
                        System.out.print("Não há carros para mostrar.\n\n");
                    } else {
                        System.out.print(r);
                    }
                    break;
                case 3:
                    if (r.getLista().isEmpty()) {
                        System.out.print("Não há carros para mostrar.\n\n");
                    } else {
                        System.out.print("Quantidade de carros: " + r.getLista().size() + "\n\n");
                    }
                    break;
                case 4:
                    if (r.getLista().isEmpty()) {
                        System.out.print("Não há carros para calcular.");
                    } else {
                        System.out.print("O valor total dos carros é R$" + r.calcularValor() + ".\n\n");
                    }
                    break;
                case 5:
                    if (r.getLista().isEmpty()) {
                        System.out.print("Não há carros para excluir.");
                    } else {
                        System.out.print("::::::::::::::::::::::EXCLUIR CARROS?::::::::::::::::::::::"
                                + "\n:: Tem certeza que deseja EXCLUIR todos os carros?"
                                + "\n:: Para CONFIRMAR tecle 1."
                                + "\n:: Para CANCELAR tecle outro número."
                                + "\n:: Digite sua opção: ");
                        int confirma = leia.nextInt();
                        Tela.limparTela();
                        if (confirma == 1) {
                            r.getLista().clear();
                            System.out.print("Todos os carros foram excluídos com sucesso.\n\n");
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

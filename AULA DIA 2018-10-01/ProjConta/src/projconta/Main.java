package projconta;
import java.util.Scanner;

public class Main {
    public static Scanner leia = new Scanner(System.in);
    public static Conta c1 = new Conta();
    public static Conta c2 = new Conta();
    
    public static void main(String[] args) {
        System.out.print("Informe os dados da conta 1"
                + "\nNome: ");
        c1.nome = leia.next();
        System.out.print("Saldo: ");
        c1.saldo = leia.nextDouble();
        System.out.print("CPF: ");
        c1.cpf = leia.next();
        System.out.print("Tipo de conta: ");
        c1.tipo = leia.next();
        do{
            System.out.print("\fSenha: ");
            c1.senha = leia.nextInt();
            System.out.print("\fConfirmação da senha: ");
            if(c1.senha == leia.nextInt()){
                break;
            } else {
                System.out.print("\nSenhas não se correspondem. Tente novamente\n");
            }
        } while(true);
        
        System.out.print("Informe os dados da conta 2"
                + "\nNome: ");
        c2.nome = leia.next();
        System.out.print("Saldo: ");
        c2.saldo = leia.nextDouble();
        System.out.print("CPF: ");
        c2.cpf = leia.next();
        System.out.print("Tipo de conta: ");
        c2.tipo = leia.next();
        do{
            System.out.print("\fSenha: ");
            c2.senha = leia.nextInt();
            System.out.print("\fConfirmação da senha: ");
            if(c2.senha == leia.nextInt()){
                break;
            } else {
                System.out.print("\nSenhas não se correspondem. Tente novamente\n");
            }
        } while(true);
        
        byte op;
        boolean flag = true;
        
        do{
            System.out.print("\fEscolha a conta para login: "
                    + "\n1 - Conta 01."
                    + "\n2 - Conta 02."
                    + "\n0 - Encerrar programa."
                    + "\nEscolha a ação: ");
            op = leia.nextByte();
            
            System.out.print("\f");            
            switch(op){
                case 1:
                    System.out.print("Insira a senha: ");
                    if(c1.logar(leia.nextInt())){
                        Main.acoesConta(c1);
                    } else {
                        System.out.print("\nSenha incorreta.\n");
                    }
                    break;
                case 2:
                    System.out.print("Insira a senha: ");
                    if(c2.logar(leia.nextInt())){
                        Main.acoesConta(c2);
                    } else {
                        System.out.print("\nSenha incorreta.\n");
                    }
                    break;
                case 0:
                    System.out.print("\n\nPrograma encerrado.");
                    flag = false;
                    break;
                default:
                    System.out.print("\nConta inválida. Tente novamente.\n");
            }
        }while(flag);
    }
    
    public static void acoesConta(Conta contaAtual){
        byte op;
        boolean flag = true;
        do {
            System.out.print("\n");
            System.out.print("\n\n\fEscolha uma ação abaixo: "
                    + "\n1 - Sacar dinheiro."
                    + "\n2 - Depositar dinheiro."
                    + "\n3 - Transferir dinheiro."
                    + "\n4 - Mostrar saldo."
                    + "\n0 - Sair da conta."
                    + "\nEscolha a ação: ");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    System.out.print("\n\fInforme o valor de saque: R$");
                    if(contaAtual.sacar(leia.nextDouble())){
                        System.out.print("\nOperação realizada com sucesso.\n");
                    } else {
                        System.out.print("\nOperação falhou. Saldo insuficiente.\n");
                    }
                    break;
                case 2:
                    System.out.print("\n\fInforme o valor de depósito: R$");
                    contaAtual.depositar(leia.nextDouble());
                    System.out.print("\nOperação realizada com sucesso.\n");
                    break;
                case 3:
                    if(contaAtual == c1){
                        System.out.print("\n\fEscolha a conta para transferência: "
                                + "\n2 - Conta 02."
                                + "\nEscolha a conta: ");
                        if(leia.nextInt() == 2){
                            System.out.print("\nInforme o valor da transferência: R$");
                            if(contaAtual.transferir(leia.nextDouble(), c2)){
                                System.out.print("\nOperação realizada com sucesso.\n");
                                break;
                            }
                        } else {
                            System.out.println("\nOperação falhou. Conta inexistente.\n");
                            break;
                        }
                    } else {
                        System.out.print("\n\fEscolha a conta para transferência: "
                                + "\n1 - Conta 01."
                                + "\nEscolha a conta: ");
                        if(leia.nextInt() == 1){
                            System.out.print("\nInforme o valor da transferência: R$");
                            if(contaAtual.transferir(leia.nextDouble(), c1)){
                                System.out.print("\nOperação realizada com sucesso.\n");
                                break;
                            }
                        } else {
                            System.out.println("\nOperação falhou. Conta inexistente.\n");
                            break;
                        }
                    }
                    System.out.println("\nOperação falhou. Saldo insuficiente.\n");
                    break;
                case 4:
                    System.out.println("\nO saldo atual é de: R$" + contaAtual.saldo + "\n");
                    break;
                case 0:
                    System.out.println("\n\nVocê saiu de sua conta com sucesso.\n");
                    flag = false;
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente\n");
            }
        } while (flag);
    }
}
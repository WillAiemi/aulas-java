package projconta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        System.out.print("Informe os dados da conta 1"
                + "Nome: ");
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
                + "Nome: ");
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
                    + "\nEscolha a conta: ");
            op = leia.nextByte();
            
            System.out.print("\f");            
            switch(op){
                case 1:
                    System.out.print("Insira a senha: ");
                    if(c1.logar(leia.nextInt())){
                        
                    } else {
                        System.out.print("\nSenha incorreta.\n");
                    }
                    break;
                case 2:
                    System.out.print("Insira a senha: ");
                    if(c2.logar(leia.nextInt())){
                        
                    } else {
                        System.out.print("\nSenha incorreta.\n");
                    }
                    break;
                default:
                    System.out.print("\nConta inválida. Tente novamente.\n");
            }
        }while(flag);
    }
    public boolean acoesConta(Conta contaAtual){
        return true;
    }
}

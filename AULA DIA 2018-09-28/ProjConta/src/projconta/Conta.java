package projconta;

public class Conta {
    public String nome;
    public double saldo;
    public String cpf;
    public int senha;
    public String tipo;
    
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }
    public boolean logar(int senha){
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}

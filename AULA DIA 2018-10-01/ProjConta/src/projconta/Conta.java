package projconta;

public class Conta {
    public String nome;
    public double saldo;
    public String cpf;
    public int senha;
    public String tipo;
    
    public boolean sacar(double valor){
        if(valor <= this.saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public boolean transferir(double valor, Conta conta){
        if(this.sacar(valor) == true){
            conta.depositar(valor);
            return true;
        }
        return false;        
    }
    public boolean logar(int senha){
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}

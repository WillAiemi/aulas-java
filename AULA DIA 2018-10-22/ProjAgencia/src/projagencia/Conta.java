package projagencia;

public class Conta {
    private long numero;
    private double saldo;
    private double limite;
    private Data dataDeAbertura;
    
    public Conta(){
        this.dataDeAbertura = new Data();
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    
    

    @Override
    public String toString() {
        return "\n"
                + ":: NÚMERO: " + numero + Formatador.espacosToString(Long.toString(this.numero), 6)+ "\n"
                + ":: SALDO: R$" + saldo + Formatador.espacosToString(Double.toString(this.saldo), 7)+ "\n"
                + ":: LIMITE: R$" + limite + Formatador.espacosToString(Double.toString(this.limite), 8)+ "\n"
                + ":: DATA DE ABERTURA: " + dataDeAbertura + Formatador.espacosToString(this.dataDeAbertura.toString(), 16)+ "\n";
    }
    
    
}

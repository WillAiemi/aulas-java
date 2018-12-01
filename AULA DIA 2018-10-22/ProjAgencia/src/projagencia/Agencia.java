package projagencia;

import java.util.ArrayList;

public class Agencia {

    private long numero;
    private String nome;
    private ArrayList<Conta> contas;

    public Agencia() {
        this.contas = new ArrayList<>();
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public String mostrarContas() {
        String r = "";
        for (int i = 0; i < this.contas.size(); i++) {
            if (i < 9) {
                r += "\n:::::::::::::::::::::::::::CONTA " + (i + 1) + "::::::::::::::::::::::::::::";
            } else {
                r += "\n:::::::::::::::::::::::::::CONTA " + (i + 1) + ":::::::::::::::::::::::::::";
            }
            r += this.contas.get(i) + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
        }
        r += "\n";
        return r;
    }

    public Conta pesquisarContaPorNumero(long numero) {
        for (int i = 0; i < this.contas.size(); i++) {
            if (numero == this.contas.get(i).getNumero()) {
                return this.contas.get(i);
            }
        }
        return null;
    }

    public ArrayList<Conta> pesquisarContaPorMesDeAbertura(byte mes) {
        ArrayList<Conta> le = new ArrayList<>();
        for (int i = 0; i < this.contas.size(); i++) {
            if (this.contas.get(i).getDataDeAbertura().getMes() == mes) {
                le.add(this.contas.get(i));
            }
        }
        return le;
    }

    public double mostrarMaiorLimite() {
        double maiorLimite = 0;
        for (Conta conta : this.contas) {
            if (conta.getLimite() > maiorLimite) {
                maiorLimite = conta.getLimite();
            }
        }
        return maiorLimite;
    }

    public double mostrarMenorSaldo() {
        double menorSaldo = Double.MAX_VALUE;
        for (Conta conta : this.contas) {
            if (conta.getSaldo() < menorSaldo) {
                menorSaldo = conta.getSaldo();
            }
        }
        return menorSaldo;
    }

    public double calcularMediaDeLimite() {
        double mediaDosLimites = 0;
        for (Conta conta : this.contas) {
            mediaDosLimites += conta.getLimite();
        }
        mediaDosLimites /= this.contas.size();
        return mediaDosLimites;
    }

    public double calcularMediaDeSaldo() {
        double mediaDosSaldos = 0;
        for (Conta conta : this.contas) {
            mediaDosSaldos += conta.getSaldo();
        }
        mediaDosSaldos /= this.contas.size();
        return mediaDosSaldos;
    }

    @Override
    public String toString() {
        String r = ":::::::::::::::::::::::DADOS DA AGÊNCIA:::::::::::::::::::::::\n"
                + ":: NÚMERO: " + numero + Formatador.espacosToString(Long.toString(numero), 6) +"\n"
                + ":: NOME: " + nome + Formatador.espacosToString(nome, 4)+ "\n"
                + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n";
        if (this.contas.isEmpty()) {
            r += "Não há contas para mostrar.\n\n";
        } else {
            r += mostrarContas() + "\n\n";
        }
        return r;
    }

}

package projdiagramacarro;

import java.util.ArrayList;

public class Revenda {
    private String nome;
    private long cnpj;
    private ArrayList<Carro> lista;
    
    public Revenda(){
        lista = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Carro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Carro> lista) {
        this.lista = lista;
    }
    
    public String mostrarCarros(){
        String r = "\n";
        for (int i = 0; i < this.lista.size(); i++) {
            if (i<9) {
                r += "\n::::::::::::::::::::::::::CARRO " + (i+1) +"::::::::::::::::::::::::::";
            } else {
                r += "\n::::::::::::::::::::::::::CARRO " + (i+1) +":::::::::::::::::::::::::";
            }
            r += this.lista.get(i) + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
        }
        return r;
    }
    
    public double calcularValor(){
        double calc = 0;
        for (int i = 0; i < this.lista.size(); i++) {
            calc += this.lista.get(i).getValor();
        }
        return calc;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "CNPJ: " + this.cnpj + "\n"
                + this.mostrarCarros() + "\n";
    }
    
}

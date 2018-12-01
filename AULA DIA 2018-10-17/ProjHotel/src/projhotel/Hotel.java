package projhotel;

import java.util.ArrayList;

public class Hotel {

    private String nome;
    private long cnpj;
    private ArrayList<Hospede> lista;

    public Hotel() {
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

    public ArrayList<Hospede> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Hospede> lista) {
        this.lista = lista;
    }

    public Hospede pesquisarHospedePorCpf(long cpf) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getCpf() == cpf) {
                return this.lista.get(i);
            }
        }
        return null;
    }

    public ArrayList<Hospede> pesquisarHospedesPorSexo(String sexo) {
        ArrayList<Hospede> hospedes = new ArrayList<>();
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getSexo().equalsIgnoreCase(sexo)) {
                hospedes.add(this.lista.get(i));
            }
        }
        return hospedes;
    }

    public String mostrarHospedes() {
        String r = "\n";
        for (int i = 0; i < this.lista.size(); i++) {
            if (i < 9) {
                r += "\n:::::::::::::::::::::::::HOSPEDE " + (i + 1) + ":::::::::::::::::::::::::";
            } else {
                r += "\n:::::::::::::::::::::::::HOSPEDE " + (i + 1) + "::::::::::::::::::::::::";
            }
            r += this.lista.get(i) + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
        }
        return r;
    }

    @Override
    public String toString() {
        return ":::::::::::::::::::::::::::HOTEL:::::::::::::::::::::::::::\n"
                + ":: NOME: " + nome + this.lista.get(0).espacosToString(nome, 4) + "\n"
                + ":: CNPJ: " + cnpj + this.lista.get(0).espacosToString(Long.toString(cnpj), 4) + "\n"
                + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + this.mostrarHospedes() + "\n";
    }

}

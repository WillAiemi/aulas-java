package projcomprasonline;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private long cnpj;
    private ArrayList<Livro> lista;
    
    public Biblioteca(){
        lista = new ArrayList<Livro>();
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

    public ArrayList<Livro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Livro> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Lista de livros" + lista + "\n";
    }
    
    
}

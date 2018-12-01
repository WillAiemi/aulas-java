package projassociacao;

public class Biblioteca {

    private String nome;
    private long cnpj;
    private Livro livro1;
    private Livro livro2;

    public Biblioteca() {
        this.livro1 = new Livro();
        this.livro2 = new Livro();
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

    public Livro getLivro1() {
        return livro1;
    }

    public void setLivro1(Livro livro1) {
        this.livro1 = livro1;
    }

    public Livro getLivro2() {
        return livro2;
    }

    public void setLivro2(Livro livro2) {
        this.livro2 = livro2;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Livro 1: " + livro1.toString() + "\n"
                + "Livro 2: " + livro2.toString() + "\n";
    }

}

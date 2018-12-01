package projcomprasonline;
public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private double valorUnitario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "\n"
                + "Título: " + this.titulo + "\n"
                + "Gênero: " + this.genero + "\n"
                + "Autor: " + this.autor + "\n"
                + "Valor unitário: R$" + this.valorUnitario;
    }
    
    
}

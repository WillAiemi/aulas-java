package projassociacao;

public class Livro {

    private String titulo;
    private String genero;
    private String autor;
    private String isbn;

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\n"
                + "Titulo: " + titulo + "\n"
                + "Gênero: " + genero + "\n"
                + "Autor: " + autor + "\n"
                + "ISBN: " + isbn + "\n";
    }

}

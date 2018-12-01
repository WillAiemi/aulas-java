package projbibliotecareal;

public class Livro {

    private String titulo;
    private String genero;
    private String autor;
    protected boolean status;

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

    public String mostrarStatus() {
        if (this.status) {
            return "Disponível";
        }
        return "Locado";
    }

    @Override
    public String toString() {
        return "\nTítulo: " + titulo + "\n"
                + "Gênero: " + genero + "\n"
                + "Autor: " + autor + "\n"
                + "Situação: " + mostrarStatus();
    }

}

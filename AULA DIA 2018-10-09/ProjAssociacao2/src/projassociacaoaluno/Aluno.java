package projassociacaoaluno;

public class Aluno {

    private String nome;
    private byte idade;
    private Avaliacao avaliacao1;
    private Avaliacao avaliacao2;

    public Aluno() {
        avaliacao1 = new Avaliacao();
        avaliacao2 = new Avaliacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public Avaliacao getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(Avaliacao avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public Avaliacao getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(Avaliacao avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }
    
    public double calcularMedia(){
        return (this.avaliacao1.getNota()+this.avaliacao2.getNota())/2;
    }
    
    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "\nAvaliação 1: " + avaliacao1 + "\n"
                + "\nAvaliação 2: " + avaliacao2 + "\n"
                + "Média: " + calcularMedia() + "\n";
    }

}

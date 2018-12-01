package projnadador;

public class Nadador {

    private String nome;
    private byte idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public byte getIdade() {
        return this.idade;
    }

    public String classificarNadador() {
        if (this.idade >= 8 || this.idade <= 60) {
            if (this.idade <= 10) {
                return "Infantil";
            } else if (this.idade <= 17) {
                return "Juvenil";
            } else if (this.idade <= 49) {
                return "Adulto";
            } else {
                return "Terceira idade";
            }
        }
        return "Não pode ser nadador. Mínimo 8 anos e no máximo 60";
    }

    public String toString() {
        return "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "Classificação: " + this.classificarNadador() + "\n";
    }
}

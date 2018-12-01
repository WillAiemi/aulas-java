package projendereco;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return this.rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String toString() {
        return "\n"
                + "Rua: " + this.rua + "\n"
                + "Número: " + this.numero + "\n"
                + "Complemento: " + this.complemento + "\n"
                + "Bairro: " + this.bairro + "\n"
                + "CEP: " + this.cep + "\n"
                + "Cidade: " + this.cidade + "\n";
    }
}

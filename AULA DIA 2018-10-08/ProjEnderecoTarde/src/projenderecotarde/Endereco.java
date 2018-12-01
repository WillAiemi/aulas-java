package projenderecotarde;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String email;
    private String emailAlternativo;

    public Endereco(String rua, int numero, String bairro, String cep, String email) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.email = email;
        this.complemento = "Casa";
        this.cidade = "Canoas";
        this.uf = "RS";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public String toString() {
        return "\n"
                + "Rua: " + this.rua + "\n"
                + "Número: " + this.numero + "\n"
                + "Complemento: " + this.complemento + "\n"
                + "Bairro: " + this.bairro + "\n"
                + "Cep: " + this.cep + "\n"
                + "Cidade: " + this.cidade + "\n"
                + "UF: " + this.uf + "\n"
                + "Email: " + this.email + "\n"
                + "Email alternativo: " + this.emailAlternativo + "\n";
    }

}

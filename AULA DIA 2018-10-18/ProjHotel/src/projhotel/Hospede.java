package projhotel;

public class Hospede {

    private String nome;
    private long cpf;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public static String espacosToString(String z, int x) {
        int espacos = 52 - x - z.length();
        String r = "";
        for (int i = 0; i < espacos; i++) {
            r += " ";
        }
        r += "::";
        return r;
    }

    @Override
    public String toString() {
        return "\n"
                + ":: NOME: " + nome + espacosToString(this.nome, 4) + "\n"
                + ":: CPF: " + cpf + espacosToString(Long.toString(this.cpf), 3) + "\n"
                + ":: SEXO: " + sexo + espacosToString(this.sexo, 4) + "\n";
    }

}

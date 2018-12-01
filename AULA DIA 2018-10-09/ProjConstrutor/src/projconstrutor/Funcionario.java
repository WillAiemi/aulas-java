package projconstrutor;
public class Funcionario {
    private String nome;
    private long cpf;
    private String rg;
    private String email;
    private String celular;
    private String foneResidencial;
    private String emailAlternativo;
    private double salario;

    public Funcionario(String nome, long cpf, String rg, String email, String celular, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.celular = celular;
        this.salario = salario;
        this.foneResidencial = "xxxx-xxxx";
        this.emailAlternativo = "@";
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFoneResidencial() {
        return foneResidencial;
    }

    public void setFoneResidencial(String foneResidencial) {
        this.foneResidencial = foneResidencial;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "CPF: " + cpf + "\n"
                + "RG: " + rg + "\n"
                + "Email: " + email + "\n"
                + "Celular: " + celular + "\n"
                + "Telefone residencial: " + foneResidencial + "\n"
                + "Emailalternativo: " + emailAlternativo + "\n"
                + "Salário: " + salario + "\n";
    }
    
    
}

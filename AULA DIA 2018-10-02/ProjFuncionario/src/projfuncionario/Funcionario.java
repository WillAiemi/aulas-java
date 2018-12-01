package projfuncionario;

public class Funcionario {

    private String nome;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public String mostrarTudo() {
        return "\nNome: " + this.nome
                + "\nSalário: " + this.salario;
    }
}

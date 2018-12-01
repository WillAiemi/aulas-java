package projfuncionario;

public class Funcionario {
    public String nome;
    public double valorHora;
    public double cargaHorariaMes;
    
    public double calcularSalario(){
        return valorHora*cargaHorariaMes;
    }
}

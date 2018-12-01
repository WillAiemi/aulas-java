import java.util.*;
public class Funcionario{
    private String nome;
    private double [] salarios = new double[12];
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){ 
        return nome;
    }
    
    public void setSalarios(double salarios[]){
        this.salarios = salarios;
    }
    
    public double[] getSalarios(){
        return salarios;
    }
    
    public void cadastrarSalario(int indice, double salario){
        this.salarios[indice] = salario;
    }
    
    public double calcular13Salario(){
        double decimoTerceiro = 0;
        for(int i = 0; i<12;i++){
            decimoTerceiro += salarios[i];
        }
        decimoTerceiro /= 12;
        return decimoTerceiro;
    }
    
    public double calcularFerias(){
        double ferias = calcular13Salario() * 4/3;
        return ferias;
    }
    
    public double mostrarMaiorSalario(){
        double maiorSalario = 0;
        for (int i = 0; i < 12; i++){
            if(salarios[i] > maiorSalario){
                maiorSalario = salarios[i];
            }
        }
        return maiorSalario;
    }
    
    public String toString(){
        return "\fNome: " + getNome() +
                "\nSalários: " + Arrays.toString(this.salarios) +
                "\nDécimo terceiro: " + calcular13Salario() +
                "\nFérias: " + calcularFerias() +
                "\nMaior salário: " + mostrarMaiorSalario();
    }
}
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
        return this.salarios = salarios;
    }
    
    public double[] getSalarios(){
        return salarios;
    }
    
    public void cadastrarSalario(int indice, double salario){
        return;
    }
    
    public double calcularDecimo13Salario(){
        return;
    }
    
    public double calcularFerias(){
        return;
    }
    
    public double mostrarMaiorSalario(){
        return;
    }
    
    public String toString(){
        return;
    }
}
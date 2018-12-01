
package projaluno;


public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }
    public String verificarSituacao(){
        if(calcularMedia() >= 6){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
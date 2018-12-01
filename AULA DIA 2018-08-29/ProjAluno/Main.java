public class Main{
    public static void main(String [] args){
        String nome;
        int ra;
        double nota1;
        double nota2;
        double media;
        String resultado;
        
        nome = "Willo";
        ra = 38139123;
        nota1 = 6;
        nota2 = 5;
        
        media = (nota1+nota2)/2;
        if (media>6.0){
            resultado = "aprovado";
        } else{
            resultado = "reprovado";
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.print("Resultado: " + resultado);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira os dados do participante\n"
                +"Nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Idade: ");
        byte idade = leia.nextByte();
        
        String mensagem = "Não pode ser nadador, mínimo 8 anos e no máximo 60.";
        
        if (idade >= 8 && idade <= 60) {
            if(idade <= 10){
                mensagem = "Infantil.";
            } else if (idade <= 17) {
                mensagem = "Juvenil.";
            } else if (idade <= 49) {
                mensagem = "Adulto.";
            } else {
                mensagem = "Terceira idade.";
            }
        }
        
        System.out.print("\fDados do participante" +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCategoria: " + mensagem);
    }
}
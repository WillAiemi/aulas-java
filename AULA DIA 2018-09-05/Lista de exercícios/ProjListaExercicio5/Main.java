import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        float comissao;
        
        System.out.print("\fInsira os dados do vendedor\n" +
            "Nome: ");
        String nome = leia.next();
        
        System.out.print("Meta de vendas: R$");
        float meta = leia.nextFloat();
        
        System.out.print("Total vendido: R$");
        float totalVendido = leia.nextFloat();
        
        float relacaoMetaVendas = totalVendido/meta;
        
        if(relacaoMetaVendas < 0.5){
            comissao = totalVendido * 0.01f;
        } else if (relacaoMetaVendas <= 0.75) {
            comissao = totalVendido * 0.025f;
        } else if (relacaoMetaVendas <= 1) {
            comissao = totalVendido * 0.035f;
        } else {
            comissao = totalVendido * 0.05f;
        }
        
        System.out.print("\fDados do vendedor" +
                "\nNome: " + nome +
                "\nMeta: R$" + meta +
                "\nTotal vendido: R$" + totalVendido +
                "\nComissão: R$" + comissao);
    }
}
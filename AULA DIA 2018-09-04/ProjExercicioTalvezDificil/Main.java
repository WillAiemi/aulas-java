import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira os dados do funcionário");
        System.out.print("Nome: ");
        String nome = leia.nextLine();

        System.out.print("CPF: ");
        long cpf = leia.nextLong();

        System.out.print("RG: ");
        String rg = leia.next();

        System.out.print("Cargo: ");
        String cargo = leia.next();

        System.out.print("Sexo: ");
        String sexo = leia.next();

        System.out.print("Quantidade de dependentes: ");
        byte qtdDependentes = leia.nextByte();

        System.out.print("Quantidade de filhos: ");
        byte qtdFilhos = leia.nextByte();

        System.out.print("Valor hora: ");
        float valorHora = leia.nextFloat();

        System.out.print("Carga horária: ");
        int cargaHoraria = leia.nextInt();

        System.out.print("Ganha vale transporte?(S/N)");
        String ganhaVT = leia.next();
        float salarioBruto = valorHora * cargaHoraria;
        float valeTransporte;
        if (ganhaVT.equalsIgnoreCase("s")){
            valeTransporte = salarioBruto * 0.06f;
        } else {
            valeTransporte = 0;
        }
        float inss = salarioBruto * 0.11f;
        float salarioFamilia = salarioBruto * 0.03f * qtdFilhos;
        float planoSaude = salarioBruto * (0.005f + 0.01f * qtdDependentes);
        float salarioLiquido = salarioBruto - valeTransporte - inss + salarioFamilia - planoSaude;

        System.out.print("\f");
        System.out.println("---Dados do funcionário---" +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nCargo: " + cargo +
                "\nSexo: " + sexo +
                "\nQuantidade de dependentes: " + qtdDependentes +
                "\nQuantidade de filhos: " + qtdFilhos +
                "\nValor hora: " + valorHora +
                "\nCarga horária: " + cargaHoraria +
                "\nValor do salário bruto: R$" + salarioBruto +
                "\nValor do vale transporte: R$" + valeTransporte +
                "\nValor do INSS: R$" + inss +
                "\nValor do salário família: R$" + salarioFamilia +
                "\nValor do plano de saúde: R$" + planoSaude +
                "\nValor do salário líquido: R$" + salarioLiquido);
    }
}
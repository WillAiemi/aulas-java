import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String nome;
        String cpf;
        long rg;
        String cargo;
        String sexo;
        int quantidadeFilhos;
        int quantidadeDependentes;
        double valorHora;
        int horasTrabalhadas;
        String ganhaValeT;
        double salarioBruto;
        double valeTransporte;
        double inss;
        double salarioFamilia;
        double planoSaude;
        double salarioLiquido;
        
        System.out.println("Insira os dados do funcionário");
        System.out.print("Nome: ");
        nome = leia.nextLine();
        System.out.print("CPF: ");
        cpf = leia.nextLine();
        System.out.print("RG: ");
        rg = leia.nextLong();
        System.out.print("Cargo: ");
        cargo = leia.next();
        System.out.print("Sexo: ");
        sexo = leia.next();
        System.out.print("Quantidade de filhos: ");
        quantidadeFilhos = leia.nextInt();
        System.out.print("Quantidade de dependentes: ");
        quantidadeDependentes = leia.nextInt();
        System.out.print("Valor hora: ");
        valorHora = leia.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = leia.nextInt();
        System.out.print("Ganha vale transporte?(S/N)");
        ganhaValeT = leia.next();
        
        salarioBruto = valorHora*horasTrabalhadas;
        if (ganhaValeT == "S"){
            valeTransporte = salarioBruto*0.06;
        }
        else {
            valeTransporte = 0;
        }
        inss = salarioBruto*0.11;
        salarioFamilia = salarioBruto*0.03*quantidadeFilhos;
        planoSaude = salarioBruto*(0.005+0.01*quantidadeDependentes);
        salarioLiquido = salarioBruto-valeTransporte-inss+salarioFamilia-planoSaude;
        
        System.out.print("\f");
        System.out.println("---Dados do funcionário---\n"+
            "Nome: "+nome+
            "\nCPF: "+cpf+
            "\nRG: "+rg+
            "\nCargo"+cargo+
            "\nSexo"+sexo+
            "\nQuantidade de dependentes: "+quantidadeDependentes+
            "\nQuantidade de filhos: "+quantidadeFilhos+
            "\nValor hora: "+valorHora+
            "\nQuantidade de horas trabalhadas: "+horasTrabalhadas+
            "\nValor do salário bruto: R$"+salarioBruto+
            "\nValor do vale transporte: R$"+valeTransporte+
            "\nValor do INSS: R$"+inss+
            "\nValor do salário família: R$"+salarioFamilia+
            "\nValor do plano de saúde: R$"+planoSaude+
            "\nValor do salário líquido: R$"+salarioLiquido);
    }
}
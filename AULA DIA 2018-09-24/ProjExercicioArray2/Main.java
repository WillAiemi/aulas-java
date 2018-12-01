import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double [] salarios = new double[12];
        double maiorSalario = 0;
        double salario13 = 0;
        double ferias;
        
        System.out.println("Informe os salários do funcionário: ");
        for(int i = 0; i < 12; i++){
            System.out.print("Mês "+(i+1)+": ");
            salarios[i] = leia.nextDouble();
            
            salario13 += salarios[i];
            
            if(salarios[i]>maiorSalario){
                maiorSalario = salarios[i];
            }
        }
        
        salario13 /= 12;
        ferias = salario13*4/3;
        
        System.out.print("\fSalários: "+Arrays.toString(salarios) +
                "\n13º Salário: R$" + salario13 +
                "\nFérias: R$" + ferias +
                "\nMaior salário: R$" + maiorSalario);
    }
}
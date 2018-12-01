import java.util.*;
public class Main{
    public static void main(String [] args){
        Funcionario f = new Funcionario();
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe os dados do funcionário: " +
                "\nNome: ");
        f.setNome(leia.next());
        
        System.out.print("Salários: \n");
        for(int i = 0; i < 12; i++){
            System.out.print((i+1)+"º mês: ");
            f.cadastrarSalario(i,leia.nextDouble());
        }
        
        System.out.print(f.toString());
    }
}
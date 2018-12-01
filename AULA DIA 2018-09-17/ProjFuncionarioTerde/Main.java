import java.util.Scanner; //importar a classe de Scanner para o usuario inserir dados no programa
public class Main{ //criar a classe
    public static void main(String [] args){ //criar o objeto que executará o programa
        Scanner leia = new Scanner(System.in); //criar o objeto que será usado para o usuário poder inserir dados no programa
        String nome; //declaração do objeto nome
        double valorPassagem = 0; //declaração da variável do valor da passagem já inicializada para que o programa não dê erro no final
        double valorHora; //declaração da variável do valor hora
        double cargaHoraria; //declaração da variável da carga horária
        //linha em branco
        double salarioBruto; //declaração da variável do salário bruto
        double valorVT = 0; //declaração da variável do valor do Vale-Transporte já inicializada para que o programa não dê erro no final
        double insalubridade = 0; //declaração da variável da insalubridade já inicializada para que o programa não dê erro no final
        double inss; //declaração da variável do INSS
        double salarioLiquido; //declaração da variável do salário líquido
        //linha em branco
        System.out.print("Informe os dados do funcionário\n"
                +"Nome: "); //escrever na tela pedindo para que o usuário informe o nome
        nome = leia.next(); //colocar os dados que o usuário digitou dentro da variavel nome
        //linha em branco
        System.out.print("Valor hora: "); //escrever na tela pedindo para que o usuário agora informe o valor hora
        valorHora = leia.nextDouble(); //colocar os dados que o usuário digitou dentro da variável valorHora
        //linha em branco
        System.out.print("Carga horáia: "); //escrever na tela pedindo para que o usuário agora informe a carga horária
        cargaHoraria = leia.nextDouble(); //colocar os dados que o usuário digitou dentro da variável cargaHoraria
        //linha em branco
        byte op; //declaração da variável que servirá para que o usuário escolha a opção desejada nos menus
        //linha em branco
        salarioBruto = valorHora*cargaHoraria; //calculo do salário bruto
        //linha em branco
        do{ //método do, laço de repetição que ocorrerá enquanto um argumento for verdadeiro
            System.out.print(":::::::::::::MENU VT::::::::::::\n"
                    +"Escolha uma opção abaixo:\n"
                    +"1 - Ganha VT\n"
                    +"2 - Não ganha VT\n"
                    +"Digite aqui a opção desejada: ");//escrever na tela as opções que o usuário tem no menu
            op = leia.nextByte(); //colocar os dados que o usuário digitou dentroda variável op
            //linha em branco
            System.out.print("\f"); //limpar a tela
            //linha em branco
            switch(op){ //método switch, dependendo do que estiver dentro da variável op, ele entrará no caso 1, caso 2, ou irá direto para o default
                case 1: //caso a variável op tenha o valor 1 dentro dela, o programa executará o bloco de código abaixo
                    System.out.print("Informe o valor das passagens: "); //escreva na tela para que o usuário informe o valor das passagens
                    valorPassagem = leia.nextDouble(); //colocar os dados que o usuário digitou dentro da variável valorPassagem
                    //linha em branco
                    valorVT = salarioBruto * 0.06; //cálculo do valor do vale-transporte
                    //linha em branco
                    if(valorVT > valorPassagem){ //se o valor do vale transporte for maior que o valor da passagem, ele executára o codigo abaixo, caso contrário, não executará o bloco de código abaixo
                        valorVT = valorPassagem; //valorVT agora possui o valor contido dentro da variável valorPassagem
                    } //final do bloco de código do método if              
                    break; //fazer o programa parar de executar o método switch
                case 2: //caso a variável op tenha o valor 2 dentro dela, o programa executará o bloco de código abaixo
                    break; //fazer o programa parar de executar o método switch
                default: //caso a variável op não possua nem o valor 1 nem o valor 2, será executado o bloco de codigo abaixo         
                    System.out.println("\nOpção inválida\n"
                            +"Digite novamente\n"); //escrever na tela que o usuário não digitou um dos valores pedidos e que ele deve tentar novamente
            } //final do bloco de código do método switch
        }while(op < 1 || op > 2); //final do bloco de código do método do, e, caso os argumentos dentro do método while forem verdadeiros, ele executará o bloco de código do método do novamente
        //linha em branco
        do{ //método do, laço de repetição que ocorrerá enquanto um argumento for verdadeiro
            System.out.print("::::::::::::::::::::Opção de insalubridade::::::::::::::::::::\n"
                    +"Escolha uma opção abaixo\n"
                    +"1 – Mínimo\n"
                    +"2 – Médio\n"
                    +"3 – Máximo\n"
                    +"0 – Não recebe\n"
                    +"Digite aqui a opção desejada: "); //escrever na tela as opções que o usuário tem no menu
            op = leia.nextByte(); //colocar os dados que o usuário digitou dentroda variável op
            //linha em branco
            System.out.print("\f"); //limpar a tela
            //linha em branco
            switch(op){ //método switch, dependendo do que estiver dentro da variável op, ele entrará no caso 1, 2, 3 ou 0, ou irá direto para o default
                case 1: //caso a variável op tenha o valor 1 dentro dela, o programa executará o bloco de código abaixo
                    insalubridade = 110.37; //a variável de insalubridade recebe o valor de 110.37
                    break; //fazer o programa parar de executar o método switch
                case 2: //caso a variável op tenha o valor 2 dentro dela, o programa executará o bloco de código abaixo
                    insalubridade = 220.73; //a variável de insalubridade recebe o valor de 220.73
                    break; //fazer o programa parar de executar o método switch
                case 3: //caso a variável op tenha o valor 3 dentro dela, o programa executará o bloco de código abaixo
                    insalubridade = 441.46; //a variável de insalubridade recebe o valor de 441.46
                    break; //fazer o programa parar de executar o método switch
                case 0: //caso a variável op tenha o valor 0 dentro dela, o programa executará o bloco de código abaixo
                    break; //fazer o programa parar de executar o método switch
                default: //caso a variável op não possua nem o valor 1 nem o valor 2, será executado o bloco de codigo abaixo         
                    System.out.println("\nOpção inválida\n"
                            +"Digite novamente\n"); //escrever na tela que o usuário não digitou um dos valores pedidos e que ele deve tentar novamente
            } //fim do bloco de código do método switch
            //linha em branco
        }while(op < 0 || op > 3); //final do bloco de código do método do, e, caso os argumentos dentro do método while forem verdadeiros, ele executará o bloco de código do método do novamente
        //linha em branco
        if(salarioBruto <= 1659.38){ //se os argumento dentro do if forem verdadeiros(salário bruto menor ou igual a 1659,38) ele executará o bloco de código abaixo
            inss = salarioBruto * 0.08; //variável inss recebe o valor do salário bruto vezes 0.08
        }else if(salarioBruto <= 2765.66){ //se os argumento dentro do if forem verdadeiros(salário bruto menor ou igual a 2765,66) ele executará o bloco de código abaixo
            inss = salarioBruto * 0.09; //variável inss recebe o valor do salário bruto vezes 0.09
        }else if(salarioBruto <= 5531.31){ //se os argumento dentro do if forem verdadeiros(salário bruto menor ou igual a 5531,31) ele executará o bloco de código abaixo
            inss = salarioBruto * 0.11; //variável inss recebe o valor do salário bruto vezes 0.11
        }else{ //caso nenhum dos if venha a ser verdadeiros, ele executára o bloco de código abaixo
            inss = 608.44; //variável inss recebe o valor de 608.44
        } // fim do bloco de código do else
        //linha em branco
        salarioLiquido = salarioBruto - valorVT - inss + insalubridade; //salário líquido recebe o valor do salário bruto, menos o valor do vale-transporte, menos o valor do INSS mais o valor da insalubridade
        //linha em branco
        do{ //método do, laço de repetição que ocorrerá enquanto um argumento for verdadeiro
            System.out.print("::::::::::::::DADOA DO FUNCIONÁRIO::::::::::::\n"
                    +"Escolha uma opção abaixo:\n"
                    +"1 - Mostrar todos os dados do funcionário\n"
                    +"2 - Ver descontos\n"
                    +"3 - Ver benefícios\n"
                    +"4 - Var salário líquido\n"
                    +"0 - Sair\n"
                    +"Digite aqui a opção desejada: "); //escrever na tela as opções que o usuário tem no menu
            op = leia.nextByte(); //colocar os dados que o usuário digitou dentroda variável op
            //linha em branco
            System.out.print("\f"); //limpar a tela
            //linha em branco
            switch(op){ //método switch, dependendo do que estiver dentro da variável op, ele entrará no caso 1, 2, 3 ou 0, ou irá direto para o default
                case 1: //caso a variável op tenha o valor 1 dentro dela, o programa executará o bloco de código abaixo
                    System.out.print("\nTodos os dados do funcionário\n"
                            +"Nome: "+nome+"\n"
                            +"Valor total de passagens: "+valorPassagem+"\n"
                            +"Valor hora: "+valorHora+"\n"
                            +"Carga horária: "+cargaHoraria+"\n"
                            +"Salário bruto: "+salarioBruto+"\n"
                            +"Valor VT: "+valorVT+"\n"
                            +"Insalubridade: "+insalubridade+"\n"
                            +"INSS: "+inss+"\n"
                            +"Salário líquido: "+salarioLiquido+"\n"); //escrever na tela todos os dados do funcionário
                    break; //fazer o programa parar de executar o método switch
                case 2: //caso a variável op tenha o valor 2 dentro dela, o programa executará o bloco de código abaixo
                     System.out.println("\nTodos os descontos\n"
                             +"Valor VT: "+valorVT+"\n"
                             +"INSS: "+inss+"\n"); //escrever na tela todos os descontos do salário do funcionário
                    break; //fazer o programa parar de executar o método switch
                case 3: //caso a variável op tenha o valor 3 dentro dela, o programa executará o bloco de código abaixo
                    System.out.println("\nTodos os benefícios\n"
                            +"Insalubridade: "+insalubridade+"\n"
                            +"Valor de passagens: "+valorPassagem+"\n"); //escrever na tela todos os benefícios do salário do funcionário
                    break; //fazer o programa parar de executar o método switch
                case 4: //caso a variável op tenha o valor 4 dentro dela, o programa executará o bloco de código abaixo
                    System.out.println("\nSalário líquido: "+salarioLiquido+"\n"); //escrever na tela o salário líquido do funcionário 
                    break; //fazer o programa parar de executar o método switch
                case 0: //caso a variável op tenha o valor 0 dentro dela, o programa executará o bloco de código abaixo
                    System.out.println("\nSistema encerrado!\n"); //escrever na tela que o programa foi encerrado
                    break; //fazer o programa parar de executar o método switch
                default: //caso a variável op não possua nem o valor 1 nem o valor 2, será executado o bloco de codigo abaixo         
                    System.out.println("\nOpção inválida\n"
                            +"Digite novamente\n"); //escrever na tela que o usuário não digitou um dos valores pedidos e que ele deve tentar novamente
            } //fim do bloco de código do método switch
            //linha em branco
        }while(op != 0); //final do bloco de código do método do, e, caso os argumentos dentro do método while forem verdadeiros, ele executará o bloco de código do método do novamente
    } //fim do bloco de código do objeto main
}// fim do bloco de código da classe Main
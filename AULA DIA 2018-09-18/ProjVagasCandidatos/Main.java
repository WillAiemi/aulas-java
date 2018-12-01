import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Cadastro de funcionários");
        boolean flag = true;
        List<String> candidatos = new ArrayList<>();
        List<String> sexo = new ArrayList<>();
        List<Integer> idade = new ArrayList<>();
        List<String> experiencia = new ArrayList<>();
        List<String> escolaridade = new ArrayList<>();
        int qtdM;
        int qtdF;
        double idadeMediaM;
        double idadeMediaF;
        int qtdMediaM;
        int qtdMediaF;
        double percentM;
        int menorIdadeF;
        
        do{
            System.out.print("\n1 - Cadastrar novo candidato" +
                    "\n2 - Mostrar resultados" +
                    "\n3 - Encerrar programa" +
                    "\nDigite a ação desejada: ");
            byte op = leia.nextByte();
            switch(op){
                case 1:
                    System.out.print("\fCadastrando novo usuário..." +
                            "\nNome: ");
                    candidatos.add(leia.next());
                    
                    do{
                        flag = false;
                        System.out.print("Sexo: " +
                                "\n1 - Masculino" +
                                "\n2 - Feminino" +
                                "\nDigite a opção: ");
                        op = leia.nextByte();
                        switch(op){
                            case 1:
                                sexo.add("Masculino");
                                break;
                            case 2:
                                sexo.add("Feminino");
                                break;
                            default:
                                System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
                                flag = true;
                        }
                    } while(flag);
                    
                    System.out.print("Idade: ");
                    idade.add(leia.nextInt());
                    
                    do{
                        flag = false;
                        System.out.print("Possui experiência?" +
                                "\n1 - Sim" +
                                "\n2 - Não" +
                                "\nDigite a opção: ");
                        op = leia.nextByte();
                        switch(op){
                            case 1:
                                experiencia.add("Sim");
                                break;
                            case 2:
                                experiencia.add("Não");
                                break;
                            default:
                                System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
                                flag = true;
                        }
                    }while(flag);
                    
                    do{
                        flag = false;
                        System.out.print("Escolha a escolaridade: " +
                                "\n1 - Ensino Fundamental" +
                                "\n2 - Ensino Médio" +
                                "\n3 - Ensino Superior" +
                                "\n4 - Pós-Graduação" +
                                "\nDigite a escolaridade: ");
                        op = leia.nextByte();
                        switch(op){
                            case 1:
                                escolaridade.add("Ensino Fundamental");
                                break;
                            case 2:
                                escolaridade.add("Ensino Médio");
                                break;
                            case 3:
                                escolaridade.add("Ensino Superior");
                                break;
                            case 4:
                                escolaridade.add("Pós-Graduação");
                                break;
                            default:
                                System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
                                flag = true;
                        }
                    } while(flag);
                    flag = true;
                    break;
                case 2:
                    qtdM = 0;
                    qtdF = 0;
                    idadeMediaM = 0;
                    idadeMediaF = 0;
                    qtdMediaM = 0;
                    qtdMediaF = 0;
                    percentM = 0;
                    menorIdadeF = 100;
                    
                    for(int i=0; i<candidatos.size(); i++){
                        if(sexo.get(i).equalsIgnoreCase("Masculino")){
                            qtdM++;
                            if(experiencia.get(i).equalsIgnoreCase("Sim")){
                                idadeMediaM += idade.get(i);
                                qtdMediaM++;
                            }
                            
                            if(idade.get(i) >= 35 && idade.get(i) <= 45){
                                percentM++;
                            }
                        } else {
                            qtdF++;
                            if(experiencia.get(i).equalsIgnoreCase("Sim")){
                                idadeMediaF += idade.get(i);
                                qtdMediaF++;
                                if(menorIdadeF > idade.get(i)){
                                    menorIdadeF = idade.get(i);
                                }
                            }
                        }
                    }
                    idadeMediaM = idadeMediaM/qtdMediaM;
                    idadeMediaF = idadeMediaF/qtdMediaF;
                    percentM = percentM/qtdM;
                    
                    System.out.print("\f:::::::::RESULTADOS:::::::::\n\n" +
                            "CANDIDATO::SEXO::IDADE::EXPERIÊNCIA::ESCOLARIDADE\n");
                    for(int i=0; i<candidatos.size(); i++){
                        System.out.println(candidatos.get(i)+"::::"+sexo.get(i)+"::::"+idade.get(i)+"::::"+experiencia.get(i)+"::::"+escolaridade.get(i));
                    }
                    System.out.print("\nCandidatos do sexo masculino: " +qtdM +
                            "\nCandidatos do sexo feminino: " + qtdF +
                            "\nIdade média de homens com experiência: " + idadeMediaM +
                            "\nIdade média de mulheres com experiência: " + idadeMediaF +
                            "\nPorcentagem de homens de 35 a 45 anos: " + percentM*100 + "%" +
                            "\nMenor idade entre as mulheres com experiência: " + menorIdadeF +
                            "\n\n:::::::::FIM DOS RESULTADOS:::::::::");
                    flag = true;
                    break;
                case 3:
                    System.out.print("\fPROGRAMA ENCERRADO");
                    flag = false;
                    break;
                default:
                    System.out.print("\nOPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
            }
        }while(flag);
    }
}
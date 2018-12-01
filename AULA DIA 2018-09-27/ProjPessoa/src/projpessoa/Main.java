package projpessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa objPessoa1 = new Pessoa();
        Pessoa objPessoa2 = new Pessoa();

        System.out.print("Informe os dados da pessoa"
                + "\nNome: ");
        objPessoa1.nome = leia.next();

        System.out.print("Idade: ");
        objPessoa1.idade = leia.nextByte();

        System.out.print("Sexo: ");
        objPessoa1.sexo = leia.next();

        System.out.print("CPF: ");
        objPessoa1.cpf = leia.nextLong();

        System.out.print("Endereço: ");
        objPessoa1.endereco = leia.next();

        System.out.print("Informe os dados da pessoa"
                + "\nNome: ");
        objPessoa2.nome = leia.next();

        System.out.print("Idade: ");
        objPessoa2.idade = leia.nextByte();

        System.out.print("Sexo: ");
        objPessoa2.sexo = leia.next();

        System.out.print("CPF: ");
        objPessoa2.cpf = leia.nextLong();

        System.out.print("Endereço: ");
        objPessoa2.endereco = leia.next();

        System.out.println("\n\nDados da pessoa:"
                + "\nNome: " + objPessoa1.nome
                + "\nIdade: " + objPessoa1.idade
                + "\nSexo: " + objPessoa1.sexo
                + "\nCPF: " + objPessoa1.cpf
                + "\nEndereço: " + objPessoa1.endereco);

        System.out.println("\n\nDados da pessoa 2:"
                + "\nNome: " + objPessoa2.nome
                + "\nIdade: " + objPessoa2.idade
                + "\nSexo: " + objPessoa2.sexo
                + "\nCPF: " + objPessoa2.cpf
                + "\nEndereço: " + objPessoa2.endereco);
    }
}
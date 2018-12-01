package projcachorros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        System.out.print("Cadastrar o primeiro cão: \n"
                + "Nome: ");
        objCao1.nome = leia.next();
        System.out.print("Raça: ");
        objCao1.raca = leia.next();
        System.out.print("Cor: ");
        objCao1.cor = leia.next();
        System.out.print("Sexo: ");
        objCao1.sexo = leia.next();
        System.out.print("Porte: ");
        objCao1.porte = leia.next();
        System.out.print("Idade: ");
        objCao1.idade = leia.nextByte();
        System.out.print("Dono: ");
        objCao1.dono = leia.next();
        
        System.out.print("Cadastrar o segundo cão: \n"
                + "Nome: ");
        objCao2.nome = leia.next();
        System.out.print("Raça: ");
        objCao2.raca = leia.next();
        System.out.print("Cor: ");
        objCao2.cor = leia.next();
        System.out.print("Sexo: ");
        objCao2.sexo = leia.next();
        System.out.print("Porte: ");
        objCao2.porte = leia.next();
        System.out.print("Idade: ");
        objCao2.idade = leia.nextByte();
        System.out.print("Dono: ");
        objCao2.dono = leia.next();
        
        System.out.print("\n\nDados do cachorro 1:"
                + "\nNome: " + objCao1.nome
                + "\nRaça: " + objCao1.raca
                + "\nCor: " + objCao1.cor
                + "\nSexo: " + objCao1.sexo
                + "\nPorte: " + objCao1.porte
                + "\nIdade" + objCao1.idade
                + "\nDono: " + objCao1.dono);
        
        System.out.print("\n\nDados do cachorro 1:"
                + "\nNome: " + objCao2.nome
                + "\nRaça: " + objCao2.raca
                + "\nCor: " + objCao2.cor
                + "\nSexo: " + objCao2.sexo
                + "\nPorte: " + objCao2.porte
                + "\nIdade" + objCao2.idade
                + "\nDono: " + objCao2.dono);
    }
}
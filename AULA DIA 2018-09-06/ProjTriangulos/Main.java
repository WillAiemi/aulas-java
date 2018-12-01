import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String categoriaLados = ".";
        String categoriaAngulos = "inválido";
        
        System.out.print("Insira os lados e ângulos do triângulo!" +
                   "\nLado 1: ");
        float lado1 = leia.nextFloat();
        
        System.out.print("Lado 2: ");
        float lado2 = leia.nextFloat();
        
        System.out.print("Lado 3: ");
        float lado3 = leia.nextFloat();
        
        System.out.print("Ângulo 1: ");
        float angulo1 = leia.nextFloat();
        
        System.out.print("Ângulo 2: ");
        float angulo2 = leia.nextFloat();
        
        System.out.print("Ângulo 3: ");
        float angulo3 = leia.nextFloat();
        
        if(angulo1 > 0 && angulo2 > 0 && angulo3 > 0 && angulo1+angulo2+angulo3 == 180 && lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2){
            if(lado1 == lado2 && lado2==lado3){
                categoriaLados = "equilátero";
            }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                categoriaLados = "isósceles";
            } else {
                categoriaLados = "escaleno";
            }
            if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
                categoriaAngulos = "obtusângulo e ";
            } else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
                categoriaAngulos = "retângulo e ";
            } else {
                categoriaAngulos = "acutângulo e ";
            }
            System.out.print("\fAs medidas inseridas geram um triângulo válido." +
                "\nAssim sendo, pode ser classificado como um" +
                "\ntriângulo " + categoriaAngulos + categoriaLados);
        } else {
           System.out.println("\fAs medidas inseridas geram um triangulo inválido.");
        }
    }
}
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de números: ");
        int[] arrayPrincipal = new int[leia.nextInt()];
        
        int[] arrayCrescente = new int[arrayPrincipal.length];
        int[] arrayDecrescente = new int[arrayPrincipal.length];
        
        for(int i = 0; i < arrayPrincipal.length; i++){
            System.out.print((i+1)+"º número: ");
            arrayPrincipal[i] = leia.nextInt();
            
            for(int j = 0; j <= i; j++){
                if(arrayPrincipal[i] > arrayCrescente[j] && j == i){
                    arrayCrescente[j] = arrayPrincipal[i];
                } else if (arrayPrincipal[i] < arrayCrescente[j]){
                    for(int n = i; n > j; n--){
                        arrayCrescente[n] = arrayCrescente[n-1];
                    }
                    arrayCrescente[j] = arrayPrincipal[i];
                    break;
                }
            }
        }
        int j = arrayPrincipal.length;
        for(int i = 0; i < arrayPrincipal.length; i++){
            j--;
            arrayDecrescente[i] = arrayCrescente[j];
        }
        
        System.out.print("\fArray inserido: " + Arrays.toString(arrayPrincipal) +
                "\nArray crescente: " + Arrays.toString(arrayCrescente) +
                "\nArray descrescente: " + Arrays.toString(arrayDecrescente));
    }
}
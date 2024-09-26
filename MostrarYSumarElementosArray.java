import java.util.Arrays;
import java.util.Scanner;

public class MostrarYSumarElementosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos números va a haber en tu array (tamaño del array): ");
        int numEnteros = scanner.nextInt();

   
        int[] array = new int[numEnteros];
        

    
        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < numEnteros; i++) {
            System.out.print("Índice " + i + ": ");
            array[i] = scanner.nextInt();
        }
        

        System.out.println("Lista de enteros es: " + Arrays.toString(array));
     
        int suma = Arrays.stream(array)
                         .reduce(0, Integer::sum);  // Usamos reduce para sumar los elementos

        System.out.println("La suma de los elementos del array es: " + suma);
        

        
        scanner.close();
    }
}

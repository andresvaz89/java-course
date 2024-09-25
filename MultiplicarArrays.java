import java.util.Arrays;
import java.util.Scanner;


public class MultiplicarArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Introduce el tamaño de los arrays: ");
        int n = scanner.nextInt();

   
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] resultado = new int[n];

    
        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Índice " + i + ": ");
            array1[i] = scanner.nextInt();
        }

      
        System.out.println("Introduce los elementos del segundo array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Índice " + i + ": ");
            array2[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        
        System.out.println("Resultado de la multiplicación de " + Arrays.toString(array1) +" * " + Arrays.toString(array2));
        for (int i = 0; i < n; i++) {
            System.out.println(array1[i] + " * " + array2[i] + " = " + resultado[i]);
        }

        scanner.close();
    }
}

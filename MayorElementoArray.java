import java.util.Scanner;

public class MayorElementoArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor escribe el tamaño del array: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];

        
        System.out.println("Escribe los elementos del array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento nº " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        int mayor = array[0];  
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        
        System.out.println(mayor + " es el mayor elemento del array.");

        scanner.close();
    }
}

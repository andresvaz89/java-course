import java.util.Scanner;

public class InversionArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamañoArray = scanner.nextInt();

        int[] array = new int[tamañoArray];

        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamañoArray / 2; i++) {
            int arrayTemporal = array[i];
            array[i] = array[tamañoArray - i - 1];
            array[tamañoArray - i - 1] = arrayTemporal;
        }

    
        System.out.println("El array con el orden inverso es:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}

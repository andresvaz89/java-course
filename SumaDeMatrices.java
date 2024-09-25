import java.util.Scanner;

public class SumaDeMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce el número de filas: ");
        int numFilas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int numColumnas = scanner.nextInt();

        
        int[][] matriz1 = new int[numFilas][numColumnas];
        int[][] matriz2 = new int[numFilas][numColumnas];
        int[][] suma = new int[numFilas][numColumnas];

    
        System.out.println("Introduce los elementos de la primera matriz:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

    
        System.out.println("Introduce los elementos de la segunda matriz:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

   
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

  
        System.out.println("La suma de las matrices da:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

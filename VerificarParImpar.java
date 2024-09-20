import java.util.Scanner;

public class VerificarParImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class LeerYMostrarEntradaUsuario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner sc = new Scanner(System.in);
        
        // Leer un número entero
        System.out.print("Introduce un número entero: ");
        int entero = sc.nextInt();
        
        // Leer un número decimal
        System.out.print("Introduce un número decimal (con coma): ");
        double decimal = sc.nextDouble();
        
        // Limpiar el buffer de la línea antes de leer la cadena
        sc.nextLine(); 
        
        // Leer una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        
        // Mostrar los valores ingresados
        System.out.println("\nLos valores introducidos son:");
        System.out.println("Número entero: " + entero);
        System.out.println("Número decimal: " + decimal);
        System.out.println("Cadena de texto: " + cadena);
    }
}
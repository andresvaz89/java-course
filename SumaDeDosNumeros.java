import java.util.Scanner;

public class SumaDeDosNumeros {
  

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner sc = new Scanner(System.in);
        
        // Leer un número entero
        System.out.print("Introduce un número entero: ");
        int entero = sc.nextInt();
        
        // Leer un número decimal
        System.out.print("Introduce el segundo número: ");
        int entero2 = sc.nextInt();

        
        
        // Limpiar el buffer de la línea antes de leer la cadena
        int resultado;
        resultado=entero+entero2;
        sc.nextLine(); 
        
        // Mostrar los valores ingresados
        System.out.println("\nLos números introducidos son:");
        System.out.println("El primer número es: " + entero);
        System.out.println("El segundo número es: " + entero2);
        System.out.println("La suma total es: " + resultado );
    }
}

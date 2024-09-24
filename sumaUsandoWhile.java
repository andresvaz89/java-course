import java.util.Scanner;


public class sumaUsandoWhile {
   
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Introduce un número natural: ");
        int numIntroducido = scanner.nextInt();
        int suma = 0;
        int i = 1;
        
        while(i <= numIntroducido){
            suma+=i;
            i++;
            
        }
        System.out.println("La suma de números naturales hasta " +numIntroducido+ " es "+suma);
        scanner.close();
    }
}

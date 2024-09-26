import java.util.Scanner;

public class ComprobarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la string que quiere comprobar:");

        String stringAComprobar = scanner.nextLine();
        int numCaracteres = stringAComprobar.length();
        
        boolean esPalindromo = true;  

        
        for (int i = 0; i < numCaracteres / 2; i++) {
           
            if (stringAComprobar.charAt(i) != stringAComprobar.charAt(numCaracteres - i - 1)) {
                esPalindromo = false;  
                break;  
            }
        }

        System.out.println((esPalindromo ? "Es palíndromo" : "No es palíndromo"));

        // Cerrar el objeto scanner
        scanner.close();
    }
}

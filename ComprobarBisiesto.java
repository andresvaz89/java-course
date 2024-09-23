import java.util.Scanner;

public class ComprobarBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un año para comprobar si es bisiesto: ");
        int year = scanner.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año "+ year + " no es bisiesto.");
        }
        
        scanner.close();
    }
}
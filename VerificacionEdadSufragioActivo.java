import java.util.Scanner;

public class VerificacionEdadSufragioActivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

       
        if (edad >100) {
            System.out.println("Oye, quién los pillase.Enhorabuena, puedes ejercer tu derecho al voto.");
        } else if (edad >= 18) {
            System.out.println("Enhorabuena, puedes ejercer tu derecho al voto.");
        }
         else {
            System.out.println("Lo siento, necesitas tener al menos 18 años para poder votar.");
        }

        scanner.close();
    }
}

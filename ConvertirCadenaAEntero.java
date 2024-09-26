import java.util.Scanner;

public class ConvertirCadenaAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número (esto será en tipo de dato string):");
        String numeroEnString = scanner.nextLine();
        

        int numeroConParseInt = Integer.parseInt(numeroEnString);

        numeroConParseInt += 10;

        System.out.println("El número " +numeroEnString +" más 10 es: " + numeroConParseInt);

        scanner.close();
    }
}

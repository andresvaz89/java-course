import java.util.Scanner;

public class condicionesLogicasAndYOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Introduce el número a evaluar: ");
        int numIntroducido = scanner.nextInt();

       
        if (numIntroducido > 0  && numIntroducido%2==0) {
            System.out.println("El número introducido es positivo y par");
        } else if (numIntroducido <0 || numIntroducido%3==0) {
            System.out.println("El número es negativo o divisible por 3");
        }
         else {
            System.out.println("Lo siento, pero menuda birria de número has introducido.");
        }

        scanner.close();
    }
}

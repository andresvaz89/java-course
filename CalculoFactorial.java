import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número para calcular su factorial :");
        int numIntroducido = scanner.nextInt();
        int factorial= 1;
        
        for (int i = numIntroducido; i >0; i--) {
            factorial=factorial*i;
            System.out.println(factorial);
          }
        scanner.close();
        
        
    }
    
}

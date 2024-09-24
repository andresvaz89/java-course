import java.util.Scanner;

public class ImprimirTablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número para imprimir su tabla de multiplicar:");
        int numIntroducido = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numIntroducido + " x "+ i+" = "+ numIntroducido*i );
          }
        scanner.close();
        
        
    }
    
}

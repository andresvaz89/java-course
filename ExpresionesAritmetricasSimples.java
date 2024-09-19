import java.util.Scanner;
public class ExpresionesAritmetricasSimples {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el primer número
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        
        // Leer el operador
        System.out.print("Ingresa un operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);
        
        // Leer el segundo número
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        
        // Variable para almacenar el resultado
        double resultado = 0;
        
        // Evaluar la expresión basada en el operador
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    return; // Terminar el programa si hay división por cero
                }
                break;
            default:
                System.out.println("Operador no válido.");
                return; // Terminar el programa si el operador es inválido
        }
        
        // Mostrar el resultado
        System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + resultado);
    }

}

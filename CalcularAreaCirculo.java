import java.util.Scanner;
public class CalcularAreaCirculo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el primer número
        System.out.print("Ingresa el radio para calcular el área del círculo: ");
        double radio = sc.nextDouble();
        
        
        // Variable para almacenar el resultado
        double area = Math.PI *(Math.pow(radio,2));
      
        // Mostrar el resultado
        System.out.println("El área de un círculo de radio " + radio + " es " + area);
    }
}

// ESTO ES UN COMENTARIO PARA QUE LO LEA ACACIA
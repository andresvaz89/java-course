import java.util.Random;

public class TiradaDeDados {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Simular la tirada del primer dado (número entre 1 y 6)
        int dado1 = random.nextInt(6) + 1;
        
        // Simular la tirada del segundo dado (número entre 1 y 6)
        int dado2 = random.nextInt(6) + 1;
        
        // Mostrar el resultado de ambas tiradas
        System.out.println("Tirada del dado 1: " + dado1);
        System.out.println("Tirada del dado 2: " + dado2);
        
        // Sumar los resultados de ambos dados
        int suma = dado1 + dado2;
        System.out.println("Suma de los dos dados: " + suma);
    }
}

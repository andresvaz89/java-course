public class NumeroAleatorio {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        
        // Imprimir el número aleatorio generado
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }
}

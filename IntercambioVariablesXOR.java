public class IntercambioVariablesXOR {
    public static void main(String[] args) {
        int a = 1; // valor inicial de a
        int b = 2; // valor inicial de b
        
        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        // Intercambio usando XOR
        a = a ^ b; // paso 1
        b = a ^ b; // paso 2
        a = a ^ b; // paso 3

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }
}

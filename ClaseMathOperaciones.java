public class ClaseMathOperaciones {
    public static void main(String[] args) {
        // Uso de Math.pow(base, exponente)
        double base = 2.0;
        double exponente = 3.0;
        double resultadoPotencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es " + resultadoPotencia);

        // Uso de Math.sqrt(valor)
        double valor = 16.0;
        double resultadoRaizCuadrada = Math.sqrt(valor);
        System.out.println("La raíz cuadrada de " + valor + " es " + resultadoRaizCuadrada);

        // Uso de Math.abs(valor)
        double numeroNegativo = -15.5;
        double resultadoAbsoluto = Math.abs(numeroNegativo);
        System.out.println("El valor absoluto de " + numeroNegativo + " es " + resultadoAbsoluto);
    }
}

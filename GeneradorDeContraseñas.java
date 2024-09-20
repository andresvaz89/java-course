import java.util.Random;

public class GeneradorDeContraseñas {
    public static void main(String[] args) {
        // Definir los caracteres que se pueden usar en la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Longitud de la contraseña
        int longitudContraseña = 8;
        
        // Crear una instancia de Random
        Random random = new Random();
        
        // StringBuilder para construir la contraseña
        StringBuilder contraseña = new StringBuilder();
        
        // Generar la contraseña de 8 caracteres
        for (int i = 0; i < longitudContraseña; i++) {
            int index = random.nextInt(caracteres.length()); // Generar un índice aleatorio
            contraseña.append(caracteres.charAt(index)); // Añadir el carácter correspondiente
        }
        
        // Imprimir la contraseña generada
        System.out.println("Contraseña generada: " + contraseña.toString());
    }
}

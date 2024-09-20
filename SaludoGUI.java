import javax.swing.JOptionPane;

public class SaludoGUI {
    public static void main(String[] args) {
        // Solicitar el nombre del usuario con un cuadro de diálogo de entrada
        String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?", "Entrada", JOptionPane.QUESTION_MESSAGE);

        // Verificar si el usuario ingresó un nombre
        if (nombre != null && !nombre.isEmpty()) {
            // Mostrar el saludo en un cuadro de diálogo de mensaje
            JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "! Bienvenid@ a Factoría5", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si no se ingresó nombre, mostrar un mensaje alternativo
            JOptionPane.showMessageDialog(null, "No ingresaste ningún nombre.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}

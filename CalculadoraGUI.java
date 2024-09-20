import javax.swing.JOptionPane;

public class CalculadoraGUI {
    public static void main(String[] args) {
        while (true) {
            // Solicitar los números al usuario
            String num1Str = JOptionPane.showInputDialog(null, "Ingresa el primer número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
            String num2Str = JOptionPane.showInputDialog(null, "Ingresa el segundo número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);

            // Verificar si el usuario ingresó los números
            if (num1Str == null || num2Str == null) {
                break; // Si se cancela el cuadro de diálogo, se cierra el programa
            }

            try {
                // Convertir los números ingresados a valores numéricos
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);

                // Mostrar las opciones de operación
                String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
                int seleccion = JOptionPane.showOptionDialog(null, "Elige una operación", "Calculadora", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                // Variable para almacenar el resultado
                double resultado = 0;
                String operacion = "";

                // Ejecutar la operación seleccionada
                switch (seleccion) {
                    case 0: // Sumar
                        resultado = num1 + num2;
                        operacion = "Suma";
                        break;
                    case 1: // Restar
                        resultado = num1 - num2;
                        operacion = "Resta";
                        break;
                    case 2: // Multiplicar
                        resultado = num1 * num2;
                        operacion = "Multiplicación";
                        break;
                    case 3: // Dividir
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            operacion = "División";
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero", "Error", JOptionPane.ERROR_MESSAGE);
                            continue; // Regresar a la solicitud de números
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                }

                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, "Resultado de la " + operacion + ": " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

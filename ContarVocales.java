import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la string para contar las vocales:");

        String stringAComprobar = scanner.nextLine().toLowerCase();
        int numCaracteres = stringAComprobar.length();
        
        int conteoVocales=0;

        
        for (int i = 0; i < numCaracteres; i++) {
           char letraAComprobar=stringAComprobar.charAt(i);
           
            if (letraAComprobar == 'a' || letraAComprobar == 'e' || letraAComprobar == 'i' || letraAComprobar == 'o' || letraAComprobar == 'u')  {
                conteoVocales++;
            }
        }

        System.out.println((conteoVocales >=1 ? "Hay "+ conteoVocales + " vocales." : "No hay vocales"));

        scanner.close();
    }
}

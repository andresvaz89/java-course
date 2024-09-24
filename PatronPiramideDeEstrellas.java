import java.util.Scanner;

public class PatronPiramideDeEstrellas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Introduce el número de filas que quieres que tenga la pirámide: ");
        int numFilas = sc.nextInt();
        
        
        if(numFilas>1){
            for (int i = 1; i <= numFilas; i++) {
                
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
        else{
            System.out.print("Introduce un número positivo por favor");  
        }
    }
}

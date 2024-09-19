public class IntercambioDeVariablesOperacionesAritmetricas {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        System.out.println("A la hora de declarar variables a=" + a + " y b="  + b); 
       a= b;
       b= a/b;

        
        
        System.out.println("Pero ahora, tras intercambiar sus valores a=" + a + " y b=" + b); 

    }
}
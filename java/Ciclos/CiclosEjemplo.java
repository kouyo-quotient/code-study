import java.util.Scanner;

public class CiclosEjemplo {

    /*
     * Verificar si hay un numero negativo en una variable
     */

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numeros;
            boolean hayNegativo=false;

            for(int i=1; i<=10; i++){
                System.out.println("Introduce el sueldo numero "+i+".");
                numeros = input.nextInt();

                if(numeros<0){
                    hayNegativo = true;
                }
            }

            if(hayNegativo == true){
                System.out.println("Hay un numero negativo");
            } else {
                System.out.println("No hay numeros negativos");
            }
        }
    }
}

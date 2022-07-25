import java.util.Scanner;

public class ArregloPrintFirstLast {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numeros = new int[10];

            for(int i=0;i<10;i++){
                System.out.println("Introduce el numero "+(i+1));
                numeros[i] = input.nextInt();
            }

            /* Este loop va a imprimir los todos los numeros pero saltandose del primero al ultimo,
             * un arreglo de 1 a 10 se imprimiria: 1,10,2,9,3,8,4,7,5,6
            */
            for(int i=0;i<5;i++){
                System.out.println(numeros[i]); // Imprime el primer numero
                System.out.println(numeros[9-i]); // Imprime el ultimo numero

            }
        }
    }
}

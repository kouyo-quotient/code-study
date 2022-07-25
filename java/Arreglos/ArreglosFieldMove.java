import java.util.Scanner;

public class ArreglosFieldMove {

    // Mover el numero del field 9 al field 0
    // Metodo viejito... ¿Parece ser?, hay un metodo que se llama arrayCopy que hace lo mismo.

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10];

            System.out.println("Introduce la serie de numeros:");
            for(int i=0;i<10;i++){
                System.out.print(i+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            int ultimo = a[9]; // Guardar el ultimo numero en una variable

            /*
             * Iniciar un bucle en el que el iterador i empiece en 8.
             * La primera iteracion va asignar a la variable a en el field 9 al valor de 8, se veria algo asi:
             * a[8+1] = a[8]
             */
            for(int i=8;i>=0;i--){
                a[i+1] = a[i];
            }

            a[0] = ultimo; // Establecer al field 0 el valor de la variable ultimo

            System.out.println("\nEl nuevo arreglo es:");
            for(int i=0;i<10;i++){
                System.out.println(a[i]);
            }
        }
    }
}

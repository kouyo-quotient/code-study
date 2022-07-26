import java.util.Scanner;

public class ArreglosFieldDespl {

    // Desplazar X cantidad de veces un arreglo

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10];
            int pos;


            System.out.println("Define el arreglo:");
            for(int i=0;i<10;i++){
                System.out.print(i+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            System.out.print("\nIntroduce el numero de posiciones que quieres desplazar: ");
            pos = input.nextInt();

            /*
             * Iniciar un bucle en el que la variable v empieze en 1, para evitar que el usuario ponga 0 en la variable pos
             * La primera iteracion va asignar a la variable a en el field 9 el valor de la variable i, se veria algo asi:
             * a[8+1] = a[8]
             */
            for(int v=1;v<=pos;v++){
                int ultimo = a[9]; // Establecer la variable ultimo el valor del field 9
                for(int i=8;i>=0;i--){ // Desplazarse una posicion en el arreglo
                    a[i+1] = a[i];
                }
                a[0] = ultimo; // Establecer al field 0 el valor de la variable ultimo
            }

            System.out.println("El nuevo arreglo es:");
            for(int i=0;i<10;i++){
                System.out.println(a[i]);
            }
        }
    }
}

import java.util.Scanner;

public class ArreglosFieldDelete {

    /*
     * Borrar el elemento dentro de un field especifico
     */
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                int a[] = new int[10];
                int pos;

                System.out.println("Llena el arreglo");
                for(int i=0;i<10;i++){
                    System.out.print(i+". Introduce el numero: ");
                    a[i] = input.nextInt();
                }
                do{ // Pedir la posicion del elemento a eliminar en un rango de 0 a 9
                    System.out.print("Introduce una posicion en el arreglo(0-9): ");
                    pos = input.nextInt();
                } while(pos<0 || pos>9);

                /*
                 * Usar un bucle para eliminar el valor del field especificado en la variable pos.
                 * El iterador va a empezar en el valor dentro de pos hasta que sea 9.
                 * Suponiendo que se quiere eliminar el valor 5, las iteraciones serian:
                 * 1. a[5] = a[5+1]
                 * 2. a[6] = a[6+1]
                 * 3. a[7] = a[7+1]
                 * 4. a[8] = a[8+1]
                 * 5. a[9] = a[9+1]
                 */
                for(int i=pos;i<9;i++){
                    a[i] = a[i+1];
                }

                System.out.println("El nuevo arreglo es:");
                for(int i=0;i<9;i++){
                    System.out.println(a[i]);
                }
            }
        }
    }

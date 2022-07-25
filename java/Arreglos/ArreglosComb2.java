import java.util.Scanner;

public class ArreglosComb2 {

    /*
     * Combinar dos arreglos de forma que un arreglo de 12 se unifiquen de forma:
     * 1-2-3 - 1-2-3 - 4-5-6 - 4-5-6 - 7-8-9 - 7-8-9 - 10-11-12 - 10-11-12
     */

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[],b[],c[];
            int i,j;
            a = new int[12];
            b = new int[12];
            c = new int[24];


            System.out.println("Primer array");
            for(i=0;i<12;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            System.out.println("Segundo array");
            for(i=0;i<12;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                b[i] = input.nextInt();
            }

            i=0;
            j=0;

            /*
             * Crear un bucle mientras hasta que variable i sea 12.
             * Dentro de ese bucle crear otro que inicie una variable k hasta que sea 3.
             * Asignar a una variable c en la posicion de una variable j el numero de la variable a
             * en la posicion de suma de las variable i + k
             */
            while(i<12){
                /*
                 * Obtener los 3 primeros numeros del arreglo a sumando el valor de i y k
                 * c[0] = a[0+0] seria la primer iteracion del bucle
                 * c[1] = a[0+1] la segunda iteracion del bucle
                 * c[2] = a[0+3] la ultima del bucle
                 */
                for(int k=0;k<3;k++){
                    c[j] = a[i+k];
                    j++; // Se suma 1 a J
                }
                /*
                 * Este bucle va a hacer lo mismo que el anterior, solo que va a asignar
                 * los numeros de el arreglo b donde la variable j se haya quedado.
                 */
                for(int k=0;k<3;k++){
                    c[j] = b[i+k];
                    // ?: ¿Java no permite que se sobreescriban asignaciones y empieza la primera iteracion en el field 4?
                    j++;
                }

                i+=3; // Aumentar la variable i de 3 en 3
            }

            System.out.println("El arreglo resultante es:");
            for(i=0;i<24;i++){
                System.out.print(c[i]+" - ");
            }
        }
    }
}

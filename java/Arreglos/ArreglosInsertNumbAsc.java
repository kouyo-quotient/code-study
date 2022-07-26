import java.util.Scanner;

public class ArreglosInsertNumbAsc {

    /*
     * Insertar numero en un field si el arreglo esta en forma ascendente
     * Insertar el numero en la field correspondiente para que el arreglo quede de forma ascendente
     */


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10]; // 10 fields para evitar problemas
            boolean creciente=true;
            int numero,sitioN=0,j=0;

            System.out.println("Llena el arreglo");
            do{ // Repetir el bucle mientras la variable creciente sea false

                for(int i=0;i<5;i++){ // Solo 5 valores del arreglo se van a llenar
                    System.out.print((i+1)+". Introduce el numero: ");
                    a[i] = input.nextInt();
                }
                /*
                 * Comprobar si el arreglo esta ordenado de forma creciente usando el metodo de
                 * ArreglosBoolAscDesc
                 */
                for(int i=0;i<4;i++){
                    if(a[i] < a[i+1]){
                        creciente=true;
                    }
                    if(a[i] > a[i+1]){
                        creciente=false;
                        break;
                    }
                }
                if(creciente==false){ // Si creciente es false, notificar al usuario
                    System.out.println("El arreglo no esta ordenado de forma creciente, vuelva a introducirlo");
                }
            } while(creciente==false);

            System.out.print("\nIntroduce un elemento a insertar: ");
            numero = input.nextInt();

            /*
             * Verificar en que posicion va el numero.
             * Sumar 1 a la variable sitioN.
             */
            while(a[j]<numero && j<5){
                sitioN++;
                j++;
            }

            /*
             * Trasladar una posicion en el arreglo a los elementos hasta que i sea igual al valor de sitioN
             * Las iteaciones de este bucle serian:
             * 1. a[5] = a[4]
             * 2. a[4] = a[3]
             * 3. a[3] = a[2]
             * 4. a[2] = a[1]
             * 5. a[1] = a[0]
             */
            for(int i=4;i>=sitioN;i--){
                a[i+1] = a[i];
            }
            // Insertar el valor de la variable numero en la posicion establecida por la variable sitioN
            a[sitioN] = numero;

            System.out.println("El nuevo arreglo es:");
            for(int i=0;i<6;i++){
                System.out.println(a[i]);
            }
        }
    }
}

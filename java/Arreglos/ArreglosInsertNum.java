import java.util.Scanner;

public class ArreglosInsertNum {

    // Insertar un numero en una posicion especifica en un arreglo

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10]; // 10 fields para evitar problemas
            int numero,pos;

            System.out.println("Llenar el arreglo");

            // Seran 8 numeros en el arreglo
            for(int i=0;i<8;i++){
                System.out.print((i)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            System.out.print("\nIntroduce el numero que quieres insertar: ");
            numero = input.nextInt();
            System.out.print("\nIntroduce la posicion en el que quieres insertar el numero: ");
            pos = input.nextInt();

            /*
             * Iniciar un bucle con el iterador en 7 hasta que sea igual al valor de pos.
             * Suponiendo que se introducen los numeros del 1 al 8 y se quiere reemplazar la posicion 2 con
             * el numero 9, las iteraciones en este bucle serian algo asi:
             * 1. a[8] = a[7]
             * 2. a[7] = a[6]
             * 3. a[6] = a[5]
             * 4. a[5] = a[4]
             * 5. a[4] = a[3]
             * 6. a[3] = a[2]
             */
            for(int i=7;i>=pos;i--){ // 1-2-3-numero-4-5-6
                a[i+1] = a[i];
            }

            a[pos] = numero; // Insertar el numero en la posicion indicada

            System.out.println("\nEl nuevo arreglo es:");
            for(int i=0;i<9;i++){
                System.out.println("Posicion "+i+": "+a[i]);
            }
        }
    }
}

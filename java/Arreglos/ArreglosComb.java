import java.util.Scanner;

public class ArreglosComb {

    // Combinar dos arreglos
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[],b[],c[];
            a = new int[10];
            b = new int[10];
            c = new int[20]; // Este sera el contenedor de a y b, por eso es 20

            System.out.println("Primer array");
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            System.out.println("Segundo array");
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                b[i] = input.nextInt();
            }

            int j=0;
            for(int i=0;i<10;i++){
                c[j] = a[i]; //Array a, posicion 0
                j++; // Se suma 1 a J
                c[j] = b[i]; //Ahora esta en el array B, posicion 0
                j++; // Ahora J es 2, cuando se repita el loop el array A estara en la posicion 3
            }

            System.out.println("Combinacion del primero y el segundo:");
            for(int i=0;i<20;i++){
                System.out.println(c[i]);
            }
        }
    }
}

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[],nElem,aux;

            System.out.println("Introduce el numero de elementos del arreglo");
            nElem = input.nextInt();

            a = new int[nElem];

            for(int i=0;i<nElem;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            for(int i=0;i<(nElem-1);i++){
                for(int j=0;j<(nElem-1);j++){
                    if(a[j] > a[j+1]){ // Si numeroActual > numeroSiguiente
                        aux = a[j];
                        a[j] = a[j+1];
                        a[j+1] = aux;
                    }
                }
            }

            System.out.print("\nArreglo ordenado crecientemente:");
            for(int i=0;i<nElem;i++){
                System.out.println(a[i]);
            }
            System.out.print("\nArreglo ordenado decrecientemente:");
            for(int i=(nElem-1);i>=0;i--){
                System.out.println(a[i]);
            }
        }
    }
}

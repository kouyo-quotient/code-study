import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[],nElem,min,aux;

            System.out.print("Introduce el numero de elementos del arreglo: ");
            nElem = input.nextInt();

            a = new int[nElem];

            for(int i=0;i<nElem;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            for(int i=0;i<nElem;i++){
                min = i;
                for(int j=i+1;j<nElem;j++){
                    if(a[j] < a[min]){
                        min = j;
                    }
                }
                aux = a[i];
                a[i] = a[min];
                a[min] = aux;
            }

            System.out.println("Orden creciente");
            for(int i=0;i<nElem;i++){
                System.out.println(a[i]);
            }
            System.out.println("Orden descendente:");
            for(int i=(nElem-1);i>=0;i--){
                System.out.println(a[i]);
            }
        }
    }
}

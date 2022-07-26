import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[],nElem,pos,aux;

            System.out.print("Introduce el numero de elementos del arreglo: ");
            nElem = input.nextInt();

            a = new int[nElem];

            for(int i=0;i<nElem;i++){
                System.out.print((i+1)+". Introduce el numero: ");
                a[i] = input.nextInt();
            }

            for(int i=0;i<nElem;i++){
                pos = i;
                aux = a[i];

                while((pos>0) && (a[pos-1] > aux)){
                    a[pos] = a[pos-1];
                    pos--;
                }
                a[pos] = aux;
            }

            System.out.println("Orden ascendente:");
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

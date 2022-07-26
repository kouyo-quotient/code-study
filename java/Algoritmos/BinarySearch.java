import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = {1,2,3,5};
            int dato,inf,sup,mitad,i;
            boolean band = false;

            System.out.print("Introduce el numero a buscar: ");
            dato = input.nextInt();

            inf = 0;
            sup = 5;
            i = 0;
            mitad = (inf+sup)/2;

            while(inf<=sup && i<5){
                if(a[mitad] == dato){
                    band=true;
                    break;
                }
                if(a[mitad] > dato){
                    sup = mitad;
                    mitad = (inf+sup)/2;
                }
                if(a[mitad] < dato){
                    inf = mitad;
                    mitad = (inf+sup)/2;
                }
                i++;
            }

            if(band==false){
                System.out.println("No existe el numero introducido.");
            } else {
                System.out.println("Se encontro el valor "+dato+" en la posicion "+mitad);
            }
        }
    }
}

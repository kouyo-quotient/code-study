import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = {4,1,5,2,3};
            int dato;
            boolean band = false;

            System.out.print("Introduce el numero a buscar: ");
            dato = input.nextInt();

            int i=0;
            while(i<5 && band==false){
                if(a[i] == dato){
                    band=true;
                }
                i++;
            }

            if(band==false){
                System.out.println("No existe el numero introducido.");
            } else {
                System.out.println("Se encontro el valor "+dato+" en la posicion "+(i-1));
            }
        }
    }
}

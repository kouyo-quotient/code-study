import java.util.Scanner;

public class ArreglosBoolAscDesc {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10];
            boolean creciente=false,decreciente=false;

            System.out.println("Introduce los siguientes numeros");

            for(int i=0;i<10;i++){
                System.out.println("Introduce el numero "+(i+1));
                a[i] = input.nextInt();
            }

            for(int i=0;i<9;i++){
                /*
                 * Comparar el primer numero del arreglo con el siguiente
                 * la primera iteracion (en caso de ser creciente) se veria asi
                 * a[0] < a[0+1]
                 * a[1] < a[1+1] la segunda
                 * a[2] < a[2+1] la tercera
                 * y asi...
                 */
                if(a[i] < a[i+1]){ // Creciente
                    creciente = true;
                }
                if(a[i] > a[i+1]){ // Decreciente
                    decreciente = true;
                }
            }

            if(creciente==true && decreciente==false){
                System.out.println("El arreglo esta ordenado de forma creciente");
            } else if(creciente==false && decreciente==true){
                System.out.println("El arreglo esta ordenado de forma decreciente");
            } else if(creciente==true && decreciente==true){
                System.out.println("El arreglo esta desordenado");
            } else if(creciente==false && decreciente==false){
                System.out.println("Todos los numeros son iguales");
            }
        }
    }
}

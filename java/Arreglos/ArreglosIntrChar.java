import java.util.Scanner;

public class ArreglosIntrChar {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int nElementos;

            // Establecer la cantidad de letras a mostrar
            System.out.println("Introduce la cantidad de elementos");
            nElementos = input.nextInt();

            char[] letras = new char[nElementos]; // Crear un arreglo con la cantidad de caracteres especificados
            System.out.println("Introduce los elementos del arreglo");

            // Asignar un caracter a la variable letras segun la cantidad de elementos establecidos
            for(int i=0;i<nElementos;i++){
                System.out.println((i+1)+". Introduce un caracter: ");
                letras[i] = input.next().charAt(0);
            }

            // Mostrar los caracteres establecidos en la variable letra
            System.out.println("Los caracteres del arreglo son: ");
            for(int i=0;i<nElementos;i++){
                System.out.println(letras[i]);
            }
        }
    }
}

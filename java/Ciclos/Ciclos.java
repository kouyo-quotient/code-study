import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args){
        int i=1;

        while(i<10){
            System.out.println(i); // Pone en consola 1 2 ... hasta el 9
            i++;
        }
    }

    public static void main2(String[] args){
        int i=10;

        while(i>=1){
            System.out.println(i); // Pone en consola 10 9 ... hasta el 1
            i--;
        }
    }

    public static void main3(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int i=1,numero;

            System.out.println("Introduce el numero al que quieres llegar");
            numero = input.nextInt();

            do{ // Se ejecuta una vez
                System.out.println(i);
                i++;
            } while(i<=numero); // Evalua la condicion
        }
    }

    public static void main4(String[] args){
        /*
         * Tambien se puede escribir de esta otra forma:
         * for(inicializacion ; condicion ; aumento o decremento){
         *   instruccion
         * }
         */
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}

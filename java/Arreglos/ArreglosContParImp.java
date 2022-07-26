import java.util.Scanner;

public class ArreglosContParImp {

    // Contar el numero de pares e impares en un arreglo

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10];
            int contPar=0,contImp=0;

            System.out.println("Llena el arreglo");
            for(int i=0;i<10;i++){
                System.out.print(i+". Introduce el numero: ");
                a[i] = input.nextInt();

                if(a[i] % 2==0){ // Si el resultado de divir el numero introducido entre 2 es 0, se aumenta 1 al valor de la variable contPar
                    contPar++;
                } else { // Si no, aumenta 1 al valor de la variable contImp
                    contImp++;
                }
            }

            /*
             * Crear variables para los arreglos usando las cantidades de
             * las variables de contPar y contImp
             */
            int par[] = new int[contPar];
            int impar[] = new int[contImp];

            // Reiniciar las variables contPar y contImp a 0
            contPar=0;
            contImp=0;
            /*
             * Almacenar los numeros pares e impares en su arreglo correspondiente.
             * Crear un condicional que va a anexar al arreglo par o impar
             * el numero dentro de la variable a segun la iteracion usando la
             * variable contPar como iterador para establecerlo dentro del arreglo par o impar si
             * el resultado de dividir entre 2 el numero de la variable a segun la iteracion es 0.
             * La primera iteracion seria algo asi:
             * a[0] si % 2 es 0
             * par[0] = a[0]
             * entonces se le suma 1 a contPar
             *
             * Si no
             * impar[0] = a[0]
             * entonces se le suma 1 a contImp
             */
            for(int i=0;i<10;i++){
                if(a[i] % 2==0){
                    par[contPar] = a[i];
                    contPar++;
                } else {
                    impar[contImp] = a[i];
                    contImp++;
                }
            }

            System.out.println("Tabla de los numeros pares:");
            for(int i=0;i<contPar;i++){
                System.out.println(par[i]);
            }
            System.out.println("Tabla de los numeros imppares:");
            for(int i=0;i<contImp;i++){
                System.out.println(impar[i]);
            }
        }
    }
}

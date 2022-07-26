import java.util.Scanner;
 /*
  * Crear una calculadora usando switch statements
 */
public class Calculadora {

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            float numero1,numero2,sum,rest,mult,div,res;
            char operacion;

            System.out.println("Introduce dos numeros");
            numero1 = input.nextInt();
            numero2 = input.nextInt();
            System.out.println("Introduce la operacion a realizar");
            operacion = input.next().charAt(0);

            switch(operacion){
                case 's':
                case 'S': sum = numero1+numero2;
                    System.out.println("El resultado es "+sum);
                    break;
                case 'r':
                case 'R': rest = numero1-numero2;
                    System.out.println("El resultado es "+rest);
                    break;
                case 'p':
                case 'P':
                case 'm':
                case 'M': mult = numero1*numero2;
                    System.out.println("El resultado es "+mult);
                    break;
                case 'd':
                case 'D': div = numero1/numero2;
                    res = numero1%numero2;
                    System.out.println("El resultado de la division es "+div+" el residuo es: "+res);
                    break;
                default: System.out.println("El operador no es valido");
            }
        }
    }
}

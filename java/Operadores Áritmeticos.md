- Se puede crear una "calculadora" haciendo lo siguiente:
```java
Scanner entrada = new Scanner(System.in);
float numero1,numero2,suma,resta,mult,div,resto;


System.out.print("Introduce dos numeros:");
numero1 = entrada.nextFloat();
numero2 = entrada.nextFloat();

suma = numero1 + numero2; // Suma numero 1 y numero 2
resta = numero1 - numero2; // Resta numero 1 y numero 2
mult = numero1 * numero2; // Multiplica numero 1 y numero 2
div = numero1 / numero2; // Divide numero 1 y numero 2
resto = numero1 % numero2; // Dividirá numero 1 y numero 2 y va a mostrar el residuo de la división

System.out.println("La suma es: "+suma);
System.out.println("La resta es: "+resta);
System.out.println("La multiplicacion es: "+mult);
System.out.println("La division es: "+div);
System.out.println("El residuo es: "+resto);
```
- También se puede realizar operaciones de forma abreviada:
```java
int numero = 10;
numero = numero + 5
```
- O, en vez de hacer eso:
```java
numero += 5
```
`NOTA: Funciona con todos los operadores.`

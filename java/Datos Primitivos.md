**Se puede declarar un numero de dos formas:**  
```java
int entero = 12345;
int entero;
entero = 12345;
```
**Tambien se pueden declarar "constantes" que son datos que no van a cambiar:**
```java
final int = 12345;
```

### [ Numeros enteros ]

- `byte` es de 8 bits, tiene un rango de `-128 a 127`
```java
byte entero = 127;
```
- `short` es de 16 bits, tiene un rango de `-32,768 a 32,767`
```java
short entero = 32767;
```
- `int` es de 32 bits, tiene un rango de `-2,147,483,648 a 2,147,483,647`
```java
int entero = 2147483647;
```
- `long` es de 64 bits, tiene un rango de `-9,223,372,036,854,755,808 a 9,223,372,036,854,755,807`
```java
long entero = 9223372036854755807;
```


### [ Numeros decimales ]

- Con `float (32 bits)` se pueden escribir decimales, tiene un rango de `1.4e-045 a 3.4e+038`
```java
float decimal = 3.45f;
```
`NOTA: importante la f al final de los decimales`  
- Con `double (64 bits)` también se pueden escribir decimales, tiene un rango de `4.9e-324 a 1.8e+308`
```java
double decimal = 4.54;
```
`NOTA: con double no hace falta escribir la f al final de los decimales`


### [ Otros ]

- Con `char` se pueden almacenar caracteres `(ej. 1, 5, r, F, G)`, básicamente un carácter es cualquier cosa en el teclado
```java
char caracter = 'a';
```
`NOTA: char solo va a funcionar con las comillas simples`
- Con `boolean` se puede definir entre true o false
```java
boolean decision = true;
```

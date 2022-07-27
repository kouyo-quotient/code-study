- Para sacar la raiz cuadrada se hace lo siguiente:
```java
double raiz = Math.sqrt(9);
```
`NOTA: El metodo Math.sqrt solo funciona con double, por lo que 9 sería 9.0. Sin embargo, se puede forzar int haciendo:`
```java
int raiz = (int)Math.sqrt(9);
```

- Para elevar un numero a cualquier exponente, se hace lo siguiente:
```java
double base = 5, exponente = 2;
double resultado = Math.pow(base,exponente);
```
`NOTA: Al igual que Math.sqrt, Math.pow solo funciona con double`

- Para redondear un numero, se hace lo siguiente:
```java
double numero = 4.65;
long resultado = Math.round(numero);
```
`NOTA: Math.round acepta int y long`

- Para obtener un numero aleatorio (double) sería:
```java
double numero = Math.random();
```

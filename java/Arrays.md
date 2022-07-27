**Un array es una estructura de datos que permite almacenar un conjunto de datos de un mismo tipo. 
El tamaño de los arrays se declara en un primer momento y no puede cambiar durante la ejecución. 
En un arreglo, las posiciones siempre empiezan desde 0 ya que va por posiciones en la memoria.**

- Arrays unidimensionales  
La sintaxis para declarar e iniciar un array es:  
``Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[numero de valores];``  

`Ejemplos:`  
```java
int[] edad = new int[4] 
long[] edad = new long[4]
float[] edad = new float[3]
double[] edad = new double[5]
boolean[] edad = new boolean[8]
char[] sexo = new char[9]
String[] nombre = new String[10]
```

- **Dar valores**  
En caso de querer inicializar con valores propios:  
``int[] numeros = new int[3]``  
``numeros[0] = 5`` El indice/posicion 0 tendria el valor 5  
``numeros[1] = 7`` El indice/posicion 1 tendria el valor 7  
``numeros[2] = 9`` El indice/posicion 2 tendria el valor 9  

Tambien se puede hacer:  
``int[] numeros = {5,7,9}`` 5: Posicion 0, 7: Posicion 1, 9: Posicion 2

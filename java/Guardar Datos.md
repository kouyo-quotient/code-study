`En algunas versiones del SDK de Java los decimales se tienen que introducir con una , en vez de .`

**Para guardar datos se usa el metodo Scanner:**
```java
Scanner entrada = new Scanner(System.in);
```
**Y luego se declara el tipo de variable:**
```java
int numero;
```

**Los metodos para guardar los diferentes tipos de variables son:**  
`numero.nextInt` = guarda solo numeros de la variable int  
`numero.nextFloat` = guarda solo numeros de la variable float  
`numero.nextDouble` = guarda solo numeros de la variable double  
`numero.next` = te guarda texto (de String) hasta donde el metodo detecte un espacio  
`numero.nextLine` = te guarda todo el texto (de String)  
`numero.next().charAt(0)` = charAt lo que hace es guardar la primera letra si se escribe una palabra

**Guardar y mostrar datos con la consola:**
```java
System.out.println("Introduce un numero");
numero = input.nextInt();
System.out.println("El numero es: "+numero);
```

**Guardar y mostrar datos con JOptionPane:**  
Para crear un cuadro de dialogo donde introducir texto para la variable String se usa `JOptionPane.showInputDialog("");`

**Se pueden mostrar diferentes variables usando JOptionPane:**  
`string` = JOptionPane.showInputDialog("Introduce algo de texto: ");  
`int` = Integer.parseInt(JOptionPane.showInputDialog("Introduce algun numero: "));  
`double` = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun decimal: "));  
`char` = JOptionPane.showInputDialog("Introduce un caracter: ").charAt(0);  
`Se tiene que utilizar Integer.paseInt() y Double.parseDouble para los numeros ya que 
el metodo showInputDialog solo acepta Strings`

**Y para mostrarlos en ventanas emergentes seria:**
```java
JOptionPane.showMessageDialog(null, "El texto introducido es: "+cadena);
JOptionPane.showMessageDialog(null, "El numero introducido es: "+entero);
JOptionPane.showMessageDialog(null, "El decimal introducido es: "+decimal);
JOptionPane.showMessageDialog(null, "La letra introducida es: "+letra);
```

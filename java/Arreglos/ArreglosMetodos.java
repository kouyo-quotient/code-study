public class ArreglosMetodos {
    public static void main(String[] args) {
        String name = "Kouyo";

        boolean result = name.equalsIgnoreCase("kouyo");
        //Retorna un true/false statement
        int result = name.length();
        //Retorna la cantidad de letras que hay en el string
        char result = name.charAt(0);
        //Retorna el caracter en la posicion indicada
        int result = name.indexOf("o");
        //Retorna la posicion del primer caracter de izquierda a derecha indicado
        boolean result = name.isEmpty();
        //Retorna un true/false statement en caso de que la variable este vacia
        String result = name.toUpperCase();
        //Transforma la variable name a mayusculas, toLowerCase hace lo mismo pero cambia a minusculas
        String result = name.trim();
        //Remueve todos los espacios en blanco en la variable name
        String result = name.replace('o','a');
        //Reemplaza todas las letras o en la variable name con a

        System.out.println(result);
    }
}

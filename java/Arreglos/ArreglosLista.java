import java.util.ArrayList;

public class ArreglosLista {

    public static void main(String[] args) {
        /*
         * Para almacenar en el arreglo otro tipo de dato se tienen que usar las wrapper classes:
         * Integer, Double, Character, etc
         *
         */
        ArrayList<String> comida = new ArrayList<>();

        comida.add("pizza");
        comida.add("hamburguesa");
        comida.add("hotdog");

        comida.set(0, "sushi"); // .set coloca en el field 0 del arreglo el dato que se establezca
        comida.remove(2); // .remove elimina del arreglo el dato dentro del field establecido
        comida.clear(); // .clear limpia el arreglo

        // .size es lo mismo que .lenght
        for(int i=0;i<comida.size();i++){
            System.out.println(comida.get(i));
        }
    }
}

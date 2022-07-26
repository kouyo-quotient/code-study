import java.util.ArrayList;

public class ArreglosLista2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listaCompra = new ArrayList<>();

        ArrayList<String> listaPanes = new ArrayList<>();
        listaPanes.add("Pan");
        listaPanes.add("Donas");

        ArrayList<String> listaVerduras = new ArrayList<>();
        listaVerduras.add("Tomate");
        listaVerduras.add("Cebolla");
        listaVerduras.add("Pepino");

        ArrayList<String> listaBebidas = new ArrayList<>();
        listaBebidas.add("Soda");
        listaBebidas.add("Cafe");

        listaCompra.add(listaPanes);
        listaCompra.add(listaVerduras);
        listaCompra.add(listaBebidas);

        System.out.println(listaCompra);
    }
}

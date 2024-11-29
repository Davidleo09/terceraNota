import java.util.ArrayList;
import java.util.List;

public class Main32 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");

        try {
            System.out.println("Elemento en la posición 5: " + lista.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites de la lista.");
        }
        
        try {
            System.out.println("Elemento en la posición 1: " + lista.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites de la lista.");
        }
    }
}

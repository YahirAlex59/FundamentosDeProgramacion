//ArrayList de números con bucle
import java.util.ArrayList;
public class array {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        // Agregar números del 1 al 5
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        // Mostrar elementos
        System.out.println("Elementos del ArrayList:");
        for (int n : numeros) {
            System.out.println(n);
        }
        // Eliminar el número 3
        numeros.remove(Integer.valueOf(3));
        System.out.println("Después de eliminar el 3: " + numeros);
    }
}


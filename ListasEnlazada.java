import java.util.LinkedList;
import java.util.Scanner;

public class ListasEnlazada {

    private static LinkedList<Integer> lista = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== MENÚ LISTA ENLAZADA ===");
            System.out.println("1. Insertar elemento ");
            System.out.println("2. Eliminar elemento ");
            System.out.println("3. Mostrar lista     ");
            System.out.println("4. Insertar elemento al inicio");
            System.out.println("5. Modificar elemento");
            System.out.println("6. Insertar elemento ");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> insertarElemento();
                case 2 -> eliminarElemento();
                case 3 -> mostrarLista();
                case 4 -> inicio();
                case 5 -> modificarElemento(); 
                case 6 -> insertar();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void insertar() {
        mostrarLista();
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
            System.out.println("añade un elemento");
            return;
        }
        System.out.print("Ingresa el valor del elemento de referencia que este en la lista: ");
        int valorReferencia = sc.nextInt();
        int indexReferencia = lista.indexOf(valorReferencia);

        if (indexReferencia == -1) {
            System.out.println("El elemento de referencia (" + valorReferencia + ") no se encontró en la lista.");
            return;
        }
        System.out.println("eligue una opción:");
        System.out.println("¿deseas insertar antes (1):  " + valorReferencia + "?: ");
        System.out.println("¿deseas insertar despues(2):  "+ valorReferencia + "?: ");
        int modo = sc.nextInt();

        System.out.print("Ingresa el nuevo valor: ");
        int valorNuevo = sc.nextInt();

        if (modo == 1) {
            lista.add(indexReferencia, valorNuevo);
            System.out.println("Elemento " + valorNuevo + " insertado ANTES de " + valorReferencia + ".");
        } else if (modo == 2) {
            lista.add(indexReferencia + 1, valorNuevo);
            System.out.println("Elemento " + valorNuevo + " insertado DESPUÉS de " + valorReferencia + ".");
        } else {
            System.out.println("La opcion debe ser 1 o 2. no se realizó la operacion.");
        }
    }

    public static void modificarElemento() {
        mostrarLista();
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        System.out.print("Ingresa el elemento que deseas modificar: ");
        int valorAntiguo = sc.nextInt();
        int index = lista.indexOf(valorAntiguo);

        if (index == -1) {
            System.out.println("El elemento " + valorAntiguo + " no se encontró en la lista.");
        } else {
            System.out.print("Ingresa el nuevo elemento: ");
            int valorNuevo = sc.nextInt();
            lista.set(index, valorNuevo);
            System.out.println("Elemento modificado correctamente.");
        }
    }
    public static void inicio() {
        System.out.print("Ingresa un número para insertar al inicio: ");
        int f = sc.nextInt();
        lista.addFirst(f);
    }

    public static void insertarElemento() {
        System.out.print("Ingresa un número: ");
        int valor = sc.nextInt();
        lista.add(valor);
        System.out.println("Elemento agregado correctamente.");
    }

    public static void eliminarElemento() {
        mostrarLista();
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no hay nada que eliminar.");
            return;
        }
        
        System.out.print("ingresa el elemento a eliminar: ");
        int eliminar = sc.nextInt();
        if (lista.remove((Integer) eliminar)) {
            System.out.println("Elemento eliminado correctamente: " + eliminar + ").");
        } else {
            System.out.println("elemento no encontrado.");
        }
    }
    public static void mostrarLista() {
        System.out.println("----Contenido de la lista----");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i));
                if (i < lista.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(" -> null");
        }
        System.out.println("___________________________________");
    }
}
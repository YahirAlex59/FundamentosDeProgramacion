import java.util.Scanner;

public class Colas {
    static Scanner sc = new Scanner(System.in);
    static String[] cola;  
    static int frente = 0;                 
    static int fin = -1;                   
    static int total = 0;  

    public static void main(String[] args) {                
        System.out.print("Ingrese el tamaño de la cola: ");
        int max = sc.nextInt();
        sc.nextLine(); 
        cola = new String[max];
        int opcion;
        
        do {
            System.out.println("\n====== MENÚ COLA ======");
            System.out.println("1. Agregar varios elementos");
            System.out.println("2. Agregar un elemento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Eliminar toda la cola");            
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1 -> llenarCola();
                case 2 -> agregarElemento();
                case 3 -> mostrarCola();
                case 4 -> eliminarElemento();
                case 5 -> eliminarTodo();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static void llenarCola() {
        if (total == cola.length) {
            System.out.println("La cola ya está llena.");
            return;
        }

        System.out.print("¿Cuántos elementos deseas agregar?: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0) {
            System.out.println("Debe ser un número mayor que 0.");
            return;
        }

        int espacio = cola.length - total;
        if (n > espacio) {
            System.out.println("Solo hay espacio para " + espacio + " elementos.");
            n = espacio;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            String dato = sc.nextLine();
            fin = (fin + 1) % cola.length;
            cola[fin] = dato;
            total++;
        }
        System.out.println("Se agregaron " + n + " elementos a la cola.");
    }

    static void eliminarTodo() {
        cola = new String [0];
        System.out.println("Se eliminaron todos los elementos.");
        
    }

    public static void agregarElemento() {
        if (total == cola.length) {
            System.out.println("Cola llena no se pueden agregar más datos.");
            return;
        }
        System.out.print("Introduce el elemento: ");
        String dato = sc.nextLine();
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;
        total++;
        System.out.println("Agregado '" + dato + "' a la cola.");
    }

    public static void mostrarCola() {
        if (cola.length == 0) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("\n=== COLA (de primero a último) ===");
            for (int i = 0; i < total; i++) {
                int indice = (frente + i) % cola.length;
                String marca = (i == 0) ? " <- frente" : (i == total - 1) ? " <- fin" : "";
                System.out.println("[" + (i + 1) + "] " + cola[indice] + marca);
            }
    }
    }

    public static void eliminarElemento() {
        if (total == 0) {
            System.out.println("La cola está vacía — No hay elementos para eliminar.");
        } else {
           String eliminado = cola[frente];
            cola[frente] = null;
            frente = (frente + 1) % cola.length;
            total--;
            System.out.println("Elemento eliminado: '" + eliminado + "'");

         if (total == 0) {
                System.out.println("Ahora la cola está vacía.");
            } else {
                mostrarCola();
        }
     }
    }
}
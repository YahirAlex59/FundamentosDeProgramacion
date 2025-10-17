import java.util.Scanner;

public class pilas {
    static String[] pila;
    static int tope = -1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño de la pila: ");
        int max = sc.nextInt();
        sc.nextLine(); 
        pila = new String[max];

        int opcion;
        do {
            System.out.println("|========= MENU DE OPERACIONES ===========|");
            System.out.println("|1 : Llenar toda la pila                  |");
            System.out.println("|2 : Insertar cadena en la pila           |");
            System.out.println("|3 : Eliminar elemento de la pila         |");
            System.out.println("|4 : Mostrar pila                         |");
            System.out.println("|5 : Salir                                |");
            System.out.println("|=========================================|");
            System.out.print("Elige la opción que deseas: ");
            opcion = sc.nextInt();
            sc.nextLine();
        switch (opcion) {
                case 1 -> TotalPila();
                case 2 -> insertar();
                case 3 -> eliminar();
                case 4 -> mostrar();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
    public static void TotalPila() {
        for (int i = 0; i < pila.length; i++) {
            System.out.print("Ingresa el valor [" + (i + 1) + "]: ");
            pila[i] = sc.nextLine();
        }
        tope = pila.length - 1;
        System.out.println("Pila llenada correctamente.");
    }

public static void insertar() {
    if (tope == pila.length - 1) {
        System.out.println(" La pila está llena.");
    } else {
        System.out.print("Ingrese la cadena a insertar: ");
        String dato = sc.nextLine();
        tope++;
        pila[tope] = dato;
        System.out.println("Cadena \"" + dato + "\" agregada a la pila.");
    }
}

public static void eliminar() {
  if (tope == -1) {
          System.out.println("La pila está vacía, no hay nada que eliminar.");
      } else {
        
          System.out.println("Cadena eliminada: \"" + pila[tope] + "\"");
          tope--;
      }
  }
  public static void mostrar() {
      if (tope == -1) {
      System.out.println("La pila está vacía.");
  } else {
        System.out.println("Contenido de la pila:");
      for (int i = tope; i >= 0; i--) {
          System.out.println("[" + pila[i] + "]");
        }
    }
}
}

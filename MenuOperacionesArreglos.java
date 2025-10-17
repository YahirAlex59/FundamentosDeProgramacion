import java.util.Scanner;

public class MenuOperacionesArreglos {
    static int[] arreglo = new int[0];
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        int opcion;
    do {
    System.out.println("|====MENU DE  OPERACIONES====|");
    System.out.println("|====ELIGE UNA OPERACION=====|");
    System.out.println("|1 : ALMACENAR VALORES       |");
    System.out.println("|2 : RECORRER EL ARREGLO  ACE|");
    System.out.println("|3 : RECORRER EL ARREGLO  DEC|");
    System.out.println("|4 : BUSCAR ELEMENTO         |");
    System.out.println("|5 : MODIFICAR ELEMENTO      |");
    System.out.println("|6 : ELIMINAR UN ELEMENTO    |");
    System.out.println("|7 : ELIMINAR TODO EL ARREGLO|");
    System.out.println("|8 : ORDENAR ACENDENTE       |");
    System.out.println("|9 : ORDENAR DECENDENTE      |");
    System.out.println("|0 : SALIR                   |");
    opcion = leerEntero("Elige una opción: ");

        switch (opcion) {
                case 1 -> guardarValores();
                case 2 -> recorrerAscendente();
                case 3 -> recorrerDescendente();
                case 4 -> buscarElemento();
                case 5 -> modificarElemento();
                case 6 -> eliminarElemento();
                case 7 -> eliminarTodo();
                case 8 -> ordenarAscendente();
                case 9 -> ordenarDescendente();
                case 0 -> System.out.println("¡Adiós!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
    static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.");
            }
        }
    }
    static void mostrarArreglo() {
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
        System.out.println();
    }

    static void guardarValores() {
        int n = leerEntero("¿Cuántos valores deseas guardar? ");
        arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = leerEntero("Ingresa el valor |" + (i + 1) + "|: ");
        }
        System.out.println("Valores almacenados correctamente: ");
        for (int valorarreglo : arreglo) {
                System.out.print("["+valorarreglo+"]");
                System.out.println();
           }
        
    }

     static void recorrerAscendente() {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.println("Recorrido ascendente: " );
        
          for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
         }
         System.out.println();
        }
   
    static void recorrerDescendente() {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.print("Recorrido descendente: " );
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }

    static void buscarElemento() {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        int valor = leerEntero("Ingresa el valor a buscar: ");
        boolean encontrado = false;
        int i = 0;
        while (i < arreglo.length && !encontrado) {
            if (arreglo[i] == valor) {
                System.out.println(" Valor encontrado en la posición " + (i + 1));
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println(" Valor no encontrado.");
        }
        mostrarArreglo();
    }


    static void modificarElemento() {
       if (arreglo.length == 0) {
        System.out.println("El arreglo está vacío.");
        return;
    }
    mostrarArreglo();
    int valorBuscado = leerEntero("Ingresa el valor que deseas modificar: ");
    boolean encontrado = false;
    int i = 0;
    while (i < arreglo.length && !encontrado) {
        if (arreglo[i] == valorBuscado) {
            int nuevo = leerEntero("Nuevo valor para reemplazar " + valorBuscado + ": ");
            arreglo[i] = nuevo;
            encontrado = true;
            System.out.println("Elemento modificado correctamente.");
        }
        i++;
    }

    if (!encontrado) {
        System.out.println("El valor no se encontró en el arreglo.");
    }
    mostrarArreglo();
}

    static void eliminarElemento() {
    if (arreglo.length == 0) {
         System.out.println("El arreglo está vacío.");
        return;
    }
        int pos = leerEntero("Ingresa la posición a eliminar (0 - " + (arreglo.length - 1) + "): ");
        if (pos >= 0 && pos < arreglo.length) {
         int[] nuevo = new int[arreglo.length - 1];
        int i = 0, j = 0;
        while (i < arreglo.length) {
        if (i != pos) {
            nuevo[j] = arreglo[i];
            j++;
                }
            i++;
         }
         arreglo = nuevo;
         System.out.println("Elemento eliminado correctamente.");
         mostrarArreglo();
        } else {
            System.out.println("Posición inválida.");
        }
    }

    static void eliminarTodo() {
        arreglo = new int[0];
        System.out.println("Se eliminaron todos los elementos.");
    }

    static void ordenarAscendente() {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            int j = i + 1;
            while (j < arreglo.length) {
             if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
                j++;
            }
            int temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
        }
        System.out.println("Arreglo ordenado ascendente:");
        mostrarArreglo();
    }
    static void ordenarDescendente() {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int max = i;
            int j = i + 1;
            while (j < arreglo.length) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
                j++;
            }
            int temp = arreglo[i];
            arreglo[i] = arreglo[max];
            arreglo[max] = temp;
        }
        System.out.println("Arreglo ordenado descendente:");
        mostrarArreglo();
    }
}
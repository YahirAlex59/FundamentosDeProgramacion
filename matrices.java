import java.util.Scanner;
public class matrices {
    static int[][] matriz = new int [0][0];
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

    static void recorrerDescendente() {
        if (matriz.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.println("Recorrido Descendente: " );
        
          for (int i = matriz.length-1; i>=0; i--) {
            for (int j = matriz[i].length-1; j>= 0; j--){
            System.out.print("[" + matriz[i][j] + "]");
         }
         System.out.println();
        }
    }

static void recorrerAscendente() {
        if (matriz.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.println("Recorrido ascendente: " );
        
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz[i].length; j++){
            System.out.print("[" + matriz[i][j] + "]");
         }
         System.out.println();
        }
    }
public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.");
            }
        }
    }
 static void guardarValores() {
    System.out.println("|ingrasa tamaño de matriz|");
        int A = leerEntero("Alto de la matriz: ");
        int B = leerEntero("Ancho de la matriz: ");

        matriz = new int[A][B];

        for (int i = 0; i < A; i++) {
          for (int j = 0 ; j < B; j++){
            matriz[i][j] = leerEntero("Ingresa el valor |" + (i + 1)+"|"+"|" + (j+1)+"|: ");
          }
        }
        System.out.println("Valores almacenados correctamente: ");
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        
    }
    static void buscarElemento() {
    if (matriz.length == 0) {
        System.out.println("La matriz está vacía.");
        return;
    }

    int valor = leerEntero("Ingresa el valor a buscar: ");
    boolean encontrado = false;

    System.out.println("Buscando el valor " + valor + " en la matriz...");

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == valor) {
                System.out.println("→ Valor encontrado en la posición [" + (i+ 1)+ "][" + (j +1) + "]");
                encontrado = true;
                recorrerAscendente();
            }
        }
    }

    if (!encontrado) {
        System.out.println("Valor no encontrado.");
    }
}
    static void modificarElemento() {
        if (matriz.length == 0) {
            System.out.println("La matriz está vacía.");
            return;
        }
        int fila = leerEntero("Fila del elemento a modificar: ");
        int columna = leerEntero("Columna del elemento a modificar: ");
        fila --;
        columna --;
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            int nuevoValor = leerEntero("Nuevo valor: ");
            matriz[fila][columna] = nuevoValor;
            System.out.println("Elemento modificado.");
            recorrerAscendente();
        } else {
            System.out.println("Elementos fuera de rango.");
        }
    }
static void eliminarElemento() {
    if (matriz.length == 0) {
        System.out.println("La matriz está vacía.");
        return;
        }
        int fila = leerEntero("Fila del elemento a eliminar: ");
        int columna = leerEntero("Columna del elemento a eliminar: ");
        fila --;
        columna --;
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            matriz[fila][columna] = 0;
            System.out.println("Elemento eliminado (valor puesto en 0).");
            recorrerAscendente();
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }
     static void eliminarTodo() {
        matriz = new int[0][0];
        System.out.println("Matriz eliminada.");
    }
    static void rellenarDesdePlano(int[] plano) {
    int in = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = plano[in++];
        }
    }
}
    static void ordenarAscendente() {
    if (matriz.length == 0) {
        System.out.println("La matriz está vacía.");
        return;
    }
    int total = matriz.length * matriz[0].length;
    int[] plano = new int[total];
    int in = 0;
    for (int[] fila : matriz) {
        for (int valor : fila) {
            plano[in++] = valor;
        }
    }
    for (int i = 0; i < plano.length - 1; i++) {
        for (int j = 0; j < plano.length - 1 - i; j++) {
            if (plano[j] > plano[j + 1]) {
                int temp = plano[j];
                plano[j] = plano[j + 1];
                plano[j + 1] = temp;
            }
        }
    }
    rellenarDesdePlano(plano);
    System.out.println("Matriz ordenada ascendentemente.");
    recorrerAscendente();
}
static void ordenarDescendente() {
    if (matriz.length == 0) {
        System.out.println("La matriz está vacía.");
        return;
    }
    int total = matriz.length * matriz[0].length;
    int[] plano = new int[total];
    int index = 0;
    for (int[] fila : matriz) {
        for (int valor : fila) {
            plano[index++] = valor;
        }
    }
    for (int i = 0; i < plano.length - 1; i++) {
        for (int j = 0; j < plano.length - 1 - i; j++) {
            if (plano[j] < plano[j + 1]) {
                int temp = plano[j];
                plano[j] = plano[j + 1];
                plano[j + 1] = temp;
            }
        }
    }
    rellenarDesdePlano(plano);
    System.out.println("Matriz ordenada descendentemente.");
    recorrerAscendente();
}
}

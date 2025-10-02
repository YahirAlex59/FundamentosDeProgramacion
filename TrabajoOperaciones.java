import java.util.Arrays;
import java.util.Scanner;
public class TrabajoOperaciones {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    System.out.println("INGRESA EL TAMAÑO DEL ARREGLO");
     int N = sc.nextInt();
        int[] Arreglo = new int[N];
        for (int i = 0; i < N ; i++ ) {
            System.out.println("INGRESA LOS ELEMENTOS DEL ARREGLO  " + (i + 1)+ " : ");
            Arreglo[i] = sc.nextInt();
        }
do {
    System.out.println("|====MENU DE  OPERACIONES====|");
    System.out.println("|====ELIGE UNA OPERACION=====|");
    System.out.println("|1 : RECORRER EL ARREGLO     |");
    System.out.println("|2 : BUSCAR ELEMENTO         |");
    System.out.println("|3 : MODIFICAR ELEMENTO      |");
    System.out.println("|4 : ELIMINAR UN ELEMENTO    |");
    System.out.println("|5 : ELIMINAR TODO EL ARREGLO|");
    System.out.println("|6 : ORDENAR ACENDENTE       |");
    System.out.println("|7 : ORDENAR DECENDENTE      |");
    System.out.println("|0 : SALIR                   |");
    
    System.out.print("Elija una opción: ");
    opcion = sc.nextInt();

    switch (opcion) {
        case 1: 
            System.out.println("RECORRER EL ARREGLO |DECENDETE O ACENDENTE|");
                sc.nextLine();
                String x = sc.nextLine();
                if (x.equalsIgnoreCase("ACENDENTE")) {
            System.out.println("LOS ELEMENTOS DEL ARREGLO ACENDENTE SON : ");
           for (int valorarreglo : Arreglo) {
                System.out.println(valorarreglo);
           }}
            else {
            System.out.println("LOS ELEMENTOS DEL ARREGLO DECENDENTE SON : ");
           for (int i = N - 1; i >= 0; i--) {
                System.out.println(Arreglo[i]);
            }
        }
         break;
        case 2:
            System.out.println("BUSCAR ELEMENTO");
            System.out.print("INGRESA EL ELEMENTO A BUSCAR : ");
            int buscar = sc.nextInt();
            boolean encontrado = false;
            for (int buscado : Arreglo) {
               if (buscado == buscar) {
                   encontrado = true;
               }
            }
                   if (encontrado) {
                    
                    System.out.println("El elemento " + buscar + " está en la lista."); 
                   } else {
                    System.out.println("El elemento " + buscar + " no fue encontrado.");
                  }
            break;
        case 3:
            System.out.println("MODIFICAR ELEMENTO");
            System.out.println("======arreglo=======");
            for (int i = 0; i < Arreglo.length; i++) {
        System.out.println("[" + i + "] = " + Arreglo[i]);}
        System.out.print("Ingresa la posición a modificar (0 a " + (Arreglo.length - 1) + "): ");
    int pos = sc.nextInt();

    if (pos >= 0 && pos < Arreglo.length) {
        System.out.print("Ingresa el nuevo valor: ");
        int nuevo = sc.nextInt();
        Arreglo[pos] = nuevo;
        System.out.println("Elemento modificado correctamente.");
    } else {
        System.out.println("Posición inválida. No se realizó ningún cambio.");
    }
    System.out.println("======arreglo modificado=======");
    for (int arreglomod : Arreglo) {
        System.out.println(arreglomod);
    }
    break; 
    case 4:
        System.out.println("ELIMINAR UN ELEMENTO");
         System.out.println("======arreglo=======");
            for (int i = 0; i < Arreglo.length; i++) {
        System.out.println("[" + i + "] = " + Arreglo[i]);}
        System.out.println("elije la posicion del elemento a eliminar");
        int eliminar = sc.nextInt();
        if (eliminar >= 0 && eliminar < Arreglo.length) {
            int NEW = 0;
            Arreglo [eliminar] = NEW;
            System.out.println("Elemento eliminado correctamente.");
        }
        else {
            System.out.println("Posición inválida. No se realizó ningún cambio.");
        }
            System.out.println("======arreglo modificado=======");
        for (int arreglomod : Arreglo) {
        System.out.println(arreglomod);
        }
        break;
        case 5:
            System.out.println("ELIMINAR TODO EL ARREGLO");
            for (int i = 0; i < Arreglo.length; i++) {
                Arreglo[i] = 0;
            }
            System.out.println("======arreglo modificado=======");
            for (int arreglomod : Arreglo) {
        System.out.println(arreglomod);
        }
        break;
        case 6:
        System.out.println("ORDENAR ACENDENTE");
        Arrays.sort(Arreglo);
        System.out.println("modificado");
        for (int arreglomod : Arreglo) {
        System.out.println(arreglomod);
        }
        break;
        case 7:
        Arrays.sort(Arreglo);
        for (int i = Arreglo.length-1; i >= 0; i--){
        System.out.println(Arreglo[i]);
        }
        break;
    } 
    } while (opcion != 0);
    sc.close();
}

}


import java.util.Scanner;
public class TrabajoOperaciones {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("INGRESA EL TAMAÑO DEL ARREGLO");
     int N = sc.nextInt();
        int[] Arreglo = new int[N];
        for (int i = 0; i < N ; i++ ) {
            System.out.println("INGRESA LOS ELEMENTOS DEL ARREGLO" + (i + 1)+ ": ");
            Arreglo[i] = sc.nextInt();
        }
    System.out.println("|====MENU DE  OPERACIONES====|");
    System.out.println("|====ELIGE UNA OPERACION=====|");
    System.out.println("|1 : RECORRER EL ARREGLO     |");
    System.out.println("|2 : BUSCAR ELEMENTO         |");
    System.out.println("|3 : MODIFICAR ELEMENTO      |");
    System.out.println("|4 : ELIMINAR UN ELEMENTOS   |");
    System.out.println("|5 : ELIMINAR TODO EL ARREGLO|");
    System.out.println("|6 : ORDENAR ACENDENTE       |");
    System.out.println("|7 : ORDENAR DECENDENTE      |");
    System.out.println("|0 : SALIR                   |");

    System.out.print("Elija una opción: ");
    int opcion = sc.nextInt();
    
    switch (opcion) {
        case 1: 
            System.out.println("LOS ELEMENTOS DEL ARREGLO SON: ");
            for (int i = 0; i < Arreglo.length ; i++ ) {
                System.out.println(Arreglo[i]);
            }
            
            break;
}
}
}

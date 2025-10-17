package SegundoParcial.Ejemplos;
import java.util.Scanner;
public class arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("cuantos valores quieres introducir maximo 10");
        int T = sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            System.out.println("introduce un valor para la posicion "+i);
            int valor = sc.nextInt();
            A[i]=valor;
        }
        System.out.println("los valores del arreglo  son: ");
        for (int i=1;i<T;i++)
        {
            System.out.println(A[i]+"  ");
        }
        sc.close();
        System.out.println("los valores del arreglo  son: ");
        for (int i=0;i < A.length;i++)
        {
            System.out.println(A[i]+"  ");
        System.out.println("utilizando for each");
        for (int p : A) {
            System.out.println(p+ "  ");
        }

        }
    }
}

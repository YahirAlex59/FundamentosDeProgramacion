import java.util.Scanner;

public class RegistroCompleto {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] promedios = new double[n];

    for (int i = 0; i < n; i++) {
    System.out.print("Nombre del estudiante " + (i + 1) + ": ");
    nombres[i] = sc.nextLine();
    System.out.print("Edad de " + nombres[i] + ": ");
    edades[i] = sc.nextInt();
    System.out.print("Promedio de " + nombres[i] + ": ");
    promedios[i] = sc.nextDouble();
    sc.nextLine();
    }
    System.out.println("\n=== LISTADO DE ESTUDIANTES ===");
    System.out.printf("%-15s %-10s %-10s\n", "Nombre", "Edad", "Promedio");
     for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f\n", nombres[i], edades[i], promedios[i]);
        }
        sc.close();
    }
}

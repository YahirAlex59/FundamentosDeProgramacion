import java.util.Scanner;

public class CalificacionesReprobadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas capturar? ");
        int n = sc.nextInt();

        double[] calificaciones = new double[n];
        int reprobadas = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        System.out.println("\n=== CALIFICACIONES ===");
        for (double cal : calificaciones) {
            System.out.print(cal + " | ");
            if (cal < 7) {
                reprobadas++;
            }
        }

        System.out.println("\nTotal reprobadas: " + reprobadas);

        if (reprobadas > 0) {
            System.out.print("Calificaciones reprobadas: ");
            for (double cal : calificaciones) {
                if (cal < 7) {
                    System.out.print(cal + " ");
                }
            }
        }

        sc.close();
    }
}

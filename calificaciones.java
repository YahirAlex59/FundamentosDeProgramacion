import java.util.Scanner;

public class calificaciones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Número de estudiantes: ");
        int n = sc.nextInt();
        System.out.print("Número de exámenes: ");
        int m = sc.nextInt();
        double[][] calificaciones = new double[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < m; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
            }
        }
        double[] promedios = promedioAlumnos(calificaciones);
        System.out.println("Promedio por alumno:");
        for (int i = 0; i < n; i++) System.out.println("Alumno " + (i + 1) + ": " + promedios[i]);
        mejores(promedios);
        inferiores(promedios);
        examenMasAlto(calificaciones);
        examenMasBajo(calificaciones);
    }
    static double[] promedioAlumnos(double[][] cal) {
        double[] prom = new double[cal.length];
        for (int i = 0; i < cal.length; i++) {
            double suma = 0;
            for (int j = 0; j < cal[i].length; j++) suma += cal[i][j];
            prom[i] = suma / cal[i].length;
        }
        return prom;
    }
    static void mejores(double[] prom) {
        double max = prom[0];
        for (double p : prom) if (p > max) max = p;
        System.out.println("Alumnos con promedio entre 9 y 10:");
        for (int i = 0; i < prom.length; i++)
            if (prom[i] >= 9 && prom[i] <= 10) System.out.println("Alumno " + (i + 1) + ": " + prom[i]);
    }
    static void inferiores(double[] prom) {
        System.out.println("Alumnos con promedio menor a 7:");
        for (int i = 0; i < prom.length; i++)
            if (prom[i] < 7) System.out.println("Alumno " + (i + 1) + ": " + prom[i]);
    }

    static void examenMasAlto(double[][] cal) {
        double max = -1;
        int ex = 0;
        for (int j = 0; j < cal[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < cal.length; i++) suma += cal[i][j];
            double prom = suma / cal.length;
            if (prom > max) {
                max = prom;
                ex = j;
            }
        }
        System.out.println("Examen con promedio más alto: " + (ex + 1));
    }
    static void examenMasBajo(double[][] cal) {
        double min = 11;
        int ex = 0;
        for (int j = 0; j < cal[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < cal.length; i++) suma += cal[i][j];
            double prom = suma / cal.length;
            if (prom < min) {
                min = prom;
                ex = j;
            }
        }
        System.out.println("Examen con promedio más bajo: " + (ex + 1));
    }
}
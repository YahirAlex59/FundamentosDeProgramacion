import java.util.Scanner;

public class CompaniaTransporte {
    static Scanner sc = new Scanner(System.in);
    static String[] nombres = new String[5];
    static int[][] horas = new int[5][6];
    static double[] sueldoHora = new double[5];
    static String[] diaDescanso = new String[5];
    static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado"};

    public static void main(String[] args) {
        System.out.println("======== COMPAÑÍA DE TRANSPORTE =======");
        ingresarDatos();
        calcularYMostrarReporte();
    }
    static void ingresarDatos() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("\nChofer #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            diaDescanso[i] = pedirDiaDescanso();
            sueldoHora[i] = pedirSueldoHora();
            System.out.println("Ingrese horas trabajadas (solo 6 días, excepto su descanso):");
            for (int j = 0; j < 6; j++) {
            if (dias[j].equalsIgnoreCase(diaDescanso[i])) {
                horas[i][j] = 0;
                continue;
                }
                horas[i][j] = pedirHorasValidas(dias[j]);
            }
        }
    }
    static String pedirDiaDescanso() {
     while (true) {
            System.out.print("Día de descanso (Lunes a Sábado): ");
            String dia = sc.nextLine().trim();
            boolean invalido = false;
            for (String d : dias) {
            if (d.equalsIgnoreCase(dia)) {
                invalido = true;
                break;
                }
            }
            if (invalido) return dia;
            else System.out.println("Día inválido. Escribe un día válido");
        }
    }

    static double pedirSueldoHora() {
        double sueldo = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print("Sueldo por hora: ");
            if (sc.hasNextDouble()) {
                sueldo = sc.nextDouble();
                if (sueldo > 0) valido = true;
                else System.out.println("El sueldo debe ser mayor a 0.");
            } else {
                System.out.println("Ingresa un número válido.");
                sc.next();
            }
        }
        sc.nextLine();
        return sueldo;
    }
    static int pedirHorasValidas(String dia) {
        int h = -1;
        while (h < 0 || h > 24) {
        System.out.print(dia + ": ");
        if (sc.hasNextInt()) {
            h = sc.nextInt();
            if (h < 0 || h > 24) {
            System.out.println("Las horas no pueden ser menores a 0 ni mayores a 24.");
        }
            } else {
            System.out.println("Ingresa un número válido.");
            sc.next();
            }
        }
        sc.nextLine();
        return h;
    }
    static void calcularYMostrarReporte() {
        int[] totalHoras = new int[5];
        double[] sueldoSemanal = new double[5];
        double totalEmpresa = 0;
        for (int i = 0; i < 5; i++) {
            int suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += horas[i][j];
            }
            totalHoras[i] = suma;
            sueldoSemanal[i] = suma * sueldoHora[i];
            totalEmpresa += sueldoSemanal[i];}
        int mayorLunes = -1;
        String choferMasLunes = "";
        for (int i = 0; i < 5; i++) {
            if (mayorLunes < horas[i][0]) {
                mayorLunes = horas[i][0];
                choferMasLunes = nombres[i];
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("=============== REPORTE SEMANAL ================");
        System.out.println("["+"Nombre"+"]"+"["+"Descanso"+"]"+"["+"Sueldo"+"]"+"["+"Total Horas"+"]"+"["+"Sueldo Semanal"+"]");

        for (int i = 0; i < 5; i++) {
            System.out.println("["+nombres[i]+"]" + "\t\t" + "["+diaDescanso[i]+"]" + "\t\t" + "["+sueldoHora[i]+"]" +"\t\t" + "["+totalHoras[i]+"]" + "\t\t" + "["+sueldoSemanal[i]+"]");
        }
        System.out.println("\nTotal que pagará la empresa: $" + totalEmpresa);
        System.out.println("Chofer con más horas el lunes: " + choferMasLunes + " (" + mayorLunes + " horas)");
        
        System.out.println("-----------------------------------------------");
    }
}
import java.util.Scanner;
public class companiatelefonica2 {    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Duración de la llamada (en minutos): ");
        int minutos = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Qué día es hoy? ");
        String dia = sc.nextLine().toLowerCase();
        double total = 0;

        if (minutos <= 5) {
            total = minutos * 1.0;
        } else if (minutos <= 8) {
            total = 5 * 1.0 + (minutos - 5) * 0.8;
        } else if (minutos <= 10) {
            total = 5 * 1.0 + 3 * 0.8 + (minutos - 8) * 0.7;
        } else {
            total = 5 * 1.0 + 3 * 0.8 + 2 * 0.7 + (minutos - 10) * 0.5;
        }
        double impuesto = 0;
        if (dia.equals("domingo")) {
            impuesto = total * 0.03;
        } else {
            System.out.print("¿La llamada fue en matutino o vespertino? ");
            String turno = sc.nextLine().toLowerCase();
            if (turno.equals("matutino")) {
                impuesto = total * 0.15;
            } else {
                impuesto = total * 0.10;
            }
        }
        System.out.println("Debe pagar: $" + (total + impuesto));
        sc.close();
    }
}
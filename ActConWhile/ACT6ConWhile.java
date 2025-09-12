package ActConWhile;
import java.util.Scanner;

public class ACT6ConWhile {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lop;
        do {
        int personas;
        String dia;
        boolean membresia;
        System.out.print("Número de personas:");
        personas = sc.nextInt();
        sc.nextLine();
        System.out.print("Día de la semana:");
        dia = sc.nextLine();

        System.out.print("¿Tienes membresía? (true/false):");
        membresia = sc.nextBoolean();
        double total = 0;
        if (dia.equals("miercoles")) {
            total = personas * 30;
        } else if (dia.equals("jueves")) {
         int parejas = personas / 2;
         int individuales = personas % 2;
         total = parejas * 75 + individuales * 50;
        } else {
            total = personas * 50;
        }
        if (membresia) {
            total *= 0.10;
        }
        System.out.println("El precio total es: $" + total);
        System.out.println("desaea continuar? (si/no): ");
        lop = sc.next();
        } while (lop.equalsIgnoreCase("si"));
        sc.close();
    }     
}

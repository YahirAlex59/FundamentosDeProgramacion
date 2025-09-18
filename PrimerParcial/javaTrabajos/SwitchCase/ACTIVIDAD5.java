package PrimerParcial.javaTrabajos.SwitchCase;
import java.util.Scanner;
public class ACTIVIDAD5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes;

        System.out.print("Ingresa tu día de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        mes = sc.nextInt();

        String signo;

        if (mes == 1) {
            if (dia < 20) signo = "Capricornio";
            else signo = "Acuario";
        } else if (mes == 2) {
            if (dia < 19) signo = "Acuario";
            else signo = "Piscis";
        } else if (mes == 3) {
            if (dia < 21) signo = "Piscis";
            else signo = "Aries";
        } else if (mes == 4) {
            if (dia < 20) signo = "Aries";
            else signo = "Tauro";
        } else if (mes == 5) {
            if (dia < 21) signo = "Tauro";
            else signo = "Géminis";
        } else if (mes == 6) {
            if (dia < 21) signo = "Géminis";
            else signo = "Cáncer";
        } else if (mes == 7) {
            if (dia < 23) signo = "Cáncer";
            else signo = "Leo";
        } else if (mes == 8) {
            if (dia < 23) signo = "Leo";
            else signo = "Virgo";
        } else if (mes == 9) {
            if (dia < 23) signo = "Virgo";
            else signo = "Libra";
        } else if (mes == 10) {
            if (dia < 23) signo = "Libra";
            else signo = "Escorpio";
        } else if (mes == 11) {
            if (dia < 22) signo = "Escorpio";
            else signo = "Sagitario";
        } else if (mes == 12) {
            if (dia < 22) signo = "Sagitario";
            else signo = "Capricornio";
        } else {
            signo = "Mes inválido";
        }

        System.out.println("Tu signo zodiacal es: " + signo);

        sc.close();
    }
}
import java.util.Scanner;
public class ACTIVIDAD1 {
    public static void main(String[] args) {
        int dia;
        Scanner Scanner = new Scanner (System.in);
    System.out.println("escibre un numero del 1-12 para saber el mes y cuantos dias tiene");
        dia = Scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Enero 31 dias");
            break;
            case 2:
                System.out.println("Febrero 28 dias");
            break;
            case 3:
                System.out.println("Marzo 31 dias");
            break;
            case 4:
                System.out.println("Abril 30 dias");
            break;
            case 5:
                System.out.println("Mayo 31 dias");
            break;
            case 6:
                System.out.println("Junio 30 dias");
            break;
            case 7:
                System.out.println("Julio 31 dias");
            break;
            case 8:
                System.out.println("Agosto 31 dias");
            break;
            case 9:
                System.out.println("Septiembre 30 dias");
            break;
            case 10:
                System.out.println("Octubre 31 dias");
            break;
            case 11:
                System.out.println("Noviembre 30 dias");
            break;
            case 12:
                System.out.println("Diciembre 31 dias");
            break;
            default:
                System.out.println("no existe ese mas");
            break;
        }
        Scanner.close();
    }
}

import java.util.Scanner;
public class ActLibro6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int Ahorro = 0;
        int Mes = 1;
      while (Mes <= 12) {
        System.out.println("Ingrese el ahorro del mes " + Mes + ": ");
        int AhorroMensual = sc.nextInt();
        Ahorro = Ahorro + AhorroMensual;
          System.out.println("Ahorro al final del mes " + Mes + "  es  " + Ahorro);
        Mes = Mes + 1;
       
      }
      System.out.println("Ahorro del año " + Ahorro);
        sc.close();
    }
}
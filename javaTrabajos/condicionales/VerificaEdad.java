package condicionales;
import java.util.Scanner;

public class VerificaEdad {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
      System.out.print("ingrese su edad");
      int edad = sc.nextInt();
      if (edad < 18) {
        System.out.println("menor de edad");
      } else if (edad >= 18 && edad < 65) {
        System.out.println("mayor de edad");
      } else if (edad >= 64)
      System.out.println("adulto mayor");
       sc.close();
   }
}
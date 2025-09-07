package condicionales;
import java.util.Scanner;
public class velocidad {
    public static void main(String[] args) {
    int Velocidad;
    String Cumpleaños;
    Scanner scanner = new Scanner (System.in);
    System.out.println("ingrese su velocidad");
    Velocidad = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Es tu cumpleaños?");
    Cumpleaños = scanner.nextLine();
    if (Cumpleaños.equals("si")

    ) {
        System.out.println("no hay multa");  
    }else if (Velocidad <= 60) {
    System.out.println("no hay multa");
    }else if (Velocidad > 60 && Velocidad <= 80){
    System.out.println("multa pequeña");
    }else 
    System.out.println("multa grande");
    scanner.close();
    }
}

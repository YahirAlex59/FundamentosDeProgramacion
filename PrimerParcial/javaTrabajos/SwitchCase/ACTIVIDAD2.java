package PrimerParcial.javaTrabajos.SwitchCase;
import java.util.Scanner;
public class ACTIVIDAD2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operacion;

        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el operador +, -, *, /): ");
        sc.nextLine();
        operacion = sc.nextLine();

        switch (operacion) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0)
                    System.out.println("Resultado: " + (num1 / num2));
                else
                    System.out.println("Error: división por cero");
                break;
            default:
                System.out.println("Operador inválido");
        }
        sc.close();
    }
}
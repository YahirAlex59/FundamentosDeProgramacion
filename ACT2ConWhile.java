import java.util.Scanner;

public class ACT2ConWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String con = "si";
        
        while (con.equalsIgnoreCase("si")) {
        float num1, num2;
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
        System.out.println("desaes realizar otra operacion? si/no");
        con = sc.nextLine();
    }
        System.out.println("operacionTerminada");
        sc.close();
    }
}


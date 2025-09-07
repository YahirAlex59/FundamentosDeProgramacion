import java.util.Scanner;
public class ACTIVIDAD3SwitchCase {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double lado, base, altura, radio, area = 0;

        System.out.println("MENÚ DE ÁREAS");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.print("Elija una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = sc.nextDouble();
                area = lado * lado;
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("El área del rectángulo es: " + area);
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                altura = sc.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            case 4:
                System.out.print("Ingrese el radio del círculo: ");
                radio = sc.nextDouble();
                area = Math.PI * radio * radio;
                System.out.println("El área del círculo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
        }
    sc.close();
    }
}

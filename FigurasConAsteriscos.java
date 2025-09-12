import java.util.Scanner;

public class FigurasConAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa n: ");
        int n = sc.nextInt();
        System.out.println("Rectángulo:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("nTriángulo invertido:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pirámide:");
        for (int i = 1; i <= n; i++) {
            for (int espacio = 1; espacio <= n - i; espacio++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
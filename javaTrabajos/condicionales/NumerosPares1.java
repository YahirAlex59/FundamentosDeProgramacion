package condicionales;
import java.util.Scanner;
public class NumerosPares1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el valor de a");
        a = scanner.nextInt();
        System.out.println("introduce el valor de b");
        b = scanner.nextInt();
        System.out.println("introduce el valor de c");
        c = scanner.nextInt();
            if (a+b == 10 || b+c == 10 || a+c == 10) {
             System.out.println("10");  
            } else {
            if ( a+b == b+c + 10 || a+b == a+c + 10 )
            System.out.println("5");
            else {
            System.out.println("0");
            scanner.close();
} } } }
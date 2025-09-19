package TareasUsandoFor;
import java.util.Scanner;
public class TareaPiramideDeNumeros {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Ingrese un numero para generar la piramide de numeros");
        int num = Sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Sc.close();
    }
}
                                                                
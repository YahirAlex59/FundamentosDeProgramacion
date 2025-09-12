import java.util.Scanner;
public class TareaTablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero para ver su tabla de multiplicar");
        numero = Sc.nextInt();
        if (numero != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("operacion terminada");
        }
    }
}

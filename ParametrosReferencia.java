import java.util.Scanner;
class Caja {
int valor;
}
public class ParametrosReferencia {
public static void duplicar(Caja c) {
c.valor = c.valor * 2; // modificamos atributo del objeto
System.out.println("Dentro del método: " + c.valor);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Caja miCaja;
do {
	miCaja = new Caja();
	System.out.println("itroduce el valor de la caja");
	miCaja.valor = sc.nextInt();
	System.out.println("Antes de llamar al método: " +
	miCaja.valor);
	duplicar(miCaja);
	System.out.println("Después de llamar al método: " +
	miCaja.valor);
} while(miCaja.valor != 0);
sc.close();
System.out.println("Fin del programa");
}
}
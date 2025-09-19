import java.util.Scanner;
public class EjercicioValor {
	// Método que intenta intercambiar dos enteros
	public static void intercambiar(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Dentro del método -> a: " + a + ", b:" + b);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x, y;
do {
	System.out.println("introduce valores para x e y");
	x = sc.nextInt();
	y = sc.nextInt();
	System.out.println("Antes del método -> x: " + x + ", y: " + y);
	intercambiar(x, y);
	System.out.println("Después del método -> x: " + x + ", y:" + y);
} while (x != 0 && y != 0);
	sc.close();
	System.out.println("Fin del programa");
}
}
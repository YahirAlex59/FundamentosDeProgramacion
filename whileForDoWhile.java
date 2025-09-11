public class whileForDoWhile {

	public static void main(String args[]) {
		int n;
		int resultado;
		resultado = 0;
		n = 1;
		while (n<10) {
			resultado = resultado+n;
			n = n+1;
		}
		System.out.println("resultado while: "+resultado);
		n = 1;
		resultado = 0;
		do {
			resultado = resultado+n;
			n = n+1;
		} while ((n<10));
		System.out.println("resultado do while: "+resultado);
		resultado = 0;
		for (n=1; n<=9; ++n) {
			resultado = resultado+n;
		}
		System.out.println("resultado for: "+resultado);
	}
}

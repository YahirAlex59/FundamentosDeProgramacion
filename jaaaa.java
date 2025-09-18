public class jaaaa {
public static void duplicar(int numero) {
numero = numero * 2;
System.out.println("Dentro del método: " + numero);
}
public static void main(String[] args) {
int numero = 10;
System.out.println("Antes de llamar al método: " + numero);
duplicar(numero);
System.out.println("Después de llamar al método: " + numero);
}
}
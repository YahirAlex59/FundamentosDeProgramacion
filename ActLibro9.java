import java.util.Scanner;
public class ActLibro9 {
    public static void main(String[] args) { 
    Scanner Sc = new Scanner(System.in);
    int A,B;
    int NumeroElementos;
    int contador;
    int valorgen;
System.out.println("Ingrese la cantidad de numeros a generar");
NumeroElementos = Sc.nextInt();
A=0;
B=1;
System.out.println(A+B);
contador = 1;
while (contador <= NumeroElementos-2) {
    valorgen = A + B;
    System.out.println(valorgen);
    A = B;
    B = valorgen;
    contador = contador + 1;

}

} 
}

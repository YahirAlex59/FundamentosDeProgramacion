import java.util.Scanner;
public class Metodos {
    static Scanner Sc = new Scanner(System.in);
     public static void duplicar(int numero) { 
    numero = numero * 2; 
    System.out.println("Número dentro del método: " + numero); 
} 
 
public static void main(String[] args) { 
    int numero;
    do { numero = Sc.nextInt(); 
    duplicar(numero); 
    System.out.println("Número fuera del método: " + numero); 
    } while (numero != 0);
    System.out.println("EJECUCION TERMINADA");
}
}
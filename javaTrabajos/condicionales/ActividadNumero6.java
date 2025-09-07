package condicionales;
import java.util.Scanner;
public class ActividadNumero6 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        boolean resultado; 
        System.out.println ("escribe a");
        a = Sc.nextInt();
        System.out.println("escribe b");
        b = Sc.nextInt();
        System.out.println("escrinbe c");
        c = Sc.nextInt();
        if (a + b == c || a + c == b || b + c == a) {
            resultado = true;
        }else
            resultado = false;   
        System.out.println ("resultado  =  " + resultado);
        Sc.close();
    }}
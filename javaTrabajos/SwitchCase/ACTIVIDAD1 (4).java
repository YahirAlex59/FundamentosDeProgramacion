import java.util.Scanner;
public class ACTIVIDAD4SwitchCase {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner (System.in);
        System.out.println("dime una hora del dia sin minutos");
        hora = sc.nextInt();
        switch (hora) {
            case 6,7,8,9,10,11,12:
                System.out.println("Buenos dias");   
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Buenas tardes");
                break;
            case 21,22,23,0,1,2,3,4,5:
                System.out.println("Buenas noches");
                break;
            default: if (hora > 24)
                System.out.println("la hora no es valida debe estr entre 0 y 24");

            break;
        }
        
        sc.close();
    }
}
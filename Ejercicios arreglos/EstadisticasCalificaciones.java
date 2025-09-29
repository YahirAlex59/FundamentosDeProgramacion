import java.util.Scanner;
public class EstadisticasCalificaciones {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Cuantas calificaciones deseas ingresar? ");
int n = sc.nextInt();
double [] calificaciones = new double [n] ;
double suma =0;
double max = 0;
double min = 0;

for (int i =0; i<calificaciones.length; i++){
System.out.println("Introduce las calificaciones: ");
calificaciones[i]= sc.nextDouble();
suma = suma + calificaciones[i];
}
System.out.println("CALIFICACIONES: ");
for (int i=0 ; i < calificaciones.length; i++){
System.out.print(calificaciones[i] + " | ");

}
int total= calificaciones.length;
System.out.println("\n"+"Total de calificaciones " + total);
double promedio=suma/total;
System.out.println("El promedio de las calificaciones es " + promedio);

for (int i=0; i<calificaciones.length; i++){
    if (calificaciones[i] > max) {
        max = calificaciones [i];
    }
 }
 System.out.println("la calificacion mas alta es :"+ max);

min = calificaciones[0];
for (int i=1; i<calificaciones.length; i++) {
    if (calificaciones[i] < min) {
        min = calificaciones[i];
    }
}

System.out.println("la calificacion mas baja es :"+ min);
sc.close();
}
}
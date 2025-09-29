import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] estudiantes = new String[5];

    System.out.println("=== REGISTRO DE ESTUDIANTES ===");
    for (int i = 0; i < estudiantes.length; i++) {
        System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
         estudiantes[i] = sc.nextLine();
         }
        System.out.println("\n=== LISTA DE ESTUDIANTES ===");
        for (String nombre : estudiantes) {
            int longitud = nombre.length();
          String convertido;
    if (nombre.equals(nombre.toLowerCase())) {
        convertido = nombre.toUpperCase();
        } else {
            convertido = nombre.toLowerCase();
            }
        System.out.println("Nombre: " + nombre + " | Caracteres: " + longitud +" | Convertido: " + convertido);
        }
        sc.close();
    }
}
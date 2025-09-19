import java.util.Scanner;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class EjercicioReferencia {
    public static void cumplirAnios(Persona p) {
        p.edad += 1;
        System.out.println("Dentro del método -> " + p.nombre + 
                           " tiene ahora " + p.edad + " años");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona;
        do {
            System.out.print("\nIntroduce el nombre de la persona: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce la edad (0 para salir): ");
            int edad = sc.nextInt();
            sc.nextLine(); 
            if (edad == 0) {
                System.out.println("Programa terminado ✅");
                break;
            }
            persona = new Persona(nombre, edad);
            System.out.println("Antes del método -> " +
                               persona.nombre + " tiene " + persona.edad + " años");
            cumplirAnios(persona);
            System.out.println("Después del método -> " +
                               persona.nombre + " tiene " + persona.edad + " años");
        } while (true);

        sc.close();
    }
}


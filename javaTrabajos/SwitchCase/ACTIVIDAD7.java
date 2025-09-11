import java.util.Scanner;
public class ACTIVIDAD7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String con;
                do {
                    String sabor;
                    String tipoChocolate = "";
                    double precio = 0;
        
                    System.out.print("¿Qué sabor quieres? (manzana, fresa, chocolate): ");
                    sabor = sc.nextLine().toLowerCase();
                    switch (sabor) {
                        case "manzana": precio = 200; break;
                        case "fresa": precio = 250; break;
                        case "chocolate":
                            System.out.print("¿Chocolate negro o blanco?: ");
                            tipoChocolate = sc.nextLine().toLowerCase();
                            if (tipoChocolate.equals("negro")) {
                                precio = 280;
                            } else if (tipoChocolate.equals("blanco")) {
                                precio = 300;
                            }
                            break;
                        default:
                            System.out.println("Sabor no válido.");
                            break;
                    }
                    System.out.print("¿Cuántos snacks adicionales deseas? ($25 c/u): ");
                    int snacks = sc.nextInt();
                    precio = precio + snacks * 25;
                    System.out.print("¿Deseas personalizar con nombre? (true/false): ");
                    boolean personaliza = sc.nextBoolean();
                    if (personaliza) {
                        precio = precio + 30;
                    }
                    System.out.println("El precio total de la tarta es: $" + precio);
                    System.out.println("¿Desea continuar? (si/no): ");
                    sc.nextLine(); // consume leftover newline
                    con = sc.nextLine();
                } while (con.equalsIgnoreCase("si"));
                sc.close();
                System.out.println("Gracias por su compra.");
            }
        }
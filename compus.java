import java.util.Scanner;
public class compus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de vendedores: ");
        int Vendedores = scanner.nextInt();
        System.out.print("Ingrese el número de zonas: ");
        int Zonas = scanner.nextInt();
        int[][] ventas = new int[Vendedores][Zonas];
        llenarMatriz(ventas, scanner);

     int zonaMax = zonaConMasVentas(ventas);
        System.out.println("----------- Resultados -------------");
        System.out.println("La zona que más computadoras vendió es la Zona "+ "[" + (zonaMax + 1)+ "]");
        mostrarVendedorExtremo(ventas, true);
        mostrarVendedorExtremo(ventas, false);
        int totalVentas = sumarTotalVentas(ventas);
        System.out.println("La cantidad total de computadoras vendidas es: " + totalVentas);
        
        scanner.close();
    }
    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("\n--- Ingrese las ventas ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("Vendedor " + (i + 1) + ", Zona " + (j + 1) + ": ");
             matriz[i][j] = scanner.nextInt();
            }
    }
    }
    public static int zonaConMasVentas(int[][] ventas) {
        int numZonas = ventas[0].length;
        int maxVentasZona = -1;
        int zonaMaxIndex = -1;

        for (int j = 0; j < numZonas; j++) {
            int ventasZona = 0;
            for (int i = 0; i < ventas.length; i++) {
                ventasZona += ventas[i][j];
            }

            if (ventasZona > maxVentasZona) {
                maxVentasZona = ventasZona;
                zonaMaxIndex = j;
            }
        }
        return zonaMaxIndex;
    }
    public static void mostrarVendedorExtremo(int[][] ventas, boolean isMax) {
        int numVendedores = ventas.length;
        int totalVentasVendedor = -1;
        int vendedorExtremoIndex = -1;
        if (!isMax) {
            totalVentasVendedor = Integer.MAX_VALUE; }

        for (int i = 0; i < numVendedores; i++) {
            int sumaVentas = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                sumaVentas += ventas[i][j]; }

            if (isMax) {
                if (sumaVentas > totalVentasVendedor) {
                totalVentasVendedor = sumaVentas;
                vendedorExtremoIndex = i;
                }
            } else {
                if (sumaVentas < totalVentasVendedor) {
                totalVentasVendedor = sumaVentas;
                vendedorExtremoIndex = i;
                }
            }
        }
        String tipoVenta = isMax ? "más" : "menos";
        System.out.println("|=================================|");
        System.out.println("El vendedor que " + tipoVenta + " computadoras vendió es el Vendedor " + (vendedorExtremoIndex + 1) + ":");
        System.out.println("|=================================|");
        System.out.println("Cantidad de computadoras vendidas: " + totalVentasVendedor);
        System.out.println("|=================================|");
        System.out.println("Valor de su venta (si cada computadora vale 1 unidad): " + totalVentasVendedor); 
    }
    public static int sumarTotalVentas(int[][] ventas) {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                total += ventas[i][j];
            }
        }
        return total;
    }
}

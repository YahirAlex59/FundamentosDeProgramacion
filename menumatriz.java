import java.util.Scanner;
public class menumatriz {
    static int[][] matriz = new int[4][4];
    static boolean rellenada = false;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("|========= MENU MATRIZ 4x4 =======|");
            System.out.println("| 1. Rellenar matriz              |");
            System.out.println("| 2. Suma filas y columnas        |");
            System.out.println("| 3. Suma fila especifica         |");
            System.out.println("| 4. Suma columna especifica      |");
            System.out.println("| 5. Mayor y menor (posicion)     |");
            System.out.println("| 6. Contar pares                 |");
            System.out.println("| 7. Contar impares               |");
            System.out.println("| 8. Generar matriz de cuadrados  |");
            System.out.println("| 9. Sumar diagonal principal     |");
            System.out.println("| 10. Sumar diagonal inversa      |");
            System.out.println("| 11. Media de todos los valores  |");
            System.out.println("| 0. Salir                        |");
            System.out.println("|=================================|");
             System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            if (opcion != 1 && !rellenada && opcion != 0) {
                System.out.println("Primero debes rellenar la matriz.");
                continue;
            }
            switch (opcion) {
                case 1 -> rellenarMatriz();
                case 2 -> sumaFilasColumnas();
                case 3 -> sumaFila();
                case 4 -> sumaColumna();
                case 5 -> mayorMenor();
                case 6 -> contarPares();
                case 7 -> contarImpares();
                case 8 -> matrizCuadrados();
                case 9 -> sumaDiagonalPrincipal();
                case 10 -> sumaDiagonalInversa();
                case 11 -> mediaMatriz();
            }
        } while (opcion != 0);
    }

    static void rellenarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int valor;
                while (true) {
                    System.out.print("Valor [" + i + "][" + j + "]: ");
                    valor = sc.nextInt();
                    if (!existe(valor)) break;
                    System.out.println("Valor repetido. Ingresa otro.");
                }
                matriz[i][j] = valor;
            }
        }
        rellenada = true;
        mostrarMatriz();
    }

    static boolean existe(int valor) {
        for (int[] fila : matriz)
            for (int v : fila)
                if (v == valor) return true;
        return false;
    }

    static void mostrarMatriz() {
        for (int[] fila : matriz) {
            for (int v : fila) System.out.print(v + "\t");
            System.out.println();
        }
    }

    static void sumaFilasColumnas() {
        mostrarMatriz();
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0, sumaColumna = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            System.out.println("Fila " + i + ": " + sumaFila + " | Columna " + i + ": " + sumaColumna);
        }
    }

    static void sumaFila() {
        mostrarMatriz();
        System.out.print("Número de fila (0-3): ");
        int f = sc.nextInt();
        if (f < 0 || f > 3) System.out.println("Fila inválida.");
        else {
            int suma = 0;
            for (int v : matriz[f]) suma += v;
            System.out.println("Suma fila " + f + ": " + suma);
        }
    }

    static void sumaColumna() {
        mostrarMatriz();
        System.out.print("Número de columna (0-3): ");
        int c = sc.nextInt();
        if (c < 0 || c > 3) System.out.println("Columna inválida.");
        else {
            int suma = 0;
            for (int i = 0; i < 4; i++) suma += matriz[i][c];
            System.out.println("Suma columna " + c + ": " + suma);
        }
    }

    static void mayorMenor() {
        mostrarMatriz();
        int mayor = matriz[0][0], menor = matriz[0][0];
        int imay = 0, jmay = 0, imen = 0, jmen = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) { mayor = matriz[i][j]; imay = i; jmay = j; }
                if (matriz[i][j] < menor) { menor = matriz[i][j]; imen = i; jmen = j; }
            }
        System.out.println("Mayor: " + mayor + " en [" + imay + "][" + jmay + "]");
        System.out.println("Menor: " + menor + " en [" + imen + "][" + jmen + "]");
    }

    static void contarPares() {
        mostrarMatriz();
        int c = 0;
        for (int[] fila : matriz)
            for (int v : fila)
                if (v % 2 == 0) c++;
        System.out.println("Cantidad de pares: " + c);
    }

    static void contarImpares() {
        mostrarMatriz();
        int c = 0;
        for (int[] fila : matriz)
            for (int v : fila)
                if (v % 2 != 0) c++;
        System.out.println("Cantidad de impares: " + c);
    }

    static void matrizCuadrados() {
        mostrarMatriz();
        int[][] cuadrado = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                cuadrado[i][j] = matriz[i][j] * matriz[i][j];
        System.out.println("Matriz de cuadrados:");
        for (int[] fila : cuadrado) {
            for (int v : fila) System.out.print(v + "\t");
            System.out.println();
        }
    }

    static void sumaDiagonalPrincipal() {
        mostrarMatriz();
        int suma = 0;
        for (int i = 0; i < 4; i++) suma += matriz[i][i];
        System.out.println("Suma diagonal principal: " + suma);
    }

    static void sumaDiagonalInversa() {
        mostrarMatriz();
        int suma = 0;
        for (int i = 0; i < 4; i++) suma += matriz[i][3 - i];
        System.out.println("Suma diagonal inversa: " + suma);
    }

    static void mediaMatriz() {
        mostrarMatriz();
        int suma = 0;
        for (int[] fila : matriz)
            for (int v : fila)
                suma += v;
        double media = (double) suma / 16;
        System.out.println("Media: " + media);
    }
}
//me falta correguir indices para que inicie en 1
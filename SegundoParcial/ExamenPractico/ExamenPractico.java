package SegundoParcial.ExamenPractico;
import java.util.Scanner;

public class ExamenPractico {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("indica el tamaño de la fila");
        int x = scanner.nextInt();
        int [] lista= new int[x];
    System.out.println("insertar valores de la lista");
       for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingresa el valor [" + (i + 1) + "]: ");
            lista[i] = scanner.nextInt();
        }
        System.out.println("Pila llenada correctamente.");
        
        for (int i = 0; i < lista.length - 1; i++) {
            int min = i;
            int j = i + 1;
            while (j < lista.length) {
             if (lista[j] < lista[min]) {
                    min = j;
                }
                j++;
            }
            int temp = lista[i];
            lista[i] = lista[min];
            lista[min] = temp;
        }
        for (int valor : lista) {
            System.out.print("[" + valor + "]");
        }
        System.out.println();
        System.out.println("Arreglo ordenado ascendente:");
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int izquierda = 0;
        int derecha = lista.length - 1;
        int posicion = -1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (lista[medio] == numero) {
                posicion = medio;
                break;
            } else if (lista[medio] < numero) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion + ".");
        } else {
            System.out.println("El número " + numero + " no está en la lista.");
            System.out.println("Se insertará en la posición " + izquierda + ".");

            int[] nuevaLista = new int[lista.length + 1];

            for (int i = 0; i < izquierda; i++) {
                nuevaLista[i] = lista[i];
            }
            nuevaLista[izquierda] = numero;

            for (int i = izquierda; i < lista.length; i++) {
                nuevaLista[i + 1] = lista[i];
            }

            System.out.print("Lista actualizada: ");
            for (int i = 0; i < nuevaLista.length; i++) {
                System.out.print(nuevaLista[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
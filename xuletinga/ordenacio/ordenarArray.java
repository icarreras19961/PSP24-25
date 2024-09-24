package Ex7_5;

import java.util.Arrays;

public class ordenarArray {
    /* Metodos */

    /* Insercion directa */
    public static void iDirecta(int[] lista) {
        for (int i = 1; i < lista.length; i++) {

            int nNuevo = lista[i];
            int posicio = 0;
            for (int j = i - 1; j >= 0; j--) {
                if ((nNuevo > lista[j])) {
                    posicio = j + 1;
                    break;
                } else {
                    lista[j + 1] = lista[j];
                }
            }
            lista[posicio] = nNuevo;
        }
        System.out.println(Arrays.toString(lista));
    }

    /* Seleccion directa */
    public static void sDirecta(int[] lista) {
        int posicio = 0, salvado = 1000000000;

        for (int i = 0; i < lista.length; i++) {
            salvado = 1000000000;
            for (int j = i; j < lista.length; j++) {
                if (lista[j] < salvado) {
                    posicio = j;
                    salvado = lista[j];
                }

            }
            lista[posicio] = lista[i];
            lista[i] = salvado;

        }

        System.out.println(Arrays.toString(lista));
    }

    /* Burbuja */
    public static void burbuja(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int anterior = lista[j];
                    int siguiente = lista[j + 1];
                    lista[j] = siguiente;
                    lista[j + 1] = anterior;
                }
            }
        }

        System.out.println(Arrays.toString(lista));
    }
}

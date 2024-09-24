package Ex7_5;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    static Scanner lect = new Scanner(System.in);
    static int[] lista;

    public static void main(String[] args) {

        int menu = 0;
        do {

            // Pregunta si crear una señal o no
            System.out.println("Quieres crear un array? si/no");
            String sino = lect.nextLine();
            lect.nextLine();
            // Esto es para escribir si y que se cree
            if (sino.equalsIgnoreCase("si")) {
                creararray();
            }

            // Pregunta que hace
            System.out.println(
                    "Que metodo de ordenacion quieres usar:\n1.Insercion directa\n2.Seleccion directa\n3.burbuja\n4.Exit");
            menu = lect.nextInt();
            lect.nextLine();

            switch (menu) {
                case 1:
                    ordenarArray.iDirecta(lista);
                    break;
                case 2:
                    ordenarArray.sDirecta(lista);
                    break;
                case 3:
                    ordenarArray.burbuja(lista);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (menu != 4);
    }

    public static void creararray() {
        System.out.println("Como de largo tienes el array?");
        int largo = lect.nextInt();
        lect.nextLine();
        lista = new int[largo];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escribe el valor " + i + ": ");
            lista[i] = lect.nextInt();
            lect.nextLine();
        }
        System.out.println(Arrays.toString(lista));
    }
}
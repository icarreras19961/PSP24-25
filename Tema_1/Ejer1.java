
import java.util.Scanner;
import java.util.ArrayList;

public class Ejer1 {

    static ArrayList<Integer> lista = new ArrayList<Integer>();

    public static void main(String[] args) {
        // primero mas pronto en acabar
        System.out.println("===============Primero mas pronto en acabar=================");

        String decision = null;
        do {

            Scanner lect = new Scanner(System.in);
            System.out.println("Introduce la duracion: ");
            int numUser = lect.nextInt();

            lista.add(numUser);

            lista.sort((n1, n2) -> {
                return 1 * n1.compareTo(n2);
            });

            System.out.println(lista);
            System.out.println("Quieres anadir otro proceso? S/N");
            Scanner lect2 = new Scanner(System.in);
            decision = lect2.nextLine();

        } while (decision.equals("s"));

        // Primero se ejecuta el mas pequeño
        System.out.println("===============Peque prime=================");
        int[] peque = { 25, 10, 15, 5, 30 };
        int npeque = 100;
        for (int j = 0; j < peque.length; j++) {
            for (int j2 = 0; j2 < peque.length; j2++) {
                if (peque[j] > peque[j2]) {
                    npeque = peque[j2];
                    peque[j2] = peque[j];
                    peque[j] = npeque;
                }
            }
        }

        for (int j = peque.length - 1; j >= 0; j--) {
            System.out.println(peque[j]);
        }

        // El FIFO
        System.out.println("===============FIFO=================");
        int[] array = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println("poscicion " + array[i] + " acabada");
        }

        // Round Robin
        System.out.println("===============Round Robin=================");

        int[] robin = { 25, 10, 15, 5, 25 };
        boolean acabado = true;
        int i = 0;
        do {
            if (i == robin.length) {
                i = 0;
            }
            if (robin[i] != 0) {
                robin[i] = robin[i] - 5;
                if (robin[i] == 0) {
                    System.out.println("posicion " + (i + 1) + " acabada");
                }
            }
            if (robin[0] == 0 && robin[1] == 0 && robin[2] == 0 && robin[3] == 0 &&
                    robin[4] == 0) {
                acabado = false;
            }
            i++;

        } while (acabado);

    }
}


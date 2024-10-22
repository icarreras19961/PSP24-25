package Tema_2.mooore;

import java.util.Scanner;

public class ejer3 {

    public static class corredor extends Thread {
        public void run() {
            Scanner lect = new Scanner(System.in);
            System.out.println("Ingresa el nombre del corredor:");
            String nombre = lect.nextLine();

            for (int i = 0; i <= 30; i++) {
                System.out.println(i + " km");
            }
            System.out.println(nombre + " llego a la meta");
        }
    }

    public static void main(String[] args) {
        corredor h1 = new corredor();
        h1.start();
    }
}

package Tema_2.mooore;

import java.util.Scanner;

public class ejer4 {
    public static class corredor extends Thread {
        public corredor(String nombre) {
            super(nombre);
        }

        public void run() {

            for (int i = 0; i <= 30; i++) {
                System.out.print(i + " m ");
            }
            System.out.println(getName() + " llego a la meta");
        }
    }

    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        System.out.println("Ingresa el nombre del corredor:");
        String nombre = lect.nextLine();

        System.out.println("Ingresa el nombre del corredor:");
        String nombre2 = lect.nextLine();

        System.out.println("Ingresa el nombre del corredor:");
        String nombre3 = lect.nextLine();
        lect.close();


        corredor h1 = new corredor(nombre);
        corredor h2 = new corredor(nombre2);
        corredor h3 = new corredor(nombre3);

        h1.start();
        h2.start();
        h3.start();

    }
}

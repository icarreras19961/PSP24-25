package Tema_2.mooore;

import java.util.Scanner;

public class ejer1 {

    public static class creador extends Thread {
        public void run() {
            Scanner lect = new Scanner(System.in);

            // Nombre
            System.out.println("Ingrese el nombre del empleado");
            String nombre = lect.nextLine();

            // Dia
            System.out.println("Ingrese el dia");
            String dia = lect.nextLine();

            // Hora
            System.out.println("Ingrese la hora");
            int hora = lect.nextInt();
            if (hora > 8) {
                System.out.println(nombre + " ha llegado tarde el " + dia);
            } else {
                System.out.println(nombre + " ha llegado pronto el " + dia);

            }
            lect.close();
        }

    }

    public static void main(String[] args) {
        creador h1 = new creador();
        creador h2 = new creador();

        h1.start();
        h2.start();

    }

}
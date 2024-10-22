package Tema_2.mooore;

import java.util.Scanner;

public class ejer6 {
    public static class adoptador extends Thread {
        public void run() {
            String animal = "";
            do {
                Scanner lect = new Scanner(System.in);
                System.out.println("Ingresa un animal");
                animal = lect.nextLine();
                
                System.out.println("Ingresan " + animal);
                System.out.println(animal == "salir");
            } while (1 == 1);
        }
    }

    public static void main(String[] args) {
        adoptador h1 = new adoptador();
        h1.start();
    }
}

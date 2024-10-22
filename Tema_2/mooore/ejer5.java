package Tema_2.mooore;

public class ejer5 {
    public static class par extends Thread {
        public void run() {
            int sumacion = 0;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    sumacion = sumacion + i;
                }
            }
            System.out.println("La suma de los pares es: " + sumacion + "\n********************************");
        }

    }
    public static class impar extends Thread {
        public void run() {
            int sumacion = 0;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    sumacion = sumacion + i;
                }
            }
            System.out.println("La suma de los impares es: " + sumacion + "\n********************************");
        }

    }


    public static void main(String[] args) {
        par h1 = new par();
        par h2 = new par();
        impar h3 = new impar();
        impar h4 = new impar();
        h1.start();
        h2.start();
        h3.start();
        h4.start();


    }
}

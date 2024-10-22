package Tema_2.mooore;

public class ejer2 {

    public static class contator extends Thread {
        public void run() {
            try {
                for (int i = 1; i <= 20; i++) {
                    System.out.println(i);
                    sleep(1500);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        contator h1 = new contator();

        h1.start();

    }
}

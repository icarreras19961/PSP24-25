public class ejer2_1 {

    public static class hilo_tic extends Thread {
        public void run() {
            try {
                do {
                    System.out.println("TIC");
                    sleep(2000);
                } while (1 == 1);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static class hilo_tac extends Thread {
        public void run() {
            try {
                do {
                    System.out.println("TAC");
                    sleep(2000);
                } while (1 == 1);
            } catch (Exception e) {
                System.out.println(e);

            }

        }
    }

    public static void main(String[] args) {
        hilo_tic h_tic = new hilo_tic();
        hilo_tac h_tac = new hilo_tac();

        h_tic.start();
        h_tac.start();
    }
}

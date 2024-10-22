public class ejer2_4 {

    class Myhilo extends Thread {
        private SolicitaSuspender suspender = new SolicitaSuspender();

        public void Suspender() {
            suspender.set(true);
        }

        public void Reanudar() {
            suspender.set(false);
        }

        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    sleep(1000);
                }
    
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public class SolicitaSuspender {
        private boolean suspender;

        public synchronized void set(boolean b) {
            suspender = b;
            notifyAll();
        }

        public synchronized void esperandoParaReanudar() throws InterruptedException {
            while (suspender) {
                wait();
            }
        }
    }

    public static void main(String[] args) {

    }
}

public class ejer2_2 {
    public class ejer2_1 {

        public static class hilo_tic implements Runnable  {
            public void run() {
                try {
                    do {
                        System.out.println("TIC");
                        
                    } while (1 == 1);
                } catch (Exception e) {
                    System.out.println(e);
                }
    
            }
    
        }
    
        public static class hilo_tac implements Runnable {
            public void run() {
                try {
                    do {
                        System.out.println("TAC");
                        
                    } while (1 == 1);
                } catch (Exception e) {
                    System.out.println(e);
    
                }
    
            }
        }
    
        public static void main(String[] args) {
            hilo_tic h_tic = new hilo_tic();
            hilo_tac h_tac = new hilo_tac();
    
            new Thread(h_tic).start();
            new Thread(h_tac).start();
           
        }
    }
    
}

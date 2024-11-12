public class Main {

    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        for (int i = 1; i < 12; i++) {
            Player jugador = new Player();
            jugador.setNumUser(i);
            jugador.start();
        }

        while (Banca.dinero > 50000) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            ruleta.giraRuleta();
            
        }
    }
   
}
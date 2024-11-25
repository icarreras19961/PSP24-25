package v1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Banca casino = new Banca();
        ArrayList<Player> jugadores = new ArrayList<Player>();
        for (int i = 1; i <= 12; i++) {
            Player jugador = new Player();
            jugadores.add(jugador);
            jugador.setNumUser(i);
            jugador.start();

        }
        while (casino.getDinero() >= 0) {
            int resultado = 0;
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Algo a salido mal en el contador: " + e);
            }
            // aqui pasarle el reultado al usuario
            resultado = casino.giraRuleta();
            for (Player player : jugadores) {
                player.setResRuleta(resultado);
            }

        }

    }

}
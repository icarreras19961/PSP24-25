package v2;

import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    // Creacion de los objertos pertinentes para hacer el ejercicio
    Banca casino = new Banca();
    ArrayList<Player> jugadores = new ArrayList<Player>();
    for (int i = 1; i <= 12; i++) {
      Player jugador = new Player();
      jugadores.add(jugador);
      jugador.setNumUser(i);
      jugador.start();

    }

    // Esto lanzara el resultado de la ruleta, les dira a los hilos el resultado y les dira que ya esta
    while (casino.getDinero() >= 0) {
      int resultado = 0;
      try {
        Thread.sleep(3000);
      } catch (Exception e) {
        System.out.println("Algo a salido mal en el contador: " + e);
      }

      // aqui pasarle el reultado al usuario
      resultado = casino.giraRuleta();
      System.out.println(resultado);

      for (Player player : jugadores) {
        player.setResRuleta(resultado);
        player.setEsParRuleta(casino.esPar());
        player.liberador();
      }
      
    }
    System.out.println("Banca sin dinero");
  }
}

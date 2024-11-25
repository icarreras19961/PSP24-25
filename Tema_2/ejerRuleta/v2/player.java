package v2;

public class Player extends Thread {
  int dinero = 1000;
  int numUser = 0;
  int resRuleta = 0;
  boolean esParRuleta;
  int apostado = 0;

  public int getDinero() {
    return dinero;
  }

  public void setDinero(int dinero) {
    this.dinero = dinero;
  }

  public int getNumUser() {
    return numUser;
  }

  public void setNumUser(int numUser) {
    this.numUser = numUser;
  }

  public int getResRuleta() {
    return resRuleta;
  }

  public void setResRuleta(int resRuleta) {
    this.resRuleta = resRuleta;
  }

  public boolean isEsParRuleta() {
    return esParRuleta;
  }

  public void setEsParRuleta(boolean esParRuleta) {
    this.esParRuleta = esParRuleta;
  }

  public void run() {
    do {
      // los calculos que haran los hilos para saber si han ganado o no
      if (numUser <= 4) {
        int apuesta = apuesta1_36();
        if (apuesta == this.getResRuleta()) {
          this.dinero = this.dinero += Banca.pagar();
        } else {
          this.dinero = this.dinero - 10;
          Banca.cobrar(10);
        }
      } else if (numUser <= 8 && numUser > 4) {
        boolean apuesta = apuestaPar();
        if (esParRuleta == apuesta) {
          this.dinero = this.dinero += Banca.pagar();
        } else {
          this.dinero = this.dinero - 10;
          Banca.cobrar(10);
        }
      } else {
        int apuesta = apuestaDobleONada();
        if (apuesta == this.getResRuleta()) {
          this.dinero = this.dinero += Banca.pagar();
        } else {
          this.dinero = this.dinero - 10;
          apostado = apuesta * 2;
        }
      }
      System.out.println(this.getNumUser() + " con un dinero " + this.getDinero());
    } while (dinero >= 0);
    System.out.println("Me he quedado sin dinero" + this.getNumUser());
  }

  // Resulta que contra todo pronostico el wait lo tenia que poner aqui ya que asi
  // hacen su apuesta pero se esperan y al poner el espera entra el siguiente
  public synchronized int apuesta1_36() {
    int apuesta = (int) (Math.random() * 36);
    if (apuesta == 0) {
      apuesta1_36();
    }
    try {
      this.wait();
    } catch (Exception e) {
    }
    return apuesta;
  }

  // Es necesario que el notify y el wait esten en la misma clase por tanto me he
  // inventado
  // este metodo para poder liverar a los hilos, (todos los hilos ejecutaran el
  // notify que es un poco ñe pero funciona)
  public synchronized void liberador() {
    notifyAll();
  }

  // El resto funciona esencialmente igual
  public synchronized boolean apuestaPar() {
    int apuesta = (int) (Math.random() * 36);
    try {
      this.wait();
    } catch (Exception e) {
    }
    if (apuesta % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public synchronized int apuestaDobleONada() {
    int apuesta = (int) (Math.random() * 36);
    try {
      this.wait();
    } catch (Exception e) {
    }
    return apuesta;
  }

}

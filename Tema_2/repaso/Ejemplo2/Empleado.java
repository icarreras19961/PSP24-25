package Ejemplo2;

import java.util.Random;

public class Empleado extends Thread {
  public int nEmpleado;
  public int piso;
  public Ascensor ascensor;
  public boolean enSuPiso = false;
  public int paciencia = 0;

  public Ascensor getAscensor() {
    return ascensor;
  }

  public void setAscensor(Ascensor ascensor) {
    this.ascensor = ascensor;
  }

  public int getnEmpleado() {
    return nEmpleado;
  }

  public void setnEmpleado(int nEmpleado) {
    this.nEmpleado = nEmpleado;
  }

  public int getPiso() {
    return piso;
  }

  public void setPiso(int piso) {
    this.piso = piso;
  }

  public void run() {
    while (!enSuPiso ) {
      llamarAscensor();
      if (paciencia >= 10) {
        System.out.println("No he podido subir: " + nEmpleado);
        break;
      }
    }
  }

  public synchronized void llamarAscensor() {

    if (!this.ascensor.isOcupado()) {
      // He tenido que poner el sleep para que vaya mas lento y asi se ejecute mejor
      this.ascensor.setOcupado(true);
      subir();
    } else {
      try {
        this.paciencia++;
        Thread.sleep(100);
      } catch (Exception e) {
      }
    }
  }

  public synchronized void subir() {
    int piso = (int) (Math.random() * 11);
    System.out.println(
        "He subido al piso: " + piso + " siendo el empleado: " + nEmpleado + " con una paciencia de: " + paciencia);
    this.ascensor.setOcupado(false);
    enSuPiso = true;
  }

}

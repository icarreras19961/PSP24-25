package Ejemplo3;

import java.util.ArrayList;

class EspeNoti {
  public synchronized void Esperar() throws InterruptedException {
    System.out.println("Esperando");
    wait();
    System.out.println("liberado");
  }

  public synchronized void Liberar() throws InterruptedException {
    System.out.println("Llegando a liberar");
    Thread.sleep(2000);
    notify();
    System.out.println("El hilo ha sido superado");
  }
}

public class Main {
  public static void main(String[] args) {
    EspeNoti en = new EspeNoti();

    Thread espera = new Thread(() -> {
      try {
        en.Esperar();
      } catch (Exception e) {
      }
    });
    Thread liberar = new Thread(()->{
      try {
        en.Liberar();
      } catch (Exception e) {
      }
    });

    espera.start();
    liberar.start();
  }
}

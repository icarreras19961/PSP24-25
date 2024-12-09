package Ejemplo1;

public class Main {
  public static void main(String[] args) {
    Tarro tarro = new Tarro();

    for (int i = 0; i <= 15; i++) {
      Nino nene = new Nino();

      nene.setnNene(i);
      nene.setTarro(tarro);
      nene.start();
    }

  }
}

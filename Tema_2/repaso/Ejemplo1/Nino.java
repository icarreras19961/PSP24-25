package Ejemplo1;

public class Nino extends Thread{
  public int nNene;
  public Tarro tarro = new Tarro();


  public Tarro getTarro() {
    return tarro;
  }

  public void setTarro(Tarro tarro) {
    this.tarro = tarro;
  }

  public int getnNene() {
    return nNene;
  }

  public void setnNene(int nNene) {
    this.nNene = nNene;
  }

  //El hilo principal
  public void run(){
    cogerGalleta();

  }

  public synchronized void cogerGalleta(){
    if (tarro.restarGalleta()) {
      System.out.println("Me he llevado 1 galleta: "+this.getnNene());
    }else{
      System.out.println("Guaaa Guuaaa no galleta: "+this.getnNene());
    }
  }
}

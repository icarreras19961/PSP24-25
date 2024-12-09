package Ejemplo1;

public class Tarro {
  public int galletas = 10;

  public int getGalletas() {
    return galletas;
  }

  public void setGalletas(int galletas) {
    this.galletas = galletas;
  }

  public synchronized boolean restarGalleta() {
    if (this.galletas >= 0) {
      this.galletas -= 1;
      return true;
    }
    return false;
  }

}

public class Palillos {
    boolean usado = false;

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public synchronized boolean estado() {
        return this.usado;
    }

    public synchronized void coger() {
        this.usado = true;
        
    }

    public synchronized void soltar() {
        this.usado = false;
        
    }

}
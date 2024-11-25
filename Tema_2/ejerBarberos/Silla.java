public class Silla extends Thread{
    boolean ocupada = false;
    int nsilla;

    public int getNsilla() {
        return nsilla;
    }

    public void setNsilla(int nsilla) {
        this.nsilla = nsilla;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    

}

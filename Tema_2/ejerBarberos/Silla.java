public class Silla extends Thread{
    boolean ocupada = false;
    int nsilla;
    Cliente clienteSentado;
    
    public Cliente getClienteSentado() {
        return clienteSentado;
    }

    public void setClienteSentado(Cliente clienteSentado) {
        this.clienteSentado = clienteSentado;
    }

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

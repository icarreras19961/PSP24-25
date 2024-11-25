import java.util.ArrayList;

public class Cliente extends Thread {
    Boolean afeitado = false;
    int nCliente;
    ArrayList<Silla> sillas = new ArrayList<>();
    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    public Boolean getAfeitado() {
        return afeitado;
    }
    
    public void setAfeitado(Boolean afeitado) {
        this.afeitado = afeitado;
    }
    public int getnCliente() {
        return nCliente;
    }
    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public void run(){
        for (Silla silla : sillas) {
            if (silla.isOcupada()) {
                silla.setOcupada(true);
                
            }
        }
    }

    public synchronized void sentarse(){
     try {
        System.out.println("esperando"+ this.nCliente);
        wait();
     } catch (Exception e) {}   
    }

    public synchronized void listo(){
        notify();
    }

}

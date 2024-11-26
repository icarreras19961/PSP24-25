import java.util.ArrayList;

public class Cliente extends Thread {
    Boolean afeitado = false;
    int nCliente;
    ArrayList<Silla> sillas = new ArrayList<>();
    int nsilla;
    int paciencia = 0;



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

    public void run() {
        buscarSilla();

        if (!afeitado) {
            System.out.println("No me ha afeitado nadie: " + this.nCliente);
        } else {
            System.out.println("Me ha afeitado: " + this.nCliente);
        }
    }

    public synchronized void buscarSilla() {
        // Busca una silla y se sienta en ella guardadome el n de la silla
        for (Silla silla : sillas) {
            if (!silla.isOcupada()) {
                silla.setOcupada(true);
                nsilla = silla.getNsilla();
                sentarse();
                silla.setClienteSentado(this);
                break;// deja de buscar
            }
        }

    }

    public synchronized void sentarse() {
        // Paciencia
        do {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            this.paciencia++;
        } while (paciencia < 10 || afeitado);

    }

}

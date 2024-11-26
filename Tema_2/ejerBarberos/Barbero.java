import java.util.ArrayList;

public class Barbero extends Thread {
    Cliente clienteSatisfecho;
    int nbarber;
    ArrayList<Silla> sillas = new ArrayList<>();

    public int getNbarber() {
        return nbarber;
    }

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    public void setNbarber(int nbarber) {
        this.nbarber = nbarber;
    }

    public void run() {

        dormir();

    }

    public synchronized void dormir() {
        while (true) {
            try {
                Thread.sleep(5000);
                revisarSillas();

            } catch (Exception e) {
                System.err.println("Barbero a muerto entre terrible sufrimiento");
            }
        }

    }

    public synchronized void revisarSillas() {

        for (Silla silla : sillas) {
            // System.out.println(silla.getNsilla() + " " +
            // clienteSatisfecho.getnCliente());
            if (silla.isOcupada()) {
                try {
                    clienteSatisfecho = silla.getClienteSentado();
                    clienteSatisfecho.setAfeitado(true);
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }

    }

}

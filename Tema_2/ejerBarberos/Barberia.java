import java.util.ArrayList;

public class Barberia {

    public static void main(String[] args) {
        ArrayList<Silla> sillas = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            Barbero barbero = new Barbero();
            barbero.setSillas(sillas);
            barbero.setNbarber(i);
            barbero.start();
        }
        for (int i = 0; i <= 10; i++) {
            Silla silla = new Silla();
            silla.setNsilla(i);
            sillas.add(silla);
        }
        int nCliente = 0;
        while (true) {
            nCliente++;
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            Cliente cliente = new Cliente();
            cliente.setnCliente(nCliente);
            cliente.setSillas(sillas);
            cliente.start();
        }
    }
}
@Deprecated
public class Main {

    static int productos = 100;

    public static class Almacen extends Thread {
        Puerta puerta = new Puerta();
        int nuser;

        public void setNuser(int nuser) {
            this.nuser = nuser;
        }

        // Esto es lo que se ejecuta 300 veces
        public void run() {
            int intento = 0;

            while (intento < 10) {
                puerta.acceder(nuser, intento);
            }
        }

    }

    public static class Puerta {
        boolean acceso = true;

        public synchronized void acceder(int nuser, int intento) {
            if (acceso) {
                acceso = false;
                if (productos > 0) {
                    try {
                        wait(500);
                    } catch (Exception e) {

                    }
                    productos--;
                    acceso = true;
                    System.out.println("Productos" + productos);
                    System.out.println("Cliente: " + nuser + "\n En el intento: " + intento);
                    notifyAll();
                }

            } else {
                try {
                    intento++;
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
        // hacer otro metodo sincronized que sea acceso bloqueado que haga el wait y los
        // intentos y con esto se vaya intercalando como en el ejemplo
    }

    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            // Creacion de los clientes
            Almacen cliente = new Almacen();
            cliente.setNuser(i);

            cliente.start();

        }
        System.out.println("Ya esta");
    }

}
public class nuevo {

    static int productos = 100;
    //para que los hilos puedan acceder a esta variable 
    static int intentos = 0;

    public static class Almacen extends Thread {
        Puerta puerta = new Puerta();
        int nuser;
        boolean tiene = false;

        public void setNuser(int nuser) {
            this.nuser = nuser;
        }

        public void run() {
            boolean abierto = true;

            while (intentos <= 10) {
                
                if (abierto) {
                    abierto = false;
                    tiene = puerta.entrar(nuser);
                    abierto = true;
                }
                
                intentos++;
                try {
                    wait();
                } catch (Exception e) {
                }

                if (tiene) {
                    System.out.println("El cliente " + nuser + " lo logro en: " + intentos);
                    break;
                } else {
                    if (intentos >= 10) {
                        System.out.println("El cliente " + nuser + " se ha cansado de intentarlo");
                        break;
                    }
                }
            }
        }

        public static class Puerta {

            public synchronized boolean entrar(int nuser) {
                if (productos > 0) {
                    productos--;
                    notifyAll();
                    return true;
                }
                return false;
            }
        }

        public static void main(String[] args) {
            // Bucle de 300
            for (int i = 0; i < 300; i++) {
                Almacen cliente = new Almacen();
                cliente.setNuser(i);

                cliente.start();
            }
            System.out.println("Ya esta");

        }
    }
}
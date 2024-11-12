
import java.util.ArrayList;
import java.util.Random;

public class Filosofos implements Runnable {
        public static int numUser;
        String miNombre = "Filosofo " + numUser;
        Random generador = new Random();
        int milisegs = 0;

        public static int getNumUser() {
                return numUser;
        }

        public static void setNumUser(int numUser) {
                Filosofos.numUser = numUser;
        }

        public void run() {
                ArrayList<Palillos> grupo = new ArrayList<Palillos>();

                for (int i = 1; i <= 5; i++) {
                        Palillos palillo = new Palillos();
                        grupo.add(palillo);
                }

                while (true) {
                        comprobador(numUser, grupo);
                        pensando(miNombre, milisegs, generador);
                }
        }

        public void comprobador(int numUser, ArrayList<Palillos> grupo) {
                /* Comer */
                /* Intentar coger palillos */
                if (!(numUser == 5)) {
                        if (!grupo.get(numUser).estado() && !grupo.get(numUser + 1).estado()) {
                                grupo.get(numUser).coger();
                                grupo.get(numUser + 1).coger();
                                comiendo(miNombre, numUser, generador);
                                grupo.get(numUser).soltar();
                                grupo.get(numUser + 1).soltar();
                        }
                } else {
                        if (!grupo.get(4).estado() && !grupo.get(1).estado()) {
                                grupo.get(4).coger();
                                grupo.get(1).coger();
                                comiendo(miNombre, numUser, generador);
                                grupo.get(4).soltar();
                                grupo.get( 1).soltar();
                        }

                }
        }

        public void comiendo(String miNombre, int milisegs, Random generador) {
                System.out.println(miNombre + " comiendo...");
                milisegs = (1 + generador.nextInt(5)) * 1000;
                esperarTiempoAzar(miNombre, milisegs);
        }

        public void pensando(String miNombre, int milisegs, Random generador) {
                /* Pensando... */
                System.out.println(miNombre + " pensando...");
                milisegs = (1 + generador.nextInt(5)) * 1000;
                esperarTiempoAzar(miNombre, milisegs);
        }

        private void esperarTiempoAzar(String miNombre, int milisegs) {
                try {
                        Thread.sleep(milisegs);
                } catch (InterruptedException e) {
                        System.out.println(miNombre + " interrumpido!!. Saliendo...");
                        return;
                }
        }
}

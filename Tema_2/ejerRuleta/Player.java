public class Player extends Thread {
    int dinero = 1000;
    static int numUser = 0;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getNumUser() {
        return numUser;
    }

    public static void setNumUser(int numUser) {
        Player.numUser = numUser;
    }

    public void run() {
        // Tipo de apuesta
        if (numUser >= 4) {
            // genera un numero aleatorio
            int apuesta = apuesta1_36();
            try {
                wait();
            } catch (Exception e) {
                System.err.println("Algo a salido mal en 1 - 36" + e);
            }
            if (apuesta == Ruleta.resultado) {
                // Se llama a la banca para cobrar el premio
                this.dinero = this.dinero + Banca.pagar();
                System.out.println("jugador: " + numUser + " dinero: " + dinero);
            } else {
                if (this.dinero > 0) {
                    this.dinero = this.dinero - 10;
                    Banca.cobrar(10);
                    System.out.println("jugador: " + numUser + " dinero: " + dinero);
                } else {
                    System.out.println("me he quedado sin euros :C (1 - 36)");
                }
            }
        } else if (numUser >= 8 && numUser < 4) {
            // Entre par o impar
            boolean espar = apuestaPar();

            try {
                wait();
            } catch (Exception e) {
                System.err.println("Algo a salido mal en Par - impar");
            }
            if (espar == Ruleta.esPar()) {
                // Se llama a la banca para cobrar
                this.dinero = this.dinero + Banca.pagar();
                System.out.println("jugador: " + numUser + " dinero: " + dinero);

            } else {
                if (this.dinero > 0) {
                    this.dinero = this.dinero - 10;
                    Banca.cobrar(10);
                    System.out.println("jugador: " + numUser + " dinero: " + dinero);

                } else {
                    System.out.println("me he quedado sin euros :C (Par - impar)");
                }
            }
        } else {
            // Doble o nada
            // int apostado = 10;
            // int apuesta;
            // // do {
            // apuesta = apuestaDobleONada();
            // try {
            // wait();
            // } catch (Exception e) {
            // System.err.println("Algo a salido mal en doble o nada" + e);
            // }
            // if (apuesta == Ruleta.resultado) {
            // // Se llama a la banca para cobrar el premio
            // this.dinero = this.dinero + Banca.pagar();

            // } else {
            // apostado = apostado * 2;
            // }
            // // } while (this.dinero > 0);

            // Banca.cobrar(this.dinero);
            // System.out.println("me he quedado sin euros :C (doble o nada)");

        }
    }

    public int apuesta1_36() {
        int apuesta = (int) (Math.random() * 36);
        if (apuesta == 0) {
            apuesta1_36();
        }
        return apuesta;
    }

    public boolean apuestaPar() {
        int apuesta = (int) (Math.random() * 36);
        if (apuesta % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int apuestaDobleONada() {
        int apuesta = (int) (Math.random() * 36);
        return apuesta;
    }
}

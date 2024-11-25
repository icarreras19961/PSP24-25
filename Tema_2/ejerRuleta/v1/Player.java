package v1;
public class Player extends Thread {
    int dinero = 1000;
    int numUser = 0;
    int resRuleta = 0;
    boolean esParRuleta;

    public boolean isEsParRuleta() {
        return esParRuleta;
    }

    public void setEsParRuleta(boolean esParRuleta) {
        this.esParRuleta = esParRuleta;
    }

    public int getResRuleta() {
        return resRuleta;
    }

    public void setResRuleta(int resRuleta) {
        this.resRuleta = resRuleta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getNumUser() {
        return numUser;
    }

    public void setNumUser(int numUser) {
        this.numUser = numUser;
    }

    public void run() {
//TODO tengo que hacer el banco estatico aki para poder comprobar ademas de  eso los mismos players tienen que el wait tienen que tener en notify sino no va bien por lo que hare que solo puedna apostar de 1 en 1 y arreglao

        // do {

        // Tipo de apuesta
        if (numUser <= 4) {
            // genera un numero aleatorio
            int apuesta = apuesta1_36();
            try {
                this.wait();
            } catch (Exception e) {
                System.err.println("Algo a salido mal en 1 - 36: " + numUser + " " + e);
            }

            // TODO esto es necesario
            // System.out.println("Apuesta:" + apuesta + " ResRuleta: " + resRuleta);
            // if (apuesta == resRuleta) {
            // // Se llama a la banca para cobrar el premio
            // this.dinero = this.dinero + Banca.pagar();
            // System.out.println("jugador: " + numUser + " dinero: " + dinero);
            // } else {
            // if (this.dinero > 0) {
            // this.dinero = this.dinero - 10;
            // Banca.cobrar(10);
            // System.out.println("jugador: " + numUser + " dinero: " + dinero);
            // } else {
            // System.out.println("me he quedado sin euros :C (1 - 36)");
            // }
            // }
        } else if (numUser <= 8 && numUser > 4) {
            // Entre par o impar
            boolean espar = apuestaPar();

            try {
                this.wait();
            } catch (Exception e) {
                System.err.println("Algo a salido mal en Par - impar : " + numUser + " " + e);
            }
            // TODO esto es necesario
            // if (espar == esParRuleta) {
            // // Se llama a la banca para cobrar
            // this.dinero = this.dinero + Banca.pagar();
            // System.out.println("jugador: " + numUser + " dinero: " + dinero);

            // } else {
            // if (this.dinero > 0) {
            // this.dinero = this.dinero - 10;
            // Banca.cobrar(10);
            // System.out.println("jugador: " + numUser + " dinero: " + dinero);

            // } else {
            // System.out.println("me he quedado sin euros :C (Par - impar)");
            // }
            // }
        } else {
            // Doble o nada
            // int apostado = 10;
            // int apuesta;
            // // do {
            // apuesta = apuestaDobleONada();
            try {
                this.wait();
            } catch (Exception e) {
                System.err.println("Algo a salido mal en doble o nada " + numUser + " " + e);
            }
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
        // } while (dinero >= 0);
    }

    public synchronized int apuesta1_36() {
        int apuesta = (int) (Math.random() * 36);
        if (apuesta == 0) {
            apuesta1_36();
        }
        return apuesta;
    }

    public synchronized boolean apuestaPar() {
        int apuesta = (int) (Math.random() * 36);
        if (apuesta % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public synchronized int apuestaDobleONada() {
        int apuesta = (int) (Math.random() * 36);
        return apuesta;
    }
}

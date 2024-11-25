package v1;
public class Banca {
    static int dinero = 50000;
    int resultado = 0;

    public static int getDinero() {
        return dinero;
    }
    public static void setDinero(int dinero) {
        Banca.dinero = dinero;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


    public static synchronized int pagar() {
        dinero = dinero - 360;
        return 360;
    }
    public static synchronized void cobrar(int dineroApuesta) {
        dinero = dinero + dineroApuesta;
    }

    public synchronized int giraRuleta() {
        notifyAll();
        return (int) (Math.random() * 36);
    }

    public boolean esPar() {
        if (resultado % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

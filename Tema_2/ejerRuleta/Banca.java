public class Banca {
    static int dinero = 50000;

    public static synchronized int pagar() {
        dinero = dinero - 360;
        return 360;
    }

    public static synchronized void cobrar(int dineroApuesta) {
        dinero = dinero + dineroApuesta;
    }
}

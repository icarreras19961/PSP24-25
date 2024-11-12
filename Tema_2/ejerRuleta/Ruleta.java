public class Ruleta {
    public static int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void giraRuleta() {
        this.resultado = (int) (Math.random() * 36);
        notifyAll();
    }

    public static boolean esPar() {
        if (resultado % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

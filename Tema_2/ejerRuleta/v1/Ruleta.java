package v1;
public class Ruleta {
    public int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int giraRuleta() {
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

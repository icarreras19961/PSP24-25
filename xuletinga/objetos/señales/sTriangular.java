package señales;

public class sTriangular extends señal implements esquinas {
    // Hereda de señal(extends) y yo elijo con el implements añadirle la funcion
    // esquinas

    /* Constructores */
    public sTriangular() {
    }

    public sTriangular(String name) {
        super(name);
    }

    /* Metodos */
    public void name() {

    }

    public String toString() {// Aqui llamaremos a la funcion toString() de la clase padre ademas de tambien a
                              // la interface declarada mas abajo
        return super.toString() + "\nEs Triangular" + nEsquinas();
    }

    // La interface importante tenerla delcarada igual que el su clase
    public String nEsquinas() {
        return "\nTiene 3 esquinas";
    };
}

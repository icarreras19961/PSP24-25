package señales;

public class sCuadradas extends señal implements esquinas {
//Me da perezilla volver a explicarlo todo si lo quereis mas detallado miraros el striangulo 
    /* Constructores */
    public sCuadradas() {
    }

    public sCuadradas(String name) {
        super(name);
    }

    /* metodos */
    public String toString() {
        return super.toString() + "\nEs Cuadrada" + nEsquinas();
    }

    public String nEsquinas() {
        return "\nTiene 4 esquinas";
    };
}

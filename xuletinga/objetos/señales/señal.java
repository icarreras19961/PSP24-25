package señales;

public class señal {
    private String name;

    /* Setters getters */
    // Los setters y getters nos permitiran modificar la variable (setter) y
    // mostrarlo(getters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* constructors */
    public señal() {
    }

    public señal(String name) {
        this.name = name;
    }

    /* metodos */
    // Devolvera un string (este metodo al ponerlo dentro de un system.out.println
    // no hara falta escribirlo es decir (señal)=(señal.toString))
    public String toString() {
        return "\nNombre: " + this.name;// el this.name hace referencia al name del objeto es decir si yo dentro del
                                        // metodo tubiera una variable llamada name con el this seria ingorada y
                                        // utilizaria la de arriba
    }
}

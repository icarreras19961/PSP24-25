package señales;

public class sRedondas extends señal {
    // Aqui tenemos la clase sRedonda que como ya sabemos gracias al extends el
    // programa sabe que hereda TODOS los metodos de señal

    /* Constructor */
    public sRedondas() {
        // siempre que tengamos un constructor con algo dentro sera OBLIGATORIO poner un
        // constructor vacio
    }

    public sRedondas(String name) {
        // Tenemos el constructor que llama al constructor del padre
        super(name);
    }

    /* Metodos */
    // Aqui tenemos el metodo toString que llama con el super al metodo toString de
    // la clase señal y se lo envia a este otro para añadir el resto del contenido
    public String toString() {
        return super.toString() + "\nEs redonda";
    }
}

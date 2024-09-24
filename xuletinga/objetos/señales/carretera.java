package señales;

public class carretera {
    static señal[] arraySeñals = new señal[100];// Una carretera puede tener tantas señales como quieras por tanto en
                                                // este caso una carretera sera una array de señales tal y como esta
                                                // definido
    static int numSen;

    /* Getter */
    public int getNumSen() {
        // solo hay geter porque no queremos modificar numSen sin querer asi que solo
        // podremos mostrarlo por pantalla
        return numSen;
    }
    /* Metodos */

    public static void insertar(señal señal) {
        // Para insertar una señar cojeremos la posicion numSen y introduciremos el
        // objeto señal de entrada
        arraySeñals[numSen] = señal;
        numSen++;
    }

    public static void Muestra() {// bucle que recorre el array y muestra su contenido
        for (int i = 0; i < numSen; i++) {
            System.out.println(arraySeñals[i]);// Aqui vemos el ejemplo del metodo toString que no hace falta mostrarlo
        }
    }

    public static void borrar(String name) {
        // Para borrar necesitaremos el nombre que le pasamos nosotros y lo compararemos
        // con el del objeto en la posicion i la cual guardaremos en numElegido
        int numElegido = 0;
        for (int i = 0; i < numSen; i++) {
            if (arraySeñals[i].getName().equals(name)) {
                numElegido = i;
            }
        }
        // borraremos el objeto de la posicion que haya salido
        arraySeñals[numElegido] = null;

        // para acabar empezaremos el bucle desde el numElegido para no modificar las
        // señales previas(en caso de que haya) y moveremos la señal de la posicion i+1
        // para que sea solo 1 es decir moveremos las señales 1 posicion atras
        for (int i = numElegido; i < numSen; i++) {
            arraySeñals[i] = arraySeñals[i + 1];
        }
        numSen--; // Para acabar reduciremos la lista en 1 que es la cantidad de señales que hemos
                  // eliminado
    }
}

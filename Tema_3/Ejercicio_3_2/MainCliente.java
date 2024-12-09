package Ejercicio_3_2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainCliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // Con el servidor lanzado intentamos conectarnos con el cliente
        String Host = "localhost";
        int puerto = 6000;
        Socket cliente = new Socket(Host,puerto);
        cliente.close();
    }
}

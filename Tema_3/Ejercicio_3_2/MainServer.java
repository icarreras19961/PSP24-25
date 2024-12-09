package Ejercicio_3_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException {
        // Hay que encender primero el servidor para poder despues conectar el cliente
        int puerto = 6000;
        ServerSocket Servidor = new ServerSocket(puerto);
        System.out.println("Escuchando en " + Servidor.getLocalPort());

        Socket cliente1 = Servidor.accept();
        System.out.println("/*Cliente 1*/");
        System.out.println(cliente1.getInetAddress());
        System.out.println("Puerto local: " + cliente1.getLocalPort());
        System.out.println("Puerto remoto: " + cliente1.getPort());

        Socket cliente2 = Servidor.accept();
        System.out.println("/*Cliente 2*/");
        System.out.println(cliente2.getInetAddress());
        System.out.println("Puerto local: " + cliente2.getLocalPort());
        System.out.println("Puerto remoto: " + cliente2.getPort());

        System.out.println("Cerrar");
        Servidor.close();

    }
}

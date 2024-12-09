package Ejercicio_3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException {
        // Hay que encender primero el servidor para poder despues conectar el cliente
        int puerto = 6000;
        ServerSocket Servidor = new ServerSocket(puerto);
        System.out.println("Escuchando en " + Servidor.getLocalPort());

        Socket cliente1 = Servidor.accept();

        // Flojo de Salida del servidor (Le envia algo al cliente)
        OutputStream salida = null;
        salida = cliente1.getOutputStream();
        DataOutputStream flujosalida = new DataOutputStream(salida);
        flujosalida.writeUTF("HOLA CARA DE COLA");

        // Flujo de salida del servidor (Lee lo que envia el cliente)
        InputStream entrada = null;
        entrada = cliente1.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);
        System.out.println(flujoEntrada.readUTF());

        System.out.println("Cerrar");
        Servidor.close();

    }
}
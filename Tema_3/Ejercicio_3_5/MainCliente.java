package Ejercicio_3_5;

import java.io.DataInputStream;
import java.net.Socket;

public class MainCliente {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("localhost", 6000);

            // (Lo que llega del servidor)
            DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());
            int resultado = flujoEntrada.readInt();
            System.out.println("Cliente n: " + resultado);
            System.out.println(cliente.getInetAddress());
            System.out.println("Puerto local: " + cliente.getLocalPort());
            System.out.println("Puerto remoto: " + cliente.getPort());
             

            flujoEntrada.close();
            cliente.close();

        } catch (Exception e) {
        }
    }
}

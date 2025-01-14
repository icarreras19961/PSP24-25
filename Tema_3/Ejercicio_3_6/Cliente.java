package Ejercicio_3_6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
    public static void main(String[] args) {

        try {
            DatagramSocket cliente = new DatagramSocket();
            InetAddress IPServidor = InetAddress.getLocalHost();
            int puerto = 12345;

            String cadena = "hola cara de cola";
            byte[] enviados = new byte[1024];
            enviados = cadena.getBytes();

            DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);
            cliente.send(envio);

            System.out.println("Esperando Respuesta......");
            byte[] bufer = new byte[1024];
            DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
            cliente.receive(recibo);
            String resultado = new String(recibo.getData());
            System.out.println(resultado);

            cliente.close();
        } catch (Exception e) {
        }
    }
}

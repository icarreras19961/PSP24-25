package Ejercicio_3_6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Servidor {
    public static void main(String[] args) {
        byte[] bufer = new byte[1024];
        String res = "";
        do {
            try {
                // Recibir el mensaje
                DatagramSocket socket = new DatagramSocket(12345);

                // Esperando datagrama
                System.out.println("Esperando Datagrama......");
                bufer = new byte[1024];
                DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
                socket.receive(recibo);

                // Al recibir el mensaje esperara 5 seg y si nadie le responde otra vez se apaga
                // solito
                socket.setSoTimeout(5000);

                String paquete = new String(recibo.getData());
                res = paquete;
                String solucion = paquete.toUpperCase();
                
                System.out.println(solucion);

                // Para devolver el mensaje
                InetAddress IPOrigen = recibo.getAddress();
                int puerto = recibo.getPort();

                String cadena = solucion;
                byte[] enviados = new byte[1024];
                enviados = cadena.getBytes();

                DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
                socket.send(envio);

                socket.close();
                
            } catch (Exception e) {
            }
        } while (!res.equals("*"));
        System.out.println("Adios");
    }
}

package Ejercicio_3_8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) {

        Numeros num;
        do {
            try {
                // Para recibir el mensaje
                DatagramSocket socket = new DatagramSocket(54321);

                // Esperando el objeto
                System.out.println("Esperando cliente...");
                byte[] buferNumber = new byte[1024];
                DatagramPacket numRecibe = new DatagramPacket(buferNumber, buferNumber.length);
                socket.receive(numRecibe);

                // Convierte los bytes a objetos
                ByteArrayInputStream bais = new ByteArrayInputStream(buferNumber);
                ObjectInputStream in = new ObjectInputStream(bais);
                num = (Numeros) in.readObject();
                in.close();

                // Los calculos que pide el ejercicio
                num.setCuadrado(num.getNumero() * num.getNumero());
                num.setCubo(num.getNumero() * num.getNumero() * num.getNumero());
                System.out.println(
                        "Numero: " + num.getNumero() + "\nCubo: " + num.getCubo() + "\nCuadrado: "
                                + num.getCuadrado());

                // De objeto a bytes
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(bs);
                out.writeObject(num);
                out.close();

                // Preparar el enviador
                byte[] bytes = bs.toByteArray();
                DatagramPacket envio = new DatagramPacket(bytes, bytes.length, numRecibe.getAddress(),
                        numRecibe.getPort());
                socket.send(envio);

                socket.close();
                if (num.getNumero() == 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (true);
        System.out.println("Adios");
    }
}

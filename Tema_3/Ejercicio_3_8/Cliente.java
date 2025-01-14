package Ejercicio_3_8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Cliente {
    static Numeros numero = new Numeros();

    public static void main(String[] args) {
        do {

            numero.setNumero(leedor());

            try {
                DatagramSocket clienteSocket = new DatagramSocket();

                // De objeto a bytes
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(bs);
                out.writeObject(numero);
                out.close();
                byte[] bytes = bs.toByteArray();

                // Preparar el enviador
                DatagramPacket envio = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 54321);
                clienteSocket.send(envio);

                // Perparar para recibir
                byte[] buferNumber = new byte[1024];
                DatagramPacket numRecibe = new DatagramPacket(buferNumber, buferNumber.length);
                System.out.println("Esperando");
                clienteSocket.receive(numRecibe);
                System.out.println("Recibido");

                // Convierte los bytes a objetos
                System.out.println("Convirtiendo...");
                ByteArrayInputStream bais = new ByteArrayInputStream(buferNumber);
                ObjectInputStream in = new ObjectInputStream(bais);
                Numeros num2 = (Numeros) in.readObject();
                in.close();

                System.out.println(
                        "Numero: " + num2.getNumero() + "\nCubo: " + num2.getCubo() + "\nCuadrado: "
                                + num2.getCuadrado());
                clienteSocket.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (numero.getNumero() != 0);
    }

    public static int leedor() {
        Scanner lect = new Scanner(System.in);
        System.out.println("Introduce un Numero: ");
        int nUser = lect.nextInt();
        return nUser;
    }
}

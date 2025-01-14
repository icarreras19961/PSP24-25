package Ejercicio_3_7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket servidor = new ServerSocket(12345);
        do {

            System.out.println("Esperando a un cliente...");
            Socket cliente = servidor.accept();

            // El objeto que me envia el usuario
            ObjectInputStream inNumero = new ObjectInputStream(cliente.getInputStream());
            Numeros num = (Numeros) inNumero.readObject();

            // Los calculos que devemos hacer con el numero
            num.setCuadrado(num.getNumero() * num.getNumero());
            num.setCubo(num.getNumero() * num.getNumero() * num.getNumero());
            System.out.println(num.getNumero());
            // Lo que le enviaremos al cliente
            ObjectOutputStream outNumber = new ObjectOutputStream(cliente.getOutputStream());
            outNumber.writeObject(num);

            // Para parar 
            if (num.getNumero() == 0) {
                break;
            }

            cliente.close();
        } while (true);
        servidor.close();
        System.out.println("Adios");
    }
}

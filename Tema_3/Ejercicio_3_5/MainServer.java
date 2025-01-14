package Ejercicio_3_5;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MainServer {
    public static void main(String[] args) {
        try {
            int puerto = 6000;
            ServerSocket Servidor = new ServerSocket(puerto);
            System.out.println("Escuchando en " + Servidor.getLocalPort());
            int nUser = 1; 
            int nMax = Integer.parseInt(args[0]);

            do {

                Socket cliente = Servidor.accept();
                // (Lo que envia el servidor)
                OutputStream salida = null;
                salida = cliente.getOutputStream();
                DataOutputStream flujoSalida = new DataOutputStream(salida);
                flujoSalida.writeInt(nUser);

                nUser++;
                salida.close();
                flujoSalida.close();
            } while (nUser <= nMax);

            Servidor.close();
        } catch (Exception e) {
        }

    }
}

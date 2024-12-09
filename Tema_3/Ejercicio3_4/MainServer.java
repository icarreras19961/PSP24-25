package Ejercicio3_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
        try {
            int puerto = 6000;
            ServerSocket Servidor = new ServerSocket(puerto);
            System.out.println("Escuchando en " + Servidor.getLocalPort());
    
            Socket clienteConect = Servidor.accept();
            InputStream entrada = null;
            entrada = clienteConect.getInputStream();
            DataInputStream flujoEntrada = new DataInputStream(entrada);
            int nUser = flujoEntrada.readInt();

            nUser = nUser * nUser;

            OutputStream salida = null;
            salida = clienteConect.getOutputStream();
            DataOutputStream flujosalida = new DataOutputStream(salida);
            flujosalida.writeInt(nUser);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

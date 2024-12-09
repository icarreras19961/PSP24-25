package Ejercicio_3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MainCliente {
    public static void main(String[] args) {

        try {
            Socket Cliente = new Socket("localhost", 6000);
            
            // (Lee lo que le envia el servidor)
            DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
            String entrada = flujoEntrada.readUTF();
            String res = entrada.toString().toLowerCase();

            // (Le envia algo al servidor)
            DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
            flujoSalida.writeUTF(res);

            Cliente.close();
            flujoSalida.close();
            flujoEntrada.close();
        } catch (Exception e) {
        }

    }
}

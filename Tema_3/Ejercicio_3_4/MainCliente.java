package Ejercicio_3_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        try {
            Socket Cliente = new Socket("localhost", 6000);

            System.out.println("Escribe un numero");
            Scanner lect = new Scanner(System.in);
            int nUser = lect.nextInt();

            //(Lo que le envia al server)
            DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
            flujoSalida.writeInt(nUser);
            
            // (Lo que recibe del server)
            DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
            int resultado = flujoEntrada.readInt();
            System.out.println(resultado);
        } catch (Exception e) {}

    }
}

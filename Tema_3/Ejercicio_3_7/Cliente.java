package Ejercicio_3_7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    static Numeros numero = new Numeros();

    public static void main(String[] args) {
        do {

            numero.setNumero(leedor());
            try {

                // Enviar el objeto
                Socket cliente = new Socket("localhost", 12345);

                // Objeto enviado
                ObjectOutputStream outNum = new ObjectOutputStream(cliente.getOutputStream());
                outNum.writeObject(numero);

                // objeto Recibido
                ObjectInputStream inNum = new ObjectInputStream(cliente.getInputStream());
                Numeros numeroModificado = (Numeros) inNum.readObject();
                System.out.println("Numero: " + numeroModificado.getNumero() + "\nCuadrado: "
                        + numeroModificado.getCuadrado() + "\nCubo: " + numeroModificado.getCubo());

                outNum.close();
                inNum.close();
                cliente.close();
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

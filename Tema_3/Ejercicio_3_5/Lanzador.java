package Ejercicio_3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lanzador {
    public static void main(String[] args) throws IOException {
        Scanner lect = new Scanner(System.in);
        System.out.println("Cuantos usuarios quieres: ");
        String nUsers = lect.nextLine();
        lect.close();
        try {
            ProcessBuilder pbServer = new ProcessBuilder("java", "Tema_3\\Ejercicio_3_5\\MainServer.java", nUsers);
            Process pServer = pbServer.start();

            ProcessBuilder pbCliente = new ProcessBuilder("java", "Tema_3\\Ejercicio_3_5\\MainCliente.java");
            Process pCliente = null;
            for (int i = 0; i < Integer.parseInt(nUsers); i++) {
                int exitVal;
                pCliente = pbCliente.start();
                exitVal = pCliente.waitFor();
                try {

                    InputStream is = pCliente.getInputStream();
                    int c;
                    while ((c = is.read()) != -1) {
                        System.out.println((char) c);
                    }
                    is.close();
                } catch (Exception e) {
                }
            }

        } catch (Exception e) {
        }

    }

}

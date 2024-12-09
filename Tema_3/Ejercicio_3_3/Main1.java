package Ejercicio_3_3;

import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;

public class Main1 {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlCon = null;

        try {
            url = new URL("http://localhost/psp/verNombre.php");
            urlCon = url.openConnection();

            String cadena = "nombre=Ivan&apellido=Carreras";
            PrintWriter output = new PrintWriter(urlCon.getOutputStream());
            output.write(cadena);
            output.close();


            BufferedReader reader = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
            
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (Exception e) {
        }
    }
}

package Ejemplos;
import java.io.*;
import java.net.*;

public class Ejemplo2urlCon {
  public static void main(String[] args) {
    try { 
      URL url = new URL("http://localhost/2018/vernombre.php");
      URLConnection conexion = url.openConnection();
      conexion.setDoOutput(true);           
        
      String cadena ="nombre=María Jesús&apellidos=Ramos Martín";
           
      //ESCRIBIR EN LA URL – stream de salida
      PrintWriter output = new PrintWriter 
                        (conexion.getOutputStream());
      output.write(cadena);	
	output.close(); //cerrar flujo
	
      //LEER DE LA URL – stream de entrada
	BufferedReader reader = new BufferedReader
              (new InputStreamReader(conexion.getInputStream()));
	String linea;
	while ((linea = reader.readLine()) != null) {
			  System.out.println(linea);
	}			
	reader.close();//cerrar flujo

			
    } catch (MalformedURLException me) {
            System.err.println("MalformedURLException: " + me);
    } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
    }
  }//main
}//Ejemplo2urlCon 

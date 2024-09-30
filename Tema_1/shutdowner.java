import java.io.*;
import java.util.Scanner;

public class shutdowner {
    public static void main(String[] args) throws IOException {
        // Lector
        Scanner lect = new Scanner(System.in);
        System.out.println("1. Apagar\n2. Reiniciar\n3. Suspender");
        int numUser = 0;
        try {
            numUser = lect.nextInt();

        } catch (Exception e) {
            System.out.println("Valor Incorrecot");
            e.printStackTrace();
        }
        lect.close();
        // Donde el usuario puede elegir que proceso quiere utiliar
        String command = "";
        switch (numUser) {
            case 1:
                command = "shutdown /s";
                System.out.println("Apagando...");
                break;
            case 2:
                command = "shutdown /r";
                System.out.println("Reiniciando...");

                break;
            case 3:
                command = "shutdown /h";
                System.out.println("Suspendiendo...");
                break;

            default:
                System.out.println("Valor Incorrecto");
                break;
        }
        // El proceso que se crea con el "comando" "la ruta" y "el comando que se
        // ejecutar"
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", command);
        Process p = pb.start();

        // Esto es para probar que funciona el proceso para mostrar el arbol
        // try {
        // InputStream is = p.getInputStream();
        // int c;
        // while ((c = is.read()) != -1) {
        // System.out.print((char) c);
        // }
        // is.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}

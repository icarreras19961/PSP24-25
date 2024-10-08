import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ejer1_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("1. Fichero\n2. Terminal");
        Scanner lect = new Scanner(System.in);

        int decision = lect.nextInt();
        lect.close();
        
        if (decision == 1) {
            fichers();
        } else if (decision == 2) {
            terminalis();
        }

    }

    public static void terminalis() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
        Process p = pb.start();
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fichers() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

        File fOut = new File("./ejer1-5/Salida.txt");
        File fErr = new File("./ejer1-5/Error.txt");

        pb.redirectOutput(fOut);
        pb.redirectError(fErr);

        pb.start();
    }

}

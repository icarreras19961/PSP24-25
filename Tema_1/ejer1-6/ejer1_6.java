import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer1_6 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("1. Sumar\n2. Leer\n");
        Scanner lect = new Scanner(System.in);

        int decision = 0;
        Integer resultado = 0;
        decision = Integer.parseInt(lect.nextLine());

        if (decision == 1) {
            System.out.println("Primer numero de la suma: ");
            String n1 = lect.nextLine();

            System.out.println("Segundo numero de la suma: ");

            String n2 = lect.nextLine();

            lect.close();

            ProcessBuilder pb = new ProcessBuilder("java", ".\\sumator.java", n1, n2);
            File fl = new File("./resultado.txt");
            File fErr = new File("./resultadoErr.txt");

            pb.redirectOutput(fl);
            pb.redirectError(fErr);

            Process p = pb.start();
            resultado = p.waitFor();
            System.out.println(n1 + " + " + n2 + " = " + resultado);

            // escribidor(resultado);

        } else if (decision == 2) {
            leedor();
        }

    }

    // Como no me funcionaba el redirect he echo esto pero he logrado arreglar el
    // redirect añadiendo un syso en el hilo
    public static void escribidor(Integer resultado) throws IOException {
        File fl = new File("./resultado.txt");
        FileWriter fw = new FileWriter(fl);
        String resString = resultado.toString();
        fw.write(resString);
        fw.close();
    }

    public static void leedor() throws IOException, FileNotFoundException {
        FileReader fl = new FileReader("./resultado.txt");
        String cadena;
        BufferedReader b = new BufferedReader(fl);
        while ((cadena = b.readLine()) != null) {
            System.out.println(Integer.parseInt(cadena));
        }
        b.close();
    }
}
import java.io.IOException;
import java.util.Scanner;

public class lanzador {
    public static void main(String[] args) throws IOException {

        Scanner lect = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = lect.nextLine();
        lect.close();

        ProcessBuilder pb = new ProcessBuilder("java", "Tema_1\\leerNombre.java", nombre);
        Process p = pb.start();
        int success = 0;
        try {
            // p.getOutputStream();
            p.getInputStream();
            success = p.waitFor();

            if (success == 1) {
                System.out.println("Correcto");
            } else if (success == -1) {
                System.out.println("Incorrecto");
            } else {
                System.out.println("Algo a salido mal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

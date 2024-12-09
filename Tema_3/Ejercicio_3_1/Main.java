package Ejercicio_3_1;

import java.util.Scanner;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String ipUser = lect.nextLine();

        InetAddress dir = null;

        try {

            dir = InetAddress.getByName(ipUser);
            VerInfo(dir);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static void VerInfo(InetAddress dir) {
        System.out.println("\tMetodo getByName(): " + dir);
        try {
            InetAddress dir2;
            dir2 = InetAddress.getLocalHost();
            System.out.println("\tMetodo getLocalHost(): " + dir2);
        } catch (Exception e) {
        }
        System.out.println("\tMetodo getHostName(): " + dir.getHostName());
        System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());

    }
}

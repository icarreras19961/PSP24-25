package Ejercicio_3_2;

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escribe una url: ");
        Scanner lect = new Scanner(System.in);
        String urlUser = lect.nextLine();

        lect.close();
        URL url = null;

        try {
            url = new URL(urlUser);
            VerInfo(url);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void VerInfo(URL url) {
        System.out.println("\tURL completa: " + url.toString());
        System.out.println("\tgetProtocol(): " + url.getProtocol());
        System.out.println("\tgetHost(): " + url.getHost());
        System.out.println("\tgetPort(): " + url.getPort());
        System.out.println("\tgetFile(): " + url.getFile());
        System.out.println("\tgetUserInfo(): " + url.getUserInfo());
        System.out.println("\tgetPath(): " + url.getPath());
        System.out.println("\tgetAuthority(): " + url.getAuthority());
        System.out.println("\tgetQuery(): " + url.getQuery());
        System.out.println("\tgetDefaultPort(): " + url.getDefaultPort());
        System.out.println("==================================================");
    }
}

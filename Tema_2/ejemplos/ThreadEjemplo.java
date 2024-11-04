package Tema_2.ejemplos;

public class ThreadEjemplo implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(i + " " +
                    Thread.currentThread().getName());
        System.out.println("Termina thread " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ThreadEjemplo(), "Pepe").start();
        new Thread(new ThreadEjemplo(), "Juan").start();
        System.out.println("Termina thread main");
    }
}

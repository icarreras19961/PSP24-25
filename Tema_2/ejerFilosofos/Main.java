import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            Filosofos filosofo = new Filosofos();
            filosofo.setNumUser(i);
            new Thread(filosofo).start();
        }

    }
}
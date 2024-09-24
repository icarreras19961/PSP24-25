package Ejer9_4;

import java.util.*;

public class main {
    /*
     * Un linkedlist lo usaremos en el caso en el que queramos introducir valores en
     * posiciones intermedias ya que este lo hace por defecto y no queremos hacer un
     * for con un if dentro si esto lo hace por nosotros, verdad?
     */

    static LinkedList listaColores = new LinkedList<String>();// no hace falta declarar la mida

    public static void main(String[] args) {
        listaColores.add("Rojo");
        listaColores.add("Amarillo");
        listaColores.add("Verde");
        listaColores.add("Azul");

        e24();
    }

    public static void e1() {
        listaColores.add("morado");
        System.out.println(listaColores);
    }

    public static void e2() {
        for (int i = 0; i < listaColores.size(); i++) {
            System.out.println(listaColores.get(i));
        }
    }

    public static void e3() {
        for (int i = 2; i < listaColores.size(); i++) {
            System.out.println(listaColores.get(i));
        }
    }

    public static void e4() {
        Iterator it = listaColores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterator it2 = listaColores.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }

    public static void e5() {
        listaColores.add(1, "morado");// si añades la posicion en la que quieres ponerlo se colocara hay
        System.out.println(listaColores);
    }

    public static void e6() {
        listaColores.addFirst("morado");// para añadir un objeto al principio de la lista
        listaColores.addLast("ocre");// para añadir un objeto al final de la lista
        System.out.println(listaColores);
    }

    public static void e7() {
        System.out.println(listaColores.offer("morado"));// me mostrara por pantalla si se a podido añadir o no
    }

    public static void e8() {
        System.out.println(listaColores.offerLast("morado"));// lo mismo k el anterior TODO no entiendo la diferencia
    }

    public static void e9() {
        listaColores.add(1, "morado");// si añades uno en la posicion 1 y seguido hace los mismo el anterio se movera
        listaColores.add(1, "ocre");
        System.out.println(listaColores);
    }

    public static void e10() {
        System.out.println(listaColores.peekFirst());// mustra el primero de la lista
        System.out.println(listaColores.peekLast());// muestra el ultimo TODO no veo diferencia con el .get()
    }

    public static void e11() {
        for (int i = 0; i < listaColores.size(); i++) {// TODO no e encotrado el metodo para hacerlo facil
            System.out.print(i + " ");
            System.out.print(listaColores.get(i) + "\n");
        }
    }

    public static void e12() {
        listaColores.remove(1);// elimina el objeto que haya dentro de la posicion especificada
        System.out.println(listaColores);
    }

    public static void e13() {
        listaColores.removeFirst();
        listaColores.removeLast();
        System.out.println(listaColores);
    }

    public static void e14() {
        listaColores.removeAll(listaColores);// para borra toda la lista
        System.out.println(listaColores);
    }

    public static void e15() {
        Collections.swap(listaColores, 0, 2);// intercambia los elementos de la lista entre las posiciones especificadas
        System.out.println(listaColores);
    }

    public static void e16() {
        Collections.shuffle(listaColores);// remueve el contenido del array
        System.out.println(listaColores);
    }

    public static void e17() {
        LinkedList lC = (LinkedList) listaColores.clone();// para clonar una lista
        lC.addAll(listaColores);// añade el objeto al final de la lista que llama al metodo
        System.out.println(lC);
    }

    public static void e18() {
        LinkedList lC = (LinkedList) listaColores.clone();
        System.out.println(lC);
    }

    public static void e19() {
        System.out.println(listaColores.poll());// muestra y elimina el elemento de la lista
        System.out.println(listaColores);
    }

    public static void e20() {
        System.out.println(listaColores.peek());// muestra pero no elimina el primero elemento de la lista
    }

    public static void e21() {
        System.out.println(listaColores.peekLast());// li mismo que el anterior pero con el ultimo
    }

    public static void e22() {
        System.out.println(listaColores.containsAll(listaColores));// comparara la lista que llama al metodo con la k le
                                                                   // pasas como parametro
    }

    public static void e23() {
        listaColores.toArray();// la combierte en un arrayList
        System.out.println(listaColores);
    }

    public static void e24() {
        System.out.println(listaColores.containsAll(listaColores));// devuelve verdadero si los valores del array que lo
                                                                   // llama son iguales al que esta entre ()
    }

    public static void e25() {
        System.out.println(listaColores.isEmpty());// comprueba si la lista esta vacia
    }

    public static void e26() {
        listaColores.set(0, "rosa");// substituye el elemento especificado
        System.out.println(listaColores);
    }
}

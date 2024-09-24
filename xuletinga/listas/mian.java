package Ejer9_3;

import java.util.*;

public class mian {
    /*
     * El arrayList es como un array normal pero con sus respectivos metodos osea
     * que en el caso en que tengamos que elejir un algoritmo de ordenacion si lo
     * que queremos hacer se puede hacer con un array normal ahora usaremos el
     * arrayList y pareceremos buenos programadores y todo
     * Api de java(https://docs.oracle.com/javase/8/docs/api/index.html) luego
     * buscar con ctrl + f
     */
    static ArrayList listaColores = new ArrayList<String>(5);

    public static void main(String[] args) {
        listaColores.add("Rojo");
        listaColores.add("Amarillo");
        listaColores.add("Verde");
        listaColores.add("Azul");

        ejer21();
    }

    public static void ejer2() {
        Iterator<String> it = listaColores.iterator(); // como hacer un for
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void ejer3() {
        listaColores.add(0, "Morado"); // sirve para añadir cosas
        Iterator<String> it = listaColores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void ejer4() {
        System.out.println(listaColores.get(2));
    }

    public static void ejer5() {
        listaColores.set(1, "morado"); // sirve para reemplazar las cosas
        Iterator<String> it = listaColores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void ejer6() {
        listaColores.remove(2); // para eliminar el elemento
        Iterator<String> it = listaColores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void ejer7() {
        System.out.println(listaColores.contains("Rojo"));// para saber si lo que le pasas esta en la lista
    }

    public static void ejer8() {
        listaColores.sort(null); // por defecto ordena por orden alfabetico
        System.out.println(listaColores);
    }

    public static void ejer9() {
        ArrayList coloresLista = (ArrayList) listaColores.clone(); // esto clona la lista anterior en la nueva
        System.out.println(coloresLista);
    }

    public static void ejer10() {
        Collections.reverse(listaColores); // Para invertir el orden de la lista
        System.out.println(listaColores);
    }

    public static void ejer11() {
        System.out.println(listaColores.subList(1, 3));// coje el rango k le diga
    }

    public static void ejer12() {
        ArrayList coloresLista = (ArrayList) listaColores.clone();
        System.out.println(coloresLista.containsAll(listaColores));// Para comprara las 2 arrays y saber si son iguales
    }

    public static void ejer13() {
        Collections.swap(listaColores, 0, 2); // Cambia la posicion del elemento que le diga
        System.out.println(listaColores);
    }

    public static void ejer14() {
        ArrayList coloresLista = (ArrayList) listaColores.clone();
        coloresLista.addAll(listaColores); // Añade la lista de dentro del parentesis a la de fuera
        System.out.println(coloresLista);
    }

    public static void ejer15() {
        ArrayList coloresLista = (ArrayList) listaColores.clone();
        System.out.println(coloresLista);
    }

    public static void ejer16() {
        System.out.println(listaColores.removeAll(listaColores));// elimina el contenido de la lista y devolvera true si
                                                                 // a funcionado o false si no
    }

    public static void ejer17() {
        System.out.println(listaColores.isEmpty()); // me dice si esta vacia o no
    }

    public static void ejer18() {
        listaColores.trimToSize();// Ajusta la lista al tamaño que tiene de contenido
        System.out.println(listaColores.size());
    }

    public static void ejer19() {
        listaColores.ensureCapacity(100);// me permite ponerle una mida minima al array
        System.out.println(listaColores.size());
    }

    public static void ejer20() {
        listaColores.set(2, "Naranja");// sustituye el elemento que le indique en la posicion que se indica
        System.out.println(listaColores);
    }

    public static void ejer21() {
        for (int i = 0; i < listaColores.size(); i++) {
            System.out.println(listaColores.get(i));
        }
    }
}

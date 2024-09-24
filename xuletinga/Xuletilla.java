package Examen;

import java.util.Scanner;

/*
 * Como usar la xuletilla en caso de extrema necesida en el examen.
 * 
 * Solo tiene que pegar en el main al funcion que quieras comprobar como funciona o que es lo 
 * que hace o tambien puedes abrir la funcion y verlo tu mism@ ya que todas las funciones estan comentadas
 * para que se entienda lo maximo posible
 * 
 * Importante si kieres probarlo cambia el package al que tengais o copiar solo lo que esta por debajo 
 * del "public class Xuletilla".
 */

public class Xuletilla {
    public static void main(String[] args) {
      




        // Ejemplo de funcion con valores sacador del main(Ignorar en caso de no usarlos)

        mostrarMaxim(4, 10);// los valores los podeis introducir vosotros con un scaner y todo ira bien
                            // mientras las varaibles esten bien declaradas
        mostrarMaxim(0, -3);
        mostrarMaxim(5, 5);
        System.out.println(Numero());
        System.out.println(Caracter());
    }

    /*
     * Condicionales
     */

    // il-else
    public static void ifElse() {
        int a = 1, b = 0;
        if (a > b) { // recordar que las condiciones pueden ser '<','>','<='o '>=' y si queremos
                     // añador
                     // mas condiciones debemos añadir un && = and o un || = or
            System.out.println(a + " es mayor");
        } else {
            System.out.println(b + " es mayor");
        }
    }

    // else-if
    public static void ElseIf() {
        // else if
        int c = 1, d = 0, f = 2;
        if (c > d) { // recordar que las condiciones pueden ser '<','>','<='o '>=' y si queremos
                     // añador
                     // mas condiciones debemos añadir un && = and o un || = or
            System.out.println(c + " es mayor");
        } else if (d > f) {
            System.out.println(d + " es mayor");
        } else {// este ultimo es opcional en el else if
            System.out.println(f + " es el mayor");
        }
    }

    /*
     * Switch
     */
    public static void Switch() {
        Scanner lect = new Scanner(System.in);
        int numUser = lect.nextInt();
        switch (numUser) {
            case 1:
                System.out.println("has escrito un 1");
                break;
            case 2:
            case 3:
                System.out.println("has escrito un 2 o un 3");
                break;
            default:
                System.out.println("has escrito algo k no es ni 1 ni 2 ni 3");
        }

    }
    /*
     * bucles
     */

    // while
    public static void While() {
        int i = 0;
        while (i < 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    // do-While
    public static void DoWhile() {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 100);
    }
    /*
     * La principal diferencia entre do-while y while es que en el do siempre lo
     * ejecutara
     * por lo menos 1 vez y luego dependiendo de la condicion seguira haciendo el
     * bucle
     * o no, mientras que en el while si la condicion no se cumple la primera vez
     * no se ejecutara ni siquera 1 vez.
     */

    // for
    public static void For() {
        int i = 10;
        for (int cont = 0; cont < i; cont++) {// cuidado con los condicionales del for que te pueden explotar el
                                              // processardor del pc si pasa clicar la terminal y pulsar ctr+c
            System.out.println(i);
            i--;
        }
    }

    /*
     * Arrays
     */
    // Array y su contenido
    public static void Array() {
        char array[] = { 'h', 'o', 'l', 'a' };
        for (int cont = 0; cont < array.length; cont++) {
            System.out.print(array[cont]);
        }
        System.out.println("\n");
        // con bucle for-each
        for (char i : array) {// se guardara el valor de la array en la i
            System.out.print(i);
        }
    }

    // declarar una string y pasarla a array
    public static void StringToArray() {
        String cadena = "hola";
        char array[] = new char[cadena.length()];// esto es decirle la longitud de la string a la cadena

        // Asigna la string dentro de cada valor de la array
        for (int cont = 0; cont < cadena.length(); cont++) {
            array[cont] = cadena.charAt(cont);
        }
        // muestra nuesta array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Una array en 2 dimensiones
    public static void Array2D() {
        // esto nos creara una tabla 3x3;
        int[][] array = null; // se puede declarar una array en null si no sabemos cuanto va a medir
        array = new int[3][3]; // pero siempre hay que declararle la longitud sino no funciona
        Scanner lect = new Scanner(System.in);

        // aqui escribiremos los valores en nuestra array 3x3

        for (int cont = 0; cont < 3; cont++) {// esto representa el piso de la array 0= al mas alto ...

            for (int i = 0; i < 3; i++) {// este for representa el valor de nuestra array 0= primer caracter...

                System.out.println("Escribe el valor " + i + " " + cont);
                array[i][cont] = lect.nextInt();
                lect.nextLine();
            }
        }
        // aqui lo unico que hago es mostrarlo por pantalla para que kede bonito y se
        // entienda
        for (int cont = 0; cont < 3; cont++) {// esto representa el piso de la array 0= al mas alto ...

            for (int i = 0; i < 3; i++) {// este for representa el valor de nuestra array 0= primer caracter...

                System.out.print(array[i][cont] + "\t");
            }
            System.out.println(" ");
        }
    }

    /*
     * metodos de 1 string
     */
    // Equals
    public static void Equals() {
        String porfi = new String("porfa");
        Scanner lect = new Scanner(System.in);
        System.out.println("Escribe la palabra secreta");
        String palabra = lect.nextLine();
        // Compara el contenido de la string con lo que hay entre parentesis
        if (palabra.equals("secreta")) {// aqui lo uso poniendo una palabra entre los parentesis
            System.out.println("Como se piden las cosas?");
            String como = lect.nextLine();

            if (como.equals(porfi)) {// aqui compare el contenido de las dos string
                System.out.println("Mu bien");
            }
        } else {
            System.out.println("Casi crack");
        }
    }

    // To uper case
    public static void ToUpperCase() {
        String palabra = new String("minúsculas convertidas en mayúsculas");// si ya esta en mayusculas no afectara al
                                                                            // resultado

        // Convertir a mayusculas en contenido de la string
        System.out.println(palabra.toUpperCase());
    }

    // to lower case
    public static void ToLowerCase() {
        String palabra = new String("MAYUSCULAS convertidas EN MINUSCULAS");// si ya esta en minusculas no afectara al
                                                                            // resultado

        // Convertir a minuscular el contenido de la string
        System.out.println(palabra.toLowerCase());
    }

    /*
     * Funciones
     */
    /*
     * Para que una funcion funcione (valga la redundancia) se tiene que llamar
     * desde el main
     * y esta lo que hara es cojer unos valores del main o unos mismos dentro suyo y
     * ejecutar el
     * codigo que tenga dentro.
     */
    public static void mostrarMaxim(int a, int b) {
        System.out.print("El màxim entre " + a + " i " + b + " es... ");
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("son iguales!");
        }
    }

    /*
     * Importante si una funcion tiene un void quiere decir que no devolvera nada
     * sin envargo si no lo tiene es preciso poner un return con un valor y declaral
     * la funcion con el
     * tipo de variable del return, es decir si es return 1 se declarara public ...
     * int Nombre()
     * y si es return 'a' se declarara como char.
     */
    public static int Numero() {
        return 1;
    }

    public static char Caracter() {
        return 'a';
    }
}
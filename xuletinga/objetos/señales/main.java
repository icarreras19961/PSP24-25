package señales;

import java.util.Scanner;

public class main {
    static Scanner lect = new Scanner(System.in);
    static señal señal = new señal(); // tengo que declararlo aqui para poder usar este objeto ademas de que si es
                                      // abstracto no me dejara hacer esto

    public static void main(String[] args) {
        int menu = 0;
        do {
            // Pregunta si crear una señal o no
            System.out.println("Quieres crear una Señal nueva? si/no");
            String sino = lect.nextLine();
            lect.nextLine();

            // Esto es para escribir si y que se cree
            if (sino.equalsIgnoreCase("si")) {
                crearseñal();
            }

            // Pregunta que hace
            System.out.println("Que quieres hacer \n1.Muestra la Carretera\n2.Borrar señal");
            menu = lect.nextInt();
            lect.nextLine();

            switch (menu) {
                case 1:
                    carretera.Muestra();// llama a la clase carreterea metodo muestra
                    break;

                case 2:
                    borrar();// llama a la funcion borrar que hay mas abajo
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (menu != 6);
    }

    public static void crearseñal() {
        /* Pedir nombre */
        System.out.println("Introduce el nombre");
        String name = lect.nextLine();
        lect.nextLine();
        /* Que tipo de señal es? */
        int menu;
        System.out.println("Que quieres hacer \n1.Redonda\n2.Cuadrada\n3.Triangular");
        menu = lect.nextInt();
        lect.nextLine();

        switch (menu) {
            case 1:
                señal = new sRedondas(name);// si nos damos cuenta todos los objetos tienel el mismo nombre sin embargo
                                            // son de diferente tipo por tanto al llamarlos haran cosas distintas (para
                                            // diferenciarlos en una condicion se usa instanceof)
                break;
            case 2:
                señal = new sCuadradas(name);
                break;
            case 3:
                señal = new sTriangular(name);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        System.out.println("Quieres añadir la señal en la esplanada? si/no");
        String sino = lect.nextLine();
        lect.nextLine();

        if (sino.equalsIgnoreCase("si")) {
            carretera.insertar(señal);//Llama al metodo insertar de carretera
        }
    }

    public static void borrar() {
        /* Pedir nombre de la que quiere borrar */
        System.out.println("Introduce el nombre");
        String name = lect.nextLine();
        lect.nextLine();
        carretera.borrar(name);//Llama al metodo borrar de carretera añadiendo el parametro name para saber que señal es
    }
}

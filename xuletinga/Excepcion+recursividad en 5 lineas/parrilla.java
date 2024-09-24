
import java.util.*;

public class parrilla {

    // static ArrayList<String> hola = new ArrayList<String>(5); no uso este porque no he encontrado el metodo para restringir el tamaño lo podeis intentar hacer y me contais
    static int[] hola = new int[5];//declaramos un array de 5 posciciones

    public static void main(String[] args) {
        //lo metemos dentro de un try catch porque lo vamos ha hacer explotar gracias a la magia de la recursividad
        try {
            recursivo(1);//llamamos al metodo
        } catch (Exception e) {//recomiendo usar excepcion para coger excepciones ya que todo deriva de lo mismo por tanto lo cojera si o si pero si te cree mas pro que yo usa excepciones mas concretas que miguel te pondra mejor nota
            System.out.println("te pasaste" + "\n" + e);//mostramos un mensajito mas el  objeto de excepcion
            e.printStackTrace();//mostraremos el error tal cual como si no tubieramos el try_catch
        }
    }

    public static void recursivo(int i) {
        hola[i] = i;//asignamos i a la posicio i
        System.out.println(Arrays.toString(hola));//mostramos lista
        recursivo(i + 1);/*aqui sucede la magia ya que cogemos la i que esta dentro del metodo y le sumamos 1 haciendo asi que este se incremente el valor i del metodo cada vez que lo llamamos como una bola de nieve
    */}
}

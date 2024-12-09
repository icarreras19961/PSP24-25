package Ejemplo2;

public class Main {
  public static void main(String[] args) {
    Ascensor ascensor = new Ascensor();
    for (int i = 0; i <= 20; i++) {
      Empleado empl = new Empleado();
      empl.setnEmpleado(i);
      empl.setAscensor(ascensor);
      empl.start();
    }
  }
}

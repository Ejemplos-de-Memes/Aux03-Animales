package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Mamifero;
import cl.uchile.dcc.animals.interfaces.Acariciable;
import cl.uchile.dcc.animals.interfaces.Mascota;

public class Perro extends Mamifero
    implements Mascota, Acariciable {

  private final String nombre;

  public Perro(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String hablar() {
    return "Woof woof!";
  }

  public void caminar() {
    System.out.println("Toy caminando");
  }

  public void nadar() {
    System.out.println("Toy nadando");
  }

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public boolean tieneDuenno() {
    return false;
  }

  @Override
  public void hacerCarinno() {

  }
}

package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Pez;
import cl.uchile.dcc.animals.interfaces.Mascota;

public class PezDorado extends Pez
    implements Mascota {

  private final String nombre;

  public PezDorado(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String hablar() {
    return "glú glú";
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
}

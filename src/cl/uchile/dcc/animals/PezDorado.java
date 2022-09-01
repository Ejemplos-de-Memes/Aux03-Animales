package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Pez;

public class PezDorado extends Pez {

  @Override
  public String hablar() {
    return "glú glú";
  }

  public void nadar() {
    System.out.println("Toy nadando");
  }
}

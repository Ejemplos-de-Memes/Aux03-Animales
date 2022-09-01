package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Ave;

public class Colibri extends Ave {

  @Override
  public String hablar() {
    return "*Colibrí noises*";
  }

  public void volar() {
    System.out.println("Toy volando");
  }
}

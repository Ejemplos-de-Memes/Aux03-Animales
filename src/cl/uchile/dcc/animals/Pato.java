package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Ave;

public class Pato extends Ave {

  @Override
  public String hablar() {
    return "Cuak Cuak!";
  }

  public void volar() {
    System.out.println("Toy volando");
  }

  public void caminar() {
    System.out.println("Toy caminando");
  }

  public void nadar() {
    System.out.println("Toy nadando");
  }
}

package cl.uchile.dcc.animals;

import cl.uchile.dcc.animals.abstract_classes.Mamifero;

public class Perro extends Mamifero {

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
}

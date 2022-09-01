package cl.uchile.dcc.animals.abstract_classes;

import cl.uchile.dcc.animals.abstract_classes.Animal;

public abstract class Mamifero extends Animal {

  @Override
  public boolean tieneAlas() {
    return false;
  }

  @Override
  public boolean tieneAletas() {
    return false;
  }
}

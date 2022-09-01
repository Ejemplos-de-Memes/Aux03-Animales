package cl.uchile.dcc.animals.abstract_classes;

import cl.uchile.dcc.animals.abstract_classes.Animal;

public abstract class Ave extends Animal {

  @Override
  public boolean tieneAlas() {
    return true;
  }

  @Override
  public boolean tieneAletas() {
    return false;
  }
}

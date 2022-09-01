package cl.uchile.dcc.animals.abstract_classes;

public abstract class Pez extends Animal {

  @Override
  public boolean tieneAlas() {
    return false;
  }

  @Override
  public boolean tieneAletas() {
    return true;
  }
}

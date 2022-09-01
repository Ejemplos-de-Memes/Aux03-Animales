package cl.uchile.dcc.animals;

public class Perro {

  public boolean tieneAlas() {
    return false;
  }

  public boolean tieneAletas() {
    return false;
  }

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

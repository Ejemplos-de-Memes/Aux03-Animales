package cl.uchile.dcc.animals;

public class Pato {
  public boolean tieneAlas() {
    return true;
  }

  public boolean tieneAletas() {
    return false;
  }

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

package greet;

public class Greet {
  private String name = "";
  private String greet = "";

  public Greet(String name, String greet) {
    this.name = name;
    this.greet = greet;
  }

  public void greet() {
    System.out.println(this.greet + ", " + this.name);
  }
}

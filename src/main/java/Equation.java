public class Equation {

  private int a;
  private int b;
  private int c;

  public Equation(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public boolean canBeSolved(int GCD) {
    return c%GCD == 0;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  @Override
  public String toString() {
    return a + "x + " +
        b + "y =" +
        c;
  }
}

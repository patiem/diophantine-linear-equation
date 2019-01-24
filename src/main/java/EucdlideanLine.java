public class EucdlideanLine {
  private int left;
  private int alfa;
  private int right;
  private int rest;

  public EucdlideanLine(int a, int b) {
    left = a;
    right = b;
    alfa = a/b;
    rest = a%b;
  }

  public int getLeft() {
    return left;
  }

  public void setLeft(int left) {
    this.left = left;
  }

  public int getAlfa() {
    return alfa;
  }

  public void setAlfa(int alfa) {
    this.alfa = alfa;
  }

  public int getRight() {
    return right;
  }

  public void setRight(int right) {
    this.right = right;
  }

  public int getRest() {
    return rest;
  }

  public void setRest(int rest) {
    this.rest = rest;
  }

  @Override
  public String toString() {
    return String.format("%d = %d * %d + %d", left, alfa, right, rest);
  }
}

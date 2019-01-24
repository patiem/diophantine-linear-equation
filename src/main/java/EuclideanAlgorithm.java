import java.util.ArrayList;
import java.util.List;

public class EuclideanAlgorithm {

  List<EucdlideanLine> euklides = new ArrayList<>();

  public EuclideanAlgorithm compute(Equation eq) {

    int a = eq.getA();
    int b = eq.getB();

    if(b>a) {
      int temp = a;
      a = b;
      b = temp;
    }

    EucdlideanLine first = new EucdlideanLine(a, b);
    this.addLine(first);
    int rest = first.getRest();

    while(rest > 0) {
      EucdlideanLine nextLine = new EucdlideanLine(this.getLatstRight(), this.getLatstRest());
      this.addLine(nextLine);
      System.out.println(nextLine);
      rest = nextLine.getRest();
    }

    return this;
  }


  public void addLine(EucdlideanLine line) {
    euklides.add(line);
  }

  public int getLatstRight() {
    return euklides.get(euklides.size() -1).getRight();
  }

  public int getLatstRest() {
    return euklides.get(euklides.size() -1).getRest();
  }

  public int getGCD() {
    return euklides.get(euklides.size() -2).getRest();
  }

  public List<EucdlideanLine> getLines() {
    return euklides;
  }
}

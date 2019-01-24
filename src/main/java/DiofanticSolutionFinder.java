import java.sql.SQLOutput;

public class DiofanticSolutionFinder {

  private EuclideanAlgorithm euklides;
  private ReverseEuclideanAlgorithm reverseEuklides;
  private Solution solution;

  public DiofanticSolutionFinder() {
    this.reverseEuklides = new ReverseEuclideanAlgorithm();
    this.euklides = new EuclideanAlgorithm();
  }

  public Solution findSolution(Equation eq) {

    euklides.compute(eq);
    System.out.println(String.format("GCD for %s is %d", eq.toString(), euklides.getGCD()));

    if(eq.canBeSolved(euklides.getGCD())) {
      solution = reverseEuklides.computeSolutions(euklides);
    }
    System.out.println(solution.toString());

    return null;
  }
}

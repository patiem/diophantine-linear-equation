import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> equationCoefficients = new ArrayList<Integer>();
    System.out.println("Podaj ax + by = c, w kolejnosci a, b, c");
    Scanner reader = new Scanner(System.in);
//    int a = reader.nextInt();
//    int b = reader.nextInt();
//    int c = reader.nextInt();

//    Equation eq = new Equation(a, b, c);
    Equation eq = new Equation(42823, 6409, 17);

    DiofanticSolutionFinder dsf = new DiofanticSolutionFinder();
    Solution solution = dsf.findSolution(eq);

  }
}

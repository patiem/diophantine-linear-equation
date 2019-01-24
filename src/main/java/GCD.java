public class GCD {

//  public static EuclideanAlgorithm getGCD(Equation eq) {
//
//    EuclideanAlgorithm algoritm = new EuclideanAlgorithm();
//
//    int a = eq.getA();
//    int b = eq.getB();
//
//    if(b>a) {
//      int temp = a;
//      a = b;
//      b = temp;
//    }
//
//    EucdlideanLine first = new EucdlideanLine(a, b);
//    algoritm.addLine(first);
//    int rest = first.getRest();
//
//    while(rest > 0) {
//      EucdlideanLine nextLine = new EucdlideanLine(algoritm.getLatstRight(), algoritm.getLatstRest());
//      algoritm.addLine(nextLine);
//      System.out.println(nextLine);
//      rest = nextLine.getRest();
//    }
//
//    return algoritm;
//  }
}

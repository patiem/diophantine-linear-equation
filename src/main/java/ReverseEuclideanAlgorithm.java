import java.util.List;

public class ReverseEuclideanAlgorithm {

    int x0;
    int y0;
    int alfa;
    int beta;

    public Solution computeSolutions(EuclideanAlgorithm euklides) {

        //set first line from second last line
        List<EucdlideanLine> lines = euklides.getLines();

        int count = lines.size() -2;
        EucdlideanLine lastLine = lines.get(count);
        System.out.println(lastLine.toString());
        alfa = 1;
        x0 = lastLine.getLeft();
        beta = - lastLine.getAlfa();
        y0 = lastLine.getRight();

        for(int i = 1; i <= count; i++) {
            EucdlideanLine nextLine = lines.get(count - i);
            System.out.println(nextLine);
            int x = nextLine.getLeft();
            int y = nextLine.getRight();
            int gamma = -nextLine.getAlfa();

            if(x0==y) {
                alfa += beta*gamma;
                y0 = x;
            } else if (y0==y){
                x0 = x;
                beta += alfa*gamma;
            }
        }
        return new RealSolution(x0, y0, alfa, beta);


    }
}

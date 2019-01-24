public class RealSolution implements Solution {
    private int x0;
    private int y0;
    private int alfa;
    private int beta;

    public RealSolution(int x0, int y0, int alfa, int beta) {

        this.x0 = x0;
        this.y0 = y0;
        this.alfa = alfa;
        this.beta = beta;
    }

    @Override
    public String toString() {
        return "RealSolution{" +
                "x0=" + x0 +
                ", y0=" + y0 +
                ", alfa=" + alfa +
                ", beta=" + beta +
                '}';
    }
}

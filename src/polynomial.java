public class polynomial {

    static double evaluate(int x, double... constants) {
        int y = 0;
        double wert = 0;
        for (double constant : constants) {
            wert = wert + constant * Math.pow(x, y);
            y++;
        }
        return wert;
    }
}

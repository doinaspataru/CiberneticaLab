public class CalculatorClass1 {
    double u1 = -10, u2 = 15;
    double u1min = -10;
    double u1max = 10;
    double u2min = -15;
    double u2max = 15;
    double Hk;
    double g1, g2;
    double u1Actual, u2Actual;

    public void calculare() {
        for (double k = 0; k <= 2500; k+=50 ) {
            g1 = 8 * u1 - 16;
            g2 = 0.02 * u2 + 0.04;
            Hk = 4 / (k + 1);
            u1Actual = u1 - Hk * g1;
            u2Actual = u2 - Hk * g2;
            if (u1Actual < u1min) {
                u1 = u1min;
            } else if (u1Actual > u1max) {
                u1 = u1max;
            } else u1 = u1Actual;
            if (u2Actual < u2min) {
                u2 = u2min;
            } else if (u2Actual > u2max) {
                u2 = u2max;
            } else u2 = u2Actual;
            System.out.println();
            System.out.println("===============================================");
            System.out.println();
            System.out.println("k = " + k);
            System.out.println("g1 = " + g1);
            System.out.println("g2 = " + g2);
            System.out.println("u1~ = " + u1Actual);
            System.out.println("u2~ = " + u2Actual);
            System.out.println("u1 = " + u1);
            System.out.println("u2 = " + u2);
        }
    }
}

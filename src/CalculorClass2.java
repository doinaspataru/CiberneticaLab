public class CalculorClass2 {
    int u0, u1, u2, u3;
    double i = 0;
    double x0 = 2;
    double x4;
    int Xmax = 48;
    int Xmin = 28;
    int v1min = -1;
    int v1max = 3;
    int v2min = 0;
    int v2max = 4;
    double Ru = i*u0 + i*u1 + i*u2 + i*u3 + 1/2*x4;
    double x1,x2,x3;

    public void calculare () {
        System.out.println("X4minInitial = " + Xmin);
        System.out.println("X4maxInitial = " + Xmax);
        x0 = 2;
        x1 = 4 + u0;
        x2 = 6 + u0 + u1;
        x3 = 8 + u0 + u1 + u2;
        x4 = 10 + u0 + u1 + u2 + u3;
        Ru = u1 + 2*u2 + 3*u3 + 1/2*(x4);
        u0 = 2*v1min;
        u1 = 2*v1min + v2min;
        u2 = 2*v1min + 2*v2min;
        u3 = 2*v1min + 3*v2min;
        int X4minCalculat = 10 + u0 + u1 + u2 + u3;
        System.out.println("X4minCalculat = " + X4minCalculat );
        u0 = 2*v1max;
        u1 = 2*v1max + v2max;
        u2 = 2*v1max + 2*v2max;
        u3 = 2*v1max + 3*v2max;
        double X4maxCalculat = 10 + u0 + u1 + u2 + u3;
        System.out.println("X4maxCalculat = " + X4maxCalculat);
        //intersectia X4
        int a=0;
        for (int i = Xmin; i <= Xmax ; i++) {
            for (double j = X4minCalculat; j < X4maxCalculat; j++) {
                if(i == j) {
                    a++;
                }
            }
        }
        if (a>0){
            System.out.println("Sistemul este controlabil!");
        }
        else  {
            System.out.println("Sistemul nu este controlabil");
        }
    }
}

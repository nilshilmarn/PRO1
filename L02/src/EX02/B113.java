package EX02;

public class B113 {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;

        double c = 2.1;
        double d = 0.55;

        double e = 44.5;
        double f = 5.9;


        double x = (e * d - b * f) / (a * d - b * c);
        System.out.println("x = " + x);

        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("y = " + y);


        System.out.println(3.4 * x + 50.2 * y == e);

        System.out.println(2.1 * x + 0.55 * y == f);

    }
}

package EX4;

import java.util.Scanner;

public class B31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double q = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double p = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        if (a == 0)
        {
            return;
        }
        // diskriminant
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0)
        {
            System.out.println("The equation has one root: " + q);
        }
        else if (d < 0)
        {
            System.out.println("The equation has no real roots");
        }
        else // d > 0
        {
            System.out.println("The equation has two roots: " + q + " " + p);
        }



    }
}

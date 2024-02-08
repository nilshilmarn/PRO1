package EX4;

import java.util.Scanner;

public class B22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();

        double area = Math.sqrt(3) / 4 * Math.pow(length, 2);
        System.out.println(area);

        double volume = area * length;
        System.out.println(volume);
    }
}

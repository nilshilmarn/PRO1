package EX4;

import java.util.Scanner;

public class B26 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000");
        int integer = input.nextInt();

        if (integer <= 0 || integer >= 1000) {
            return;
        }

        int a = integer % 10;

        int b = integer / 10 % 10;

        int c = integer / 100 % 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int sum = a + b + c;

        System.out.println("Sum: " + sum);

    }
}

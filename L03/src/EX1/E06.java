package EX1;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an positive integer: ");

        int N = input.nextInt();

        if (N < 1)
        {
            return;
        }

        for (int i = 1; i <= N; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0 )
            {
                System.out.println("Fizz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}

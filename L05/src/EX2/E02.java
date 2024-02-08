package EX2;

import java.util.Scanner;
public class E02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        int lower = input.nextInt();

        System.out.println("Enter upper limit: ");
        int upper = input.nextInt();

        sumEvenInt(lower, upper);
    }


    public static void sumEvenInt(int lower, int upper)
    {

        // 2, 4, 6, 8, 10, 12, 14, 16

        int sum = 0;
        int even = 0;

        while (lower < upper)
        {

            if (lower % 2 == 0 )
            {
                sum += lower;
            }

            lower++;

        }

        System.out.println(sum);


    }

}

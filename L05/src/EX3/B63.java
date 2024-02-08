package EX3;

import java.util.Scanner;

public class B63 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        System.out.printf("Reversed: %d \n", reverse(number));


        if (isPallindrom(number)) {
            System.out.println("Its pallindrom!");
        }


    }


    public static boolean isPallindrom(int number)
    {

        boolean pallindrom = false;

        if (number == reverse(number)) {
            pallindrom = true;
        }

        return pallindrom;

    }

    public static int reverse(int number)
    {

        /*
        *    d c b a
        *    5 4 2 3
        *
        *     a b c d
        *     3 2 4 5
        *
        *           0 * 10 + 3 = 3
        *           30 * 10 + 2 = 32
        *           32 * 10 + 4 = 324
        *           324 * 10 + 5 = 3245
        *
        *
        *       reversednumber = reversednumber * 10 + digit
        *
        * */

        int digit = 0;
        int reversedNumber = 0;

        while (number != 0)
        {

            // extract the last digit
            digit = number % 10;
            //System.out.printf("Digit: %d \n", digit);

            // add the digits together in reversed order
            reversedNumber = reversedNumber * 10 + digit;
            //System.out.printf("Reversed number: %d \n", reversedNumber);

            // This will eventually become 0
            number = number / 10;

        }

        return reversedNumber;

    }

}


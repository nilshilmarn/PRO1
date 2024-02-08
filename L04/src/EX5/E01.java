package EX5;

import java.util.Scanner;

public class E01
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        // Generate a random integer between 10 and 99
        int lotteryNumber = (int) (Math.random() * 90) + 10;

        System.out.println("Guess the lottery number [10:99]: ");

        // System.out.println(lotteryNumber);

        int guess = input.nextInt();

        if (guess < 10 || guess > 99)
        {
            return;
        }

        if (guess == lotteryNumber)
        {
            System.out.println("YOU WIN $10.000");
        }
        else if (reverse(lotteryNumber, guess)) // If guess has the same digits as the lottery nunber (in revsersed order)
        {
            System.out.println("YOU WIN $3.000");
        }
        else if (single(lotteryNumber, guess)) // If guess has one of the digits in lottery number
        {
            System.out.println("YOU WIN $1.000");
        }
        else
        {
            System.out.println("SORRY, YOU LOOSE");
        }
    }

    public static boolean reverse(int lotteryNumber, int guess)
    {

        // Guess digits ab. Ex: guess = 45 => a = 4, b = 5
        int a = guess / 10;
        int b = guess % 10;

        // Lottery number digits cd
        int c = lotteryNumber / 10;
        int d = lotteryNumber % 10;

        // System.out.printf("%d %d \n", a, b);
        // System.out.printf("%d %d \n", c, d);

        if (a == d && b == c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean single(int lotteryNumber, int guess)
    {

        // Guess digits ab. Ex: guess = 45 => a = 4, b = 5
        int a = guess / 10;
        int b = guess % 10;

        // Lottery number digits cd
        int c = lotteryNumber / 10;
        int d = lotteryNumber % 10;

        if ( a == c || a == d || b == c || b == d )
        {
            return true;
        }
        else {
            return false;
        }
    }
}

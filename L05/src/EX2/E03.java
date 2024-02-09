package EX2;

public class E03 {


    public static void main(String[] args)
    {

        System.out.println(sumOddDigits(123));

    }

    public static int sumOddDigits(int number)
    {

        int sum = 0;
        int digit = 0;

        // Split digits up

        while (number != 0)
        {

            // extract the last digit
            digit = number % 10;

            // check if digit is odd
            if (digit % 2 != 0)
            {
                sum += digit; // if digit is odd add it to the sum
            }

            number = number / 10; // This will eventually become 0

        }

        return sum;

    }

}

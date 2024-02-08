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
        int remainder = 1;
        int i = 0;

        // Split digits up

        while (remainder != 0) {

            remainder = number / (int) Math.pow(10, i); // This will eventually become 0

            //System.out.println(remainder);

            digit = remainder % 10;

            // check if digit is odd
            if (digit % 2 != 0)
            {
                sum += digit; // if digit is odd add it to the sum
            }

            i++;
        }

        return sum;

    }

}

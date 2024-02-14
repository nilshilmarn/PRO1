package EX2;

import java.util.Scanner;

public class E04
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        int repatedNumber = 0;
        int lastNumber = 0;
        int count = 1;

        for (int i = 0; i < 10; i++)
        {

            int currentNumber = input.nextInt();

            if (currentNumber == lastNumber) // 1 2 2 2
            {
                lastNumber = currentNumber;
                count++;
            }
            else
            {
                if (count > 1)
                {
                    System.out.println(lastNumber + " ");
                    lastNumber = currentNumber;
                    count = 1;
                }

            }

            lastNumber = currentNumber;
        }
        if (count > 1) {
            System.out.println(lastNumber + " ");
        }

    }

}

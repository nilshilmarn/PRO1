package EX2;

import java.util.Scanner;

public class E04
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        int repatedNumber = 0;
        int lastNumber = 0;



        for (int i = 0; i < 10; i++)
        {

            int currentNumber = input.nextInt();

            if (currentNumber == lastNumber)
            {
               repatedNumber = repatedNumber * 10 + currentNumber;
            }

            lastNumber = currentNumber;
        }

        System.out.println(repatedNumber);
    }

}

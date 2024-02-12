package EX2;

import java.util.Scanner;

public class E02
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int sum = 0;


        for (int i = 0; i < 10; i++)
        {

            int currentNumber = input.nextInt();

            sum += currentNumber;

            System.out.print(sum);


        }


    }


}

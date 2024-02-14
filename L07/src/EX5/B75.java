package EX5;


import java.util.Scanner;

public class B75
{


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int i = 0; i < array.length; i++)
        {
            int currentNumber = input.nextInt();

            if (currentNumber % 2 == 0)
            {
                evenNumbers++;
            } else {
                oddNumbers++;
            }


        }

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }






}

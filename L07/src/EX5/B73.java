package EX5;


import java.util.Arrays;
import java.util.Scanner;

public class B73
{


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int[] array = new int[50];

        int currentNumber;

        do {

            currentNumber = input.nextInt();

            array[currentNumber]++;

        } while (currentNumber != 0);


        for (int i = 1; i < array.length; i++) //
        {

            if (array[i] > 0)
            {
                System.out.println(i + " occurs " + array[i] + " times.");
            }

        }

        System.out.println(Arrays.toString(array));


    }



}

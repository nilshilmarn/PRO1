package EX6;

import java.util.Arrays;

public class E01
{


    public static void main(String[] args)
    {

        int[] a = {0,1,3,3,5,6};

        //switchFirstAndLast(a);

        //replaceEvenNumbers(a);

        //System.out.println(secondHigestNumber(a));

        //System.out.println(ascending(a));

        //shiftArray(a);

        System.out.println(doublets(a));

    }

    public static void printArray(int [] array)
    {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    /*
    * A method that switches the first and last element in the array.
    * */
    public static void switchFirstAndLast(int[] array)
    {
        int firstElement = array[0];
        int lastElement = array[array.length - 1];

        array[0] = lastElement;
        array[array.length - 1] = firstElement;

        printArray(array);
    }

    /*
    * A method that replaces all even numbers with 0 (zero)
    * */
    public static void replaceEvenNumbers(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                array[i] = 0;
            }
        }
        printArray(array);
    }

    /*
    * A method that returns the second highest element in the array.
    * */
    public static int secondHigestNumber(int[] array)
    {
        int highestNumber = 0;
        int secondHighestNumber = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > highestNumber)
            {
                secondHighestNumber = highestNumber;
                highestNumber = array[i];
            }
        }
        return secondHighestNumber;
    }

    /*
    * A method that returns true if the elements in the array are sorted ascending
    * */
    public static boolean ascending(int[] array)
    {
        boolean ascending = true;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i-1] > array[i])
            {
                ascending = false;
            }
        }
        return ascending;
    }
    /*
    * A method that shifts all elements in the array to the right (to an index one higher). The
    * last element is shifted to the first index in the array.
    * Example: {1, 4, 9, 16, 25} is changed to {25, 1, 4, 9, 16}
    * */
    public static void shiftArray(int[] array)
    {
        int lastDigit = array[array.length-1];

        for (int i = array.length - 1; i > 0; i--)
        {
                array[i] = array[i-1];
        }
        // Set first digit to last digit
        array[0] = lastDigit;

        printArray(array);
    }

    /*
    * A method that returns true if the array has doublets.
    * Example: true is returned for {2, 5, 8, 5}, false is returned for {2, 5, 8, 6}.
    * */
    public static boolean doublets(int[] array)
    {

        boolean hasDoublets = false;

        int[] N = new int[array.length + 1];

        for (int i = 0; i < array.length; i++)
        {
            N[array[i]]++;

            if (N[array[i]] > 1)
            {
                hasDoublets = true;
            }
        }
        //printArray(N);

        return hasDoublets;
    }
}

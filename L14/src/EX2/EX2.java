package EX2;

import java.util.ArrayList;

public class EX2
{

    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.
        total = sum(ints);
        System.out.println("Sum: " + total);

        // Test of minimum() method: correct minimum is -16.
        int minimum = minimum(ints);
        System.out.println("Minimum: " + minimum);

        // Test of maximum() method: correct maximum is 45.
        int maximum = maximum(ints);
        System.out.println("Maximum: " + maximum);

        // Test of average() method: correct average is 7.625.
        double average = average(ints);
        System.out.println("Average: " + average);

        // Test of zeroes() method: correct number of zeroes is 2.
        int zeroes = zeroes(ints);
        System.out.println("Zeroes: " + zeroes);

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evenNumbers = evens(ints);
        System.out.println(evenNumbers);


    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list)
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    /**
     * Return the sum of all numbers in the list.
     * Return 0, if the list is empty.
     */
    public static int sum(ArrayList<Integer> list)
    {
        if (list.size() == 0)
        {
            return 0;
        }

        int sum = 0;
        for (int number : list)
        {
            sum += number;
        }
        return sum;
    }


    /**
     * Return the minimum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int minimum(ArrayList<Integer> list)
    {
        if (list.size() == 0)
        {
            return 0;
        }

        int minimum = list.getFirst();

        for (int number : list)
        {
            if (number < minimum)
            {
                minimum = number;
            }
        }

        return minimum;
    }


    /**
     * Return the maximum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int maximum(ArrayList<Integer> list)
    {
        if (list.size() == 0)
        {
            return 0;
        }

        int maximum = list.getFirst();

        for (int number : list)
        {
            if (number > maximum)
            {
                maximum = number;
            }
        }

        return maximum;

    }

    /**
     * Return the average of the numbers in the list.
     * Pre: The list is not empty.
     */
    public static double average(ArrayList<Integer> list)
    {
        if (list.size() == 0)
        {
            return 0;
        }

        int sum = sum(list);
        int sizeOfList = list.size();

        return (double) sum / sizeOfList;
    }

    /**
     * Return the number of zeros in the list.
     */
    public static int zeroes(ArrayList<Integer> list)
    {

        int count = 0;

        for (int number : list)
        {
            if (number == 0)
            {
                count++;
            }
        }

        return count;

    }

    /**
     * Return a new list containing the even numbers in the list.
     */
    public static ArrayList<Integer> evens(ArrayList<Integer> list)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : list)
        {
            if (number % 2 == 0)
            {
                evenNumbers.add(number);
            }

        }
        return evenNumbers;
    }


}

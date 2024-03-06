package EX4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EX4Test
{

    public static void main(String[] args)
    {


        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(0);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(9);

        System.out.println(ints);
        System.out.println();

        switchFirstLast(ints);
        System.out.println(ints);
        System.out.println();

        replaceEvenNumbers(ints);
        System.out.println(ints);
        System.out.println();

        System.out.println(secondHighest(ints));
        System.out.println();

        System.out.println(sorted(ints));
        System.out.println();

        shiftElements(ints);
        System.out.println();

        System.out.println(ints);
        System.out.println(hasDoublets(ints));

    }


    public static void switchFirstLast(ArrayList<Integer> list)
    {
        int firstInt = list.getFirst();
        int lastInt = list.getLast();

        System.out.println(firstInt);
        System.out.println(lastInt);

        list.set(0, lastInt);
        list.set(list.size() - 1, firstInt);

    }

    public static void replaceEvenNumbers(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0)
            {
                list.set(i, 0);
            }
        }

    }

    public static int secondHighest(ArrayList<Integer> list)
    {


        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int number : list)
        {

            if (number > highest)
            {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest && number != highest)
            {
                secondHighest = number;
            }

        }

        return secondHighest;
    }

    public static boolean sorted(ArrayList<Integer> list)
    {

        boolean sorted = true;

        for (int i = 0; i < list.size() - 1; i++)
        {
            if (list.get(i + 1) < list.get(i))
            {
                sorted = false;
            }
        }

        return sorted;

    }

    public static void shiftElements(ArrayList<Integer> list)
    {
        int temp = list.remove(list.size() - 1);
    
        list.add(0, temp);
        System.out.println(list);

    }

    public static boolean hasDoublets(ArrayList<Integer> list)
    {
        boolean hasDoublets = false;

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    return hasDoublets = true;
                }

            }

        }
        return hasDoublets;

    }


}

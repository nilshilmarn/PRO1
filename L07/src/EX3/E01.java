package EX3;

import java.util.Arrays;

public class E01
{


    public static void main(String[] args)
    {

        int[] a = {4,6,7,2,3};
        int[] b = {4,6,8,2,6};

        System.out.println(Arrays.toString(sumArrays(a,b)));

        int[] c = {4,6,7,2,3,1,1,1};
        int[] d = {4,6,8,2,6};

        System.out.println(Arrays.toString(sumUnequalArrays(c,d)));

    }


    public static int[] sumArrays(int[] a, int[] b)
    {

        if (a.length != b.length)
        {
            return null;
        }

        int[] newArray = new int[a.length];

        for (int i = 0; i < a.length; i++)
        {

           newArray[i] = a[i] + b[i];

        }

        return newArray;

    }


    public static int[] sumUnequalArrays(int[] a, int[] b)
    {

        int[] shortestArray;
        int[] longestArray;

        if (a.length > b.length)
        {
            shortestArray = b;
            longestArray = a;
        } else
        {
            shortestArray = a;
            longestArray = b;
        }


        for (int i = 0; i < shortestArray.length; i++)
        {
            longestArray[i] += shortestArray[i];
        }

        return longestArray;

    }

}

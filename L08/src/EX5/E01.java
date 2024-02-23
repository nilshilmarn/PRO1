package EX5;

public class E01
{

    public static void main(String[] args)
    {

        int[] a = {1,2,3,4,5,6,7,9,11};
        int[] b = {1,2,3,4,5,6,7};

        //System.out.println(equals(a,b));

        System.out.println(sameValues(a,b));

    }



    public static boolean equals(int[] a, int[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }
        return true;
    }


    public static boolean sameValues(int[] a, int[] b)
    {
        int[] shortestArray = shortestArray(a,b); // either a or b

        for (int i = 0; i < shortestArray.length; i++)
        {
            if (contains(a, shortestArray[i]) != contains(b, shortestArray[i])) // Check if values in the shortest array
            {
                return false;
            }

        }
        return true;
    }

    public static boolean contains(int[] array, int value)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
            {
                return true;
            }
        }
        return false;
    }

    public static int[] shortestArray(int[] a, int[] b)
    {
        int[] shortestArray;

        if (a.length > b.length) {
            shortestArray = b;
        } else {
            shortestArray = a;
        }
        return shortestArray;
    }


}

package EX4;

public class E01
{


    public static void main(String[] args)
    {

        int[] a = {2, 1, 6, 2, 6, 8};

        System.out.println(hasUneven(a));
    }


    public static boolean hasUneven(int[] t)
    {

        boolean hasOddNumber = false;

        for (int i = 0; i < t.length; i++)
        {

            if (t[i] % 2 != 0)
            {
                return hasOddNumber = true;
            }

        }

        return hasOddNumber;

    }

}

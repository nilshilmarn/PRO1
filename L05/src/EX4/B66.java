package EX4;

public class B66
{

    public static void main(String[] args)
    {
        displayPattern();
    }


    public static void displayPattern()
    {


        int i = 1;
        int n = 3;
        int spaces = n - 1; // if n = 3 -> 4, 2, 0 <-> (3-2) * 2 = 4, (2 - 1) * 2 = 2, (1-1) * 2 = 0

        while (i <= n)
        {

            int k = 0; // Reset k to 0

            while (k < spaces)
            {
                System.out.print("  ");
                k++;
            }

            int j = 1; // Reset j to 1.

            while (j - 1 < i)
            {
                System.out.print(j + " ");
                j++;
            }

            System.out.println();
            spaces--;
            i++;

        }

    }

}

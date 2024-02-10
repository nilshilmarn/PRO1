package EX4;

import java.util.Scanner;
public class B66
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int n = input.nextInt();

        displayPattern(n);
    }


    public static void displayPattern(int n)
    {


        int i = 1;
        int spaces = n - 1; // if n = 3 -> 4, 2, 0 <-> (3-2) * 2 = 4, (2 - 1) * 2 = 2, (1-1) * 2 = 0

        while (i <= n)
        {

            int k = 0; // Reset k to 0

            // Comment this while loop out to make the pattern right-aligned
            while (k < spaces)
            {
                System.out.print("  ");
                k++;
            }

            int j = 1; // Reset j to 1 to print 1 -> n

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

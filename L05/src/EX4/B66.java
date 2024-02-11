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


        int i = 0;
        int spaces = n - 1; // if n = 3 -> 4, 2, 0 <-> (3-2) * 2 = 4, (2 - 1) * 2 = 2, (1-1) * 2 = 0

        while (i < n)
        {
            /*
             * Left aligned
             * */

//            int j = 1; // Reset j to 1 to print 1 -> i
//
//            while (j - 1 <= i)
//            {
//                System.out.print(j + " ");
//                j++;
//            }

            /*
             * Right aligned
             * */

            int k = 0; // Reset k to 0

            while (k < spaces)
            {
                System.out.print("  ");
                k++;
            }

            int j = i + 1;

            // 1) i = 0, 2) i = 1, i = 0, 3) etc.
            while (j > 0) {
                System.out.print(j + " ");
                j--;
            }


            System.out.println();
            spaces--;
            i++;

        }

    }

}

package EX4;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read 3 integers
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();



        System.out.println(order(a, b, c));

    }


    public static String order(int a, int b, int c) {

        // Store them in an array
        int[] array = {a , b, c};

        String Str = "";

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < array.length - 1; i++)
        {

            if (array[i] > array[i + 1])
            {
                increasing = false;
                // System.out.println("Decreasing");
            }
            else if (array[i] < array[i + 1])
            {
                decreasing = false;
                // System.out.println("Increasing");
            }
        }

        if (increasing)
        {
            return Str = String.format("%d %d %d er voksende.", a, b, c);
        }
        else if (decreasing)
        {
            return Str = String.format("%d %d %d er aftagende.", a, b, c);
        }
        else
        {
            return Str = String.format("%d %d %d er hverken-eller.", a, b, c);
        }

    }
}

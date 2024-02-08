package EX1;

import java.util.Scanner;


public class E01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();



        if (N < 0)
        {
            System.out.println("Negativ");
        }
        else if (N == 0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("Positiv");
        }

    }
}

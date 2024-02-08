package EX1;


import java.util.Scanner;


public class E02 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int limit = input.nextInt();

        int sum = 0;
        int square = 0;
        int i = 1;

        // 1 , 2 , 3,  4
        // 1 + 4 + 9 + 16

        while (square <= limit)
        {

            sum += square;

            // square = (int) Math.pow(step, 2);
            square = i * i;

            i++;

        }

        System.out.printf("Sum: %d", sum);


    }

}

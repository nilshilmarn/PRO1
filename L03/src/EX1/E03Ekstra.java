package EX1;

import java.util.Scanner;
import java.util.Arrays;

public class E03Ekstra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();


        int[] numbers = {firstNumber, secondNumber, thirdNumber};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }



    }
}

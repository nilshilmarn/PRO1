package EX1;

import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(secondNumber);
            System.out.println(firstNumber);
        } else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);

        }
    }
}

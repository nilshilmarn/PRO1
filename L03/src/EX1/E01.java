package EX1;

import java.util.Scanner;


public class E01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Purcahsed amount
        System.out.print("Enter purchased amount: ");
        double purchasedAmount = input.nextDouble();

        /*
        * Calculating the tax (6%)
        * */

        // Tax rate
        double tax = 0.06;

        double taxAmount = purchasedAmount * tax;

        // Format to two decimals
        System.out.printf("$%.2f", taxAmount);

    }

}

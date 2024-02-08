package EX4;

import java.util.Scanner;

public class B25 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        double subtotal = input.nextDouble();

        double gratuityRate = input.nextDouble() / 100;

        double gratuity = subtotal * gratuityRate;
        System.out.println("$" + gratuity);

        double total = gratuity + subtotal;
        System.out.println("$" + total);



    }
}

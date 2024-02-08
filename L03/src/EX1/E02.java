package EX1;

import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Loan amount: ");
    double loanAmount = input.nextDouble();

    System.out.print("Annual interest rate: ");
    double annualInterestRate = input.nextDouble();
    double montlyInterestRate = annualInterestRate / 1200;

    System.out.print("Years: ");
    int years = input.nextInt();
    double months = years * 12;

    double denumerator =  1 - 1 / (Math.pow(1 + montlyInterestRate, months));

    double montlyPayment = loanAmount * montlyInterestRate / denumerator;
    double totalPayment = montlyPayment * months;

        System.out.printf("Montly payment: %.2f\n", montlyPayment);
        System.out.printf("Total payment: %.2f ", totalPayment);





    }


}

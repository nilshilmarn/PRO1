package Extra;

import java.util.Scanner;


public class B321 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wedensday", "Thursday", "Friday"};

        // Year
        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        // Month
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();

        // Day
        System.out.println("Enter the day of the month: 1-31: ");
        int day = input.nextInt();


        int h = (day + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.println(h);




    }


}

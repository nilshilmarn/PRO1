package EX9;

import java.util.Scanner;


public class B35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] weekDays  = {"Sunday", "Monday", "Tuesday", "Wedensday", "Thursday", "Friday", "Saturday"};

        System.out.println("Enter today's day: ");

        int day = input.nextInt();

        if (day < 0 && day > 6)
        {
            return;
        }

        System.out.println("Enter the number of days elapsed since today: ");

        int daysElapsed = input.nextInt();
        daysElapsed = (day + daysElapsed) % 7;

        String today = weekDays[day];
        String future = weekDays[daysElapsed];


        System.out.printf("Today is %s and the future day is %s", today, future);

    }



}

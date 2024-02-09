package EX8;

import java.util.Scanner;


public class E01 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month [Ex: 5]");

        int month = input.nextInt();

        System.out.println("Enter a date [Ex: 3]");

        int day = input.nextInt();

        System.out.println("The season is: " + season(month, day));
    }




    public static String season(int month, int day)
    {
        String season = "";

        if (month == 12 || month == 1 || month == 2 )
        {
            season = "Vinter";
        }
        else if (month == 3 || month == 4 || month == 5)
        {
            season = "Forår";
        }
        else if (month == 6 || month == 7 || month == 8)
        {
            season = "Sommer";
        }
        else {
            season =  "Efterår";
        }

        if ((month == 2 || month == 5 || month == 8 || month == 11) && day >= 21)
        {
            if (season.equals("Vinter")) // season.equals("Vinter")
            {
                season = "Forår";
            }
            else if (season.equals("Forår"))
            {
                season = "Sommer";
            }
            else if (season.equals("Sommer"))
            {
                season = "Efterår";
            }
            else
            {
                season = "Vinter";
            }

        }

    return season;

    }
}

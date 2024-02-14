package EX4;

import javax.sound.midi.Soundbank;

public class Starsv2
{

    public static void main(String[] args)
    {
        Stars(7);

    }

    public static void Stars(int n)
    {

        /*
        * Stars
        *  */

        int stars = 1;
        double halfway = Math.round(n / 2.0);

        int starsFactor = 2;
        int dashesFactor = 1;

        if (n % 2 != 0) // odd
        {
            starsFactor = 4;
            dashesFactor = 2;
        }

        /*
         * Dashes
         *  */

        double dashesLeft = Math.round(n / 2.0) - 1;
        double dashesRight = Math.round(n / 2.0) - 1;

        for (int row = 1; row <= n; row++)
        {

                if (row <= halfway)
                {

                    // Dahes Left
                    for (int i = 1; i <= dashesLeft; i++)
                    {
                        System.out.printf("-");
                    }
                    dashesLeft--;


                    // Print stars
                    for (int i = 1; i <= stars; i++)
                    {
                        System.out.printf("*");
                    }
                    stars += 2;


                    // Dahes right
                    for (int i = 1; i <= dashesRight; i++)
                    {
                        System.out.printf("-");
                    }
                    dashesRight--;


                }
                else
                {

                    // Dahes Left
                    for (int i = 1; i <= dashesLeft + dashesFactor; i++)
                    {
                        System.out.printf("-");
                    }
                    dashesLeft++;


                    for (int i = 1; i <= stars - starsFactor; i++)
                    {
                        System.out.printf("*");
                    }
                    stars -= 2;

                    // Dahes Right
                    for (int i = 1; i <= dashesRight + dashesFactor; i++)
                    {
                        System.out.printf("-");
                    }
                    dashesRight++;
                }

            ;

            System.out.println("");
        }
    }
}

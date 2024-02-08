package EX7;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Is your child a boy? [True or False]");

        boolean isBoy = input.nextBoolean();

        System.out.println("Childs' age?");

        int age = input.nextInt();

        System.out.println(team(isBoy, age));

    }


    public static String team(boolean isBoy, int age)
    {
        String team = "";

        if (isBoy)
            if (age < 8)
            {
                team = "Young cubs";

            }
            else
            {
                team = "Cool boys";

            }
            else
         {
            if (age < 8)
            {
                team = "Tumbling girls";
            }
            else
            {
                team = "Springy girls";
            }
         }

        return team;

    }

}

package EX7;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Is your child a boy? [True or False]");

        boolean isBoy = input.nextBoolean();

        System.out.println("Childs' age?");

        int age = input.nextInt();

        System.out.printf("Institution: %s \n", institution(age));
        System.out.printf("Team: %s", team(isBoy, age));

    }

    public static String institution(int age)
    {

        String institution = "";

        if (age == 0)
        {
            institution = "Home";
        }
        else if (age == 1 || age == 2)
        {
            institution = "Nursery";
        }
        else if (age >= 3 && age <= 5 )
        {
            institution = "Kindergarten";
        }
        else if (age >= 6 && age <= 16)
        {
            institution = "School";
        }
        else
        {
            institution = "Out of school";
        }

        return institution;

    }

    public static String team(boolean isBoy, int age)
    {
        String team = "";

        if (isBoy)
        {
            if (age < 8)
            {
                team = "Young cubs";
            }
            else
            {
                team = "Cool boys";
            }
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

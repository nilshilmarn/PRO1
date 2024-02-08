package EX6;

import java.util.Scanner;



public class E01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's your age: ");

        int age = input.nextInt();

        System.out.println(institution(age));

    }


    public static String institution(int age)
    {

        String institution = "";

        if (age == 0)
        {
            return institution = "Home";
        }
        else if (age == 1 || age == 2)
        {
            return institution = "Nursery";
        }
        else if (age == 3 || age == 4 || age == 5)
        {
            return institution = "Kindergarten";
        }
        else if (age > 5 && age < 17)
        {
            return institution = "School";
        }
        else
        {
            return institution = "Out of school";
        }

    }



}

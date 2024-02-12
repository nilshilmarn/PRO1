package EX2;


import java.util.Scanner;
public class E03
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        int highestNumber = 0;
        int highestNumberAppearences = 0;

        for (int i = 0; i < 10; i++)
        {

            int currentNumber = input.nextInt();

            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;

                highestNumberAppearences = 0;
            }

            if (currentNumber == highestNumber)
            {
                highestNumberAppearences++;
            }



        }

        System.out.println(highestNumber);
        System.out.println(highestNumberAppearences);

    }



}

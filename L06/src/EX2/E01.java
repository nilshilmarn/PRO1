package EX2;


import java.util.Scanner;
public class E01
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int highestNumber = 0;
        int lowestNumber = 1;
        int evenNumbers = 0;
        int oddNumbers = 0;


        for (int i = 0; i < 10; i++)
        {

            int currentNumber = input.nextInt();

            if (currentNumber < 1 || currentNumber > 99)
            {
                return;
            }


            if (currentNumber > highestNumber)
            {
                highestNumber = currentNumber;

            }

            if (currentNumber < lowestNumber)
            {
                lowestNumber = currentNumber;
            }

            if (currentNumber % 2 == 0)
            {
                evenNumbers++;
            }

            if (currentNumber % 2 != 0)
            {
                oddNumbers++;
            }


        }

        System.out.println("Highest number: " + highestNumber);
        System.out.println("Lowest number: " + lowestNumber);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);



    }











}

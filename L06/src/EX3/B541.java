package EX3;


import java.util.Scanner;



public class B541
{


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

     /*Opgave 5.41 i bogen. Brug en do-while loop.
       Sidste linje i løkken skal indlæse et tal.
       (Bemærk: Hvor mange tal, der indlæses, er ikke kendt.)*/

        int highestNumber = 0;
        int highestNumberAppearences = 0;
        int currentNumber = 0;

        do {

            System.out.println(currentNumber);

            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;

                highestNumberAppearences = 1;

            }

            else if (currentNumber == highestNumber)
            {
                highestNumberAppearences++;
            }


            currentNumber = input.nextInt();
        } while (input.nextInt() != 0);

        System.out.println(highestNumber);
        System.out.println(highestNumberAppearences);



    }



}

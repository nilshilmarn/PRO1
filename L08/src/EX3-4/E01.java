package EX3;


import java.util.Scanner;
public class E01
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Size: ");
        int size = input.nextInt();

        int[] sequence = new int[size];
        String[] captions = new String[size];

        System.out.print("Values: " );
        for (int i = 0; i < size; i++)
        {
            sequence[i] = input.nextInt();
        }

        System.out.print("Captions: " );
        for (int i = 0; i < size; i++)
        {
            captions[i] = input.next();
        }


        int maximumValue = 0;

        for (int i = 0; i < sequence.length; i++)
        {
            if (sequence[i] > maximumValue)
            {
                maximumValue = sequence[i];
            }
        }

        int asterisksCount = 40 / maximumValue;

        for (int i = 0; i < sequence.length; i++)
        {

            System.out.printf("%s ", captions[i]);

            for (int j = 0; j < asterisksCount * sequence[i]; j++)
            {
                //  40 / maximumValue
                System.out.printf("*");

            }

            System.out.println();

        }






    }




}

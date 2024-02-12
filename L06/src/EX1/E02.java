package EX1;

public class E02
{

    public static void main(String[] args)
    {

        printPowersOfTwo();

    }


    public static void printPowersOfTwo()
    {


        int sum = 1;

        for (int i = 0; i <= 20; i++) {

            System.out.println(sum);

            sum *= 2;

        }

    }

}

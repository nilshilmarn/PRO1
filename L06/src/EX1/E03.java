package EX1;

public class E03
{

    public static void main(String[] args)
    {

        System.out.println(sumEvenInts(4,25));



    }


    public static int sumEvenInts(int lower, int upper)
    {

        int sum = 0;

        for (int i = lower; lower <= upper; lower++) {


            if ( lower % 2 == 0)
            {

                sum += lower;

            }

        }

        return sum;

    }

}

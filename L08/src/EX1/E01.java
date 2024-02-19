package EX1;

import java.util.Arrays;

public class E01
{


    public static void main(String[] args)
    {


        int[] dieTosses = new int[20];

        for (int i = 0; i < dieTosses.length; i++)
        {
            int randomTosses = (int) (Math.random() * 6 + 1);
            dieTosses[i] = randomTosses;
        }

        boolean inRun = false;

        for (int i = 0; i < dieTosses.length; i++)
        {

            if (inRun)
            {
                if (dieTosses[i] != dieTosses[i-1])
                {
                    System.out.printf(")");
                    inRun = false;
                }
            }
            if (!inRun)
            {
                if (i < dieTosses.length - 1 && dieTosses[i] == dieTosses[i+1])
                {
                    System.out.printf("(");
                    inRun = true;
                }
            }

            System.out.printf("%d", dieTosses[i]);

        }

    }







}

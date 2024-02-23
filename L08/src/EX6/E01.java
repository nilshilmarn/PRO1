package EX6;

import java.util.Arrays;

public class E01
{

    public static void main(String[] args)
    {


        boolean[] doors = new boolean[100];

        //System.out.println(Arrays.toString(doors));
        //System.out.println();

        for (int i = 1; i <= doors.length; i++)
        {
            for (int j = i - 1; j < doors.length; j += i)
            {
                if (doors[j] == true)
                {
                    doors[j] = false;
                } else {
                    doors[j] = true;
                }
            }
        }

        //System.out.println(Arrays.toString(doors));

        for (int i = 0; i < doors.length; i++)
        {
            if (doors[i] == true)
            {
                System.out.printf("L%s ", i);
            }

        }

    }





}


package EX1;

import java.util.Arrays;

public class E01
{

    public static void main(String[] args)
    {

        // a. 0 0 0 0 0 0 0 0 0 0

        int a[] = new int[10];

        System.out.print("a) ");
        System.out.println(Arrays.toString(a));
        System.out.println();


        int b[] = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};

        System.out.print("b) ");
        System.out.println(Arrays.toString(b));
        System.out.println();

        int c[] = new int[10];

        for (int i = 0; i < c.length; i++)
        {
            c[i] = i;
        }

        System.out.print("c) ");
        System.out.println(Arrays.toString(c));
        System.out.println();


        int d[] = new int[10];
        for (int i = 0; i < d.length; i++)
        {
            d[i] = (i+1) * 2;
        }

        System.out.print("d) ");
        System.out.println(Arrays.toString(d));
        System.out.println();


        int e[] = new int[10];
        for (int i = 0; i < e.length; i++)
        {
            e[i] = (i+1) * (i+1);
        }

        System.out.print("e) ");
        System.out.println(Arrays.toString(e));
        System.out.println();

        int f[] = new int[10];
        for (int i = 0; i < f.length; i++)
        {
            if (i % 2 !=0) {
                f[i] = 1;
            }
        }

        System.out.print("f) ");
        System.out.println(Arrays.toString(f));
        System.out.println();

        int g[] = new int[10];
        for (int i = 0; i < g.length; i++)
        {
            g[i] = i % 5;
        }

        System.out.print("g) ");
        System.out.println(Arrays.toString(g));
        System.out.println();

        int h[] = new int[10];
        for (int i = 1; i < h.length; i++)
        {


            if (i % 2 != 0) {

                h[i] = h[i-1] + 3;
            }
            else
            {
                h[i] = h[i-1] + 1;
            }

        }

        System.out.print("h) ");
        System.out.println(Arrays.toString(h));
        System.out.println();



    }


}

package EX4;

import java.util.Scanner;

public class E01v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(order(a, b ,c));
    }



    public static String order(int a, int b, int c) {

        String Str = "";

         if (b > a)
         {
            if (c > b)
            {
                return Str = "voksende";
            }
            else
            {
                return Str = "hverken-eller";
            }
         }
         else if (b < a)
         {
            if ( c < b)
            {
                return Str = "aftagende";
            }
            else
            {
                return Str = "hverken-eller";
            }
         }
         else {
             return Str = "hverken-eller";
         }


    }

}

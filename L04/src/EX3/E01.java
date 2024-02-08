package EX3;


import java.util.Scanner;

public class E01 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(sign(N));
    }





    public static String sign(int N) {

        String Str = "";

        if (N < 0)
        {
            return Str = "Negativ";
        }
        else if (N == 0)
        {
            return Str = "0";
        }
        else
        {
            return Str = "Positiv";
        }



    }




}

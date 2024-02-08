package EX2;

public class E01 {

    public static void main(String[] args) {

        printPowersofTwo();

    }

    public static void printPowersofTwo() {

        int i = 0;
        int result = 1;

        while (i <= 20)
        {

            System.out.println(result);
            //System.out.println(Math.pow(2, i));

            result = result * 2;

            i++;

        }

    }


}

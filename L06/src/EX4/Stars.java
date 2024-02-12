package EX4;

public class Stars {
    public static void main(String[] args) {
//        exA(10);
//        System.out.println();

//        exB(10);
//        System.out.println();

//        exC(10);
//        System.out.println();

        exD(10);
        System.out.println();
    }

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            // print stars
            int starCount = rowCount - row + 1;
            for (int i = 1; i <= starCount; i++) {
                System.out.print('*');
            }
            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                System.out.print('-');
            }
            // go to next line
            System.out.println();
        }
    }

    public static void exB(int rowCount) {

        for (int row = 1; row <= rowCount; row++)
        {

            System.out.printf("%2d: ", row);


            int dashCount = rowCount - row;
            for (int i = 1; i <= dashCount; i++)
            {
                System.out.printf("-");
            }

            int starCount = row;
            for (int i = 1; i <= starCount; i++)
            {
                System.out.printf("*");
            }

            // go to next line
            System.out.println();
        }

    }


    public static void exC(int rowCount) {

        for (int row = 1; row <= rowCount; row++)
        {

            System.out.printf("%2d: ", row);

            int dashCount = row - 1;
            for (int i = 1; i <= dashCount; i++)
            {
                System.out.printf("-");
            }



            int starCount = rowCount - row + 1;
            for (int i = 1; i <= starCount; i++)
            {
                System.out.printf("*");
            }


            // go to next line
            System.out.println();
        }

    }


    public static void exD(int rowCount) {

        int starCount = 1;
        int dashCountLeft = 4;
        int dashCountRight = 4;

        for (int row = 1; row <= rowCount; row++)
        {

            System.out.printf("%2d: ", row);

            if (row <= 5 ) {

                for (int i = 1; i <= dashCountLeft; i++)
                {
                    System.out.printf("-");
                }
                dashCountLeft--;

                for (int i = 1; i <= starCount; i++)
                {
                    System.out.printf("*");
                }
                starCount += 2;

                for (int i = 1; i <= dashCountRight; i++)
                {
                    System.out.printf("-");
                }
                dashCountRight--;

            }

            if (row > 5)
            {

                for (int i = 1; i <= dashCountLeft + 1; i++)
                {
                    System.out.printf("-");
                }
                dashCountLeft++;



                for (int i = 1; i <= starCount - 2; i++)
                {
                    System.out.printf("*");
                }
                starCount -= 2;

                for (int i = 1; i <= dashCountRight + 1; i++)
                {
                    System.out.printf("-");
                }
                dashCountRight++;

            }


            // go to next line
            System.out.println();
        }

    }


}

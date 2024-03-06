package EX6;

public class MyRectangle2DApp
{

    public static void main(String[] args)
    {

        MyRectangle2D r1 = new MyRectangle2D(3, 2.5, 4, 3);
        System.out.println(r1.contains(1, 1));


        MyRectangle2D r2 = new MyRectangle2D(5.5, 1, 3, 2);
        MyRectangle2D r3 = new MyRectangle2D(3, 2.5, 3, 2);
        System.out.println(r1.contains(r2));

        System.out.println(r1.overlaps(r2));
        System.out.println(r1.overlaps(r3));

        System.out.println(r1.contains(r3));


    }
}

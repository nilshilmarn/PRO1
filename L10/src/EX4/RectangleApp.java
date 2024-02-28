package EX4;

public class RectangleApp
{
    public static void main(String[] args)
    {

        Rectangle a = new Rectangle();
        System.out.println(a);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println();

        Rectangle b = new Rectangle(5,10);
        System.out.println(b);
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());

    }


}

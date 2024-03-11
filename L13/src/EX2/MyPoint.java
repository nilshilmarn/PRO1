package EX2;

public class MyPoint
{

    private double x;
    private double y;


    public MyPoint()
    {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }


    public static double distance(MyPoint pointOne, MyPoint pointTwo)
    {
        return Math.sqrt(Math.pow(pointTwo.getX() - pointOne.getX(), 2) + Math.pow(pointTwo.getY() - pointOne.getY(), 2));
    }


    @Override
    public String toString()
    {
        return String.format("MyPoint(x: %f, y: %f", x, y);
    }
}

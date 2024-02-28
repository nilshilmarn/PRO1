package EX4;

import javax.sound.sampled.Line;

public class Rectangle
{

    private double width = 1.0;
    private double height = 1.0;


    public Rectangle()
    {

    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public String toString()
    {
        return String.format("Rectangle(%s, %s)", width, height);
    }
}

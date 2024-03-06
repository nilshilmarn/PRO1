package EX6;

public class MyRectangle2D
{

    // Two double datafields named x and y that specify the center of the rectangle
    // with getter and setter methods. (Assume the rectangle sides are parallel to x- or y-axis.)

    private double x;
    private double y;

    // The data fields width and height with getter and setter methods

    private int height;
    private int width;

    // Ano-arg constructor that creates a default rectangle with (0,0) for (x,y) and
    // 1 for both width and height.

    public MyRectangle2D()
    {
        this(0, 0, 1, 1);
    }

    // A constructor that creates a rectangle with the specified x, y, width, and
    // height.

    public MyRectangle2D(double x, double y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // A method getArea() that returns the area of the rectangle.

    public double getArea()
    {
        return this.height * this.width;
    }

    // A method getPerimeter() that returns the perimeter of the rectangle.

    public double getPerimeter()
    {
        return 2.0 * (this.width + this.height);
    }

    // A method contains(double x, double y) that returns true if the
    // specified point (x, y) is inside this rectangle (see Figure 10.24a).

    public boolean contains(double x, double y)
    {
        if (x < this.getMaxX() && x > this.getMinX())
        {
            if (y < this.getMaxY() && y > this.getMinY())
            {
                return true;
            }
        }
        return false;
    }

    // A method contains(MyRectangle2D r) that returns true if the specified
    // rectangle is inside this rectangle (see Figure 10.24b).

    public boolean contains(MyRectangle2D r)
    {
        if (this.getMinX() <= r.getMinX() &&
                this.getMaxX() >= r.getMaxX() &&
                this.getMinY() <= r.getMinY() &&
                this.getMaxY() >= r.getMaxY())
        {
            return true;
        }
        return false;
    }

    // A method overlaps (MyRectangle2D r) that returns true if the specified
    // rectangle overlaps with this rectangle

    public boolean overlaps(MyRectangle2D r)
    {
        if (this.contains(r))
        {
            System.out.println("it's inside the rectangle");
            return false;
        } else if (r.getMinX() < this.getMaxX() &&
                r.getMaxX() > this.getMinX() &&
                r.getMinY() < this.getMaxY() &&
                r.getMaxY() > this.getMinY())
        {
            return true;
        }

        return false;
    }

    public double getMaxX()
    {
        return this.x + this.width / 2;
    }

    public double getMinX()
    {
        return this.x - this.width / 2;
    }

    public double getMaxY()
    {
        return this.y + this.height / 2;
    }

    public double getMinY()
    {
        return this.y - this.height / 2;
    }


    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
}

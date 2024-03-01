package EX1;

public class Fan
{

    // Three constants named SLOW, MEDIUM, and FAST with the values
    // 1, 2, and 3 to denote the fan speed.
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    // A private int data field named speed that specifies the speed
    // of the fan (the default is SLOW).
    private int speed;

    // A private boolean datafield named on that specifies whether the fanison (the default is false).
    private boolean on;

    // A private double data field named radius that specifies the radius of the fan (the default is 5).
    private double radius;

    // A string data field named color that specifies the color of the fan (the default is blue).
    private String color;


    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }


    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    @Override
    public String toString()
    {
        if (on == true)
        {
           return String.format("Fan(Speed: %d, Color: %s, Radius: %.2f)", speed, color, radius);
        }
        else
        {
            return String.format("Fan(Color: %s, Radius: %.2f, fan is off)", color, radius);
        }
    }
}

package EX1;

public class FanApp
{

    public static void main(String[] args)
    {

        Fan fan = new Fan();

        System.out.println(fan);

        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        System.out.println(fan);

        fan.setRadius(5);
        fan.setColor("blue");
        fan.setOn(false);

        System.out.println(fan);





    }
}

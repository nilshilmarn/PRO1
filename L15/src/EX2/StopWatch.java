package EX2;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch
{

    private LocalTime startTime;
    private LocalTime endTime;


    public StopWatch()
    {

    }


    public void start()
    {
        this.startTime = LocalTime.now();
        System.out.println("Start");
    }

    public void stop()
    {
        this.endTime = LocalTime.now();
        System.out.println("Stop");
    }

    public long elapsedTime()
    {
        return Duration.between(this.startTime, this.endTime).getSeconds();

    }


}

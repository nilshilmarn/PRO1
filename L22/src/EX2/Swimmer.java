package EX2;

import java.util.ArrayList;

public class Swimmer
{
    private String name;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes)
    {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName()
    {
        return this.name;
    }

    public ArrayList<Double> getLapTimes()
    {
        return lapTimes;
    }

    /**
     * Return the fastest lap time.
     */
    public double bestLapTime()
    {
        double bestLapTime = lapTimes.get(0);

        for (int i = 1; i < lapTimes.size() - 1; i++)
        {
            if (lapTimes.get(i) < bestLapTime)
            {
                bestLapTime = lapTimes.get(i);
            }
        }

        return bestLapTime;
    }
}

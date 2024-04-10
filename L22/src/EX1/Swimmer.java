package EX1;

import java.util.ArrayList;

public class Swimmer
{
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;


    public Swimmer(String name, ArrayList<Double> lapTimes, TrainingPlan trainingPlan)
    {
        this.name = name;
        this.lapTimes = lapTimes;
        this.trainingPlan = trainingPlan;
    }

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

        for (int i = 1; i < lapTimes.size(); i++)
        {
            if (lapTimes.get(i) < bestLapTime)
            {
                bestLapTime = lapTimes.get(i);
            }
        }

        return bestLapTime;
    }

    public TrainingPlan getTrainingPlan()
    {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan)
    {
        this.trainingPlan = trainingPlan;
    }

    public int allTrainingHours()
    {
        return trainingPlan.getWeeklyWaterHours() + trainingPlan.getWeeklyStrengthHours();
    }

}

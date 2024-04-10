package EX2;

import java.util.ArrayList;

public class TrainingPlan
{
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    private final ArrayList<Swimmer> swimmers;

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours)
    {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
        this.swimmers = new ArrayList<>();
    }

    public char getLevel()
    {
        return level;
    }

    public int getWeeklyStrengthHours()
    {
        return weeklyStrengthHours;
    }

    public int getWeeklyWaterHours()
    {
        return weeklyWaterHours;
    }

    public void addSwimmer(Swimmer swimmer)
    {
        swimmers.add(swimmer);
    }

    public void removeSwimmer(Swimmer swimmer)
    {
        swimmers.remove(swimmer);
    }

    public ArrayList<Swimmer> getSwimmers()
    {
        return new ArrayList<>(swimmers);
    }

}

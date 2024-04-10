package EX4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Episode
{
    private final int number;
    private final ArrayList<String> guestActors;
    private final int lengthMinutes;

    public Episode(int number, ArrayList<String> guestActors, int lengthMinutes)
    {
        this.number = number;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
    }

    public Episode(int number, int lengthMinutes)
    {
        this.number = number;
        this.lengthMinutes = lengthMinutes;
        this.guestActors = new ArrayList<>();
    }

    public int getNumber()
    {
        return number;
    }

    public ArrayList<String> getGuestActors()
    {
        return guestActors;
    }

    public int getLengthMinutes()
    {
        return lengthMinutes;
    }
}



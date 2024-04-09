package EX4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Episode
{
    private int number;
    private final ArrayList<String> guestActors;
    private int lengthMinutes;

    public Episode(int number, ArrayList<String> guestActors, int lengthMinutes)
    {
        this.number = number;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
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



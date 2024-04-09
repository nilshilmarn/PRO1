package EX4;

import java.util.ArrayList;

public class Series
{

    private String title;
    private ArrayList<String> cast;
    private final ArrayList<Episode> episodes;

    public Series(String title, ArrayList<String> cast)
    {
        this.title = title;
        this.cast = cast;
        this.episodes = new ArrayList<>();
    }

    public void addEpisode(int number, ArrayList<String> guestActors, int lengthMinutes)
    {
        episodes.add(new Episode(number, guestActors, lengthMinutes));
    }


    /**
     * Return the total length (in minutes) of all the
     * episodes in the series.
     */
    public int totalLength()
    {
        int totalLength = 0;

        for (Episode epi : episodes)
        {
            totalLength += epi.getLengthMinutes();
        }
        return totalLength;
    }

    /**
     * Return the total list of all guest actors from all episodes.
     */
    public ArrayList<String> getGuestActors()
    {
        ArrayList<String> allGuestActors = new ArrayList<>();

        for (Episode epi : episodes)
        {
            allGuestActors.addAll(epi.getGuestActors());
        }

        return allGuestActors;
    }


    public String getTitle()
    {
        return title;
    }

    public ArrayList<String> getCast()
    {
        return cast;
    }
}

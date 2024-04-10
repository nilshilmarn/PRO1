package EX4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {

        ArrayList<String> cast = new ArrayList<>();
        cast.addAll(List.of("Jennifor Aniston", "Lisa Kudrow", "David Schwimmer", "Matthrew Perry", "Courteney Cox", "Matt Leblanc"));

        ArrayList<String> guestActors = new ArrayList<>();
        guestActors.addAll(List.of("Julia Roberts", "Ben Stiller", "Susan Sarandon"));

        Series Friends = new Series("Friends", cast);

        Friends.addEpisode(new Episode(1, 45));
        Friends.addEpisode(new Episode(1, 45));

        System.out.println(Friends.totalLength());


        Series FriendsSeason2 = new Series("Friends Season 2", cast);

        FriendsSeason2.addEpisode(new Episode(1, guestActors, 45));

        System.out.println(FriendsSeason2.totalLength());
        System.out.println(FriendsSeason2.getGuestActors());


    }
}

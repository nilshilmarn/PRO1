package EX5;

import java.util.ArrayList;

public class B1118
{
    public static void main(String[] args)
    {


        System.out.println(toCharacterArray("abc"));
    }


    public static ArrayList<Character> toCharacterArray(String s)
    {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++)
        {
            list.add(s.charAt(i));
        }

        return list;
    }

}

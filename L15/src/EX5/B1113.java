package EX5;

import java.util.ArrayList;

public class B1113
{

    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);


        System.out.println(list);

        removeDuplicate(list);
        System.out.println(list);

    }


    public static void removeDuplicate(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 1; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    list.remove(j);
                }
            }
        }
    }


}



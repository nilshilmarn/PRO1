package EX1;

import java.util.ArrayList;

public class E01
{

    public static void main(String[] args)
    {

        // 1. Create an ArrayList that can contains objects of type String.
        ArrayList<String> names = new ArrayList<>();

        // 2. Add strings to the list (in the given order):
        // • ”Hans”
        // • ”Viggo”
        // • ”Jens”
        // • ”Bente”
        // • ”Bent”
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");

        // 3. Print the size of the list.
        int sizeName = names.size();
        System.out.println(sizeName);

        // 4. Add ”Jane” at index 2 in the list.
        names.add(2, "Jane");

        // 5. Print the elements in the list
        System.out.println(names);

        // 6. Remove the element at index 1.
        names.remove(1);

        // 7. Add ”Pia” at the front of the list.
        names.add(0, "Pia");
        System.out.println(names);

        //8. Add ”Ib” at the rear of the list.
        names.add("Ib");

        // 9. Print the size of the list.
        sizeName = names.size();
        System.out.println(sizeName);

        // 10. Replace the element at index 2 with ”Hansi”.
        names.set(2, "Hansi");

        // 11. Print the size of the list.
        sizeName = names.size();
        System.out.println(sizeName);

        // 12. Print the elements in the list.
        System.out.println(names);

        // 13. Traverse the list with a for statement and print the length of each element in the list
        for (int i = 0; i < names.size(); i++)
        {
            int length = names.get(i).length();
            System.out.println(length);
        }

        System.out.println();

        // 14. Traverse the list with a for-each statement and print the length of each element in the
        // list.
        for (String name : names)
        {
            int length = name.length();
            System.out.println(length);
        }
    }
}

package EX2;

import java.util.Arrays;

public class E01
{


    public static void main(String[] args)
    {

        int[] permutationArray = new int[10];

        System.out.println(Arrays.toString(permutationArray));
        System.out.println();



        int[] secondArray = {1,2,3,4,5,6,7,8,9,10};



        System.out.println(Arrays.toString(secondArray));
        System.out.println();


        int removedElement = 0;
        int countOfRemainingElements = 10;
        int countOfInsertedElements = 0;

        for (int i = 0; i < 10; i++)
        {

            // Pick a random position in the second array.
            int randomPosition = (int) (Math.random() * countOfRemainingElements); // 0-countoframiningNumbers

            System.out.println("Random position: " + randomPosition);

            // Remove the element at the position from the second array
            removedElement = secondArray[randomPosition];

            // Append the removed element to the permutation array
            permutationArray[i] = removedElement;


            for (int j = randomPosition; j < secondArray.length - 1; j++)
            {
                // Move the elements above the index one down, put a zero at the end
                secondArray[j] = secondArray[j+1];
            }

            secondArray[secondArray.length - 1] = 0;

            System.out.println("Permutation Array: " + Arrays.toString(secondArray));
            System.out.println();

            countOfRemainingElements--;
        }

        System.out.println("Permutation Array: " + Arrays.toString(permutationArray));
        System.out.println();

        System.out.println("Second Array: " + Arrays.toString(secondArray));


    }



}

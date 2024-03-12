package Model;

import java.util.Random;

public class MultipleChoiseTest
{

    public static char[] correctAnswers = {'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'A', 'B'};


    public static char[] getRandomAnswers()
    {
        Random rnd = new Random();

        char[] randomAnswers = new char[10];

        char[] options = {'A', 'B', 'C', 'D'};

        for (int i = 0; i < randomAnswers.length; i++)
        {
            int randomIndex = rnd.nextInt(options.length);
            randomAnswers[i] = options[randomIndex];
        }

        return randomAnswers;
    }
}

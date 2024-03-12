package Model;

import java.util.Arrays;

public class Student
{

    private String name;
    private boolean active;
    private int[] grades;
    private char[] answers;


    public Student(String name, boolean active)
    {
        this.name = name;
        this.active = active;
        this.answers = MultipleChoiseTest.getRandomAnswers();
    }


    public boolean isActive()
    {
        return active;
    }

    public String getName()
    {
        return name;
    }

    public char[] getAnswers()
    {
        return answers;
    }

    public void setGrades(int[] grades)
    {
        this.grades = grades;
    }

    // Udvid klassen Student med en metode, der returnerer den højeste karakter, den studerende
    // har opnået. (Det forudsættes, at alle studerende har mindst én karakter.)
    public int getHighestGrade()
    {
        if (grades == null)
        {
            System.out.println("No grade have been set for this student");
            return 0;
        }

        int highestgrade = -3;

        for (int grade : grades)
        {
            if (grade > highestgrade)
            {
                highestgrade = grade;
            }
        }
        return highestgrade;
    }

    // Udvid klassen Student med en metode, der kan returnere gennemsnittet af de karakterer, den
    // studerende har fået. (Det forudsættes, at alle studerende har mindst én karakter.)
    public double getAverageGrade()
    {
        if (grades == null)
        {
            System.out.println("No grade have been set for this student");
            return 0;
        }
        double totalGrades = 0;

        for (int grade : grades)
        {
            totalGrades += grade;
        }
        return totalGrades / grades.length; // average grade
    }

    // Udvid klassen Student med en metode, der returnerer, hvor mange korrekte svar den
    // studerende har på multiple choice testen.

    public int correctAnswersCount()
    {
        int correctAnswers = 0;

        for (int i = 0; i < answers.length; i++)
        {
            if (answers[i] == MultipleChoiseTest.correctAnswers[i])
            {
                correctAnswers++;
            }
        }
        return correctAnswers;
    }


    @Override
    public String toString()
    {
        return "\nName: " + name
                + " - Active: " + active
                + " - Grades: " + Arrays.toString(grades)
                + " - Answers: " + Arrays.toString(answers);
    }
}

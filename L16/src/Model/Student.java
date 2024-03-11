package Model;

import java.util.Arrays;

public class Student
{

    private String name;
    private boolean active;
    private int[] grades;


    public Student(String name, boolean active)
    {
        this.name = name;
        this.active = active;
    }


    public boolean isActive()
    {
        return active;
    }

    public String getName()
    {
        return name;
    }

    public void setGrades(int[] grades)
    {
        this.grades = grades;
    }

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

    @Override
    public String toString()
    {
        return "\nName: " + name + " - Active: " + active + " - Grades: " + Arrays.toString(grades);
    }
}

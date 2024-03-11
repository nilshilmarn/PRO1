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

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}

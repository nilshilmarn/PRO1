package Model;

import java.util.ArrayList;

public class Team
{
    private String name;
    private String room;

    private ArrayList<Student> students;


    public Team(String name, String room)
    {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }


    public void addStudent(Student student)
    {
        students.add(student);
    }


    private int getNumberOfActiveStudents()
    {
        int numberOfActiveStudents = 0;

        for (int i = 0; i < students.size(); i++)
        {
            if (this.students.get(i).isActive())
            {
                numberOfActiveStudents++;
            }
        }
        return numberOfActiveStudents;
    }

    public Student[] getActiveStudents()
    {
        Student[] activeStudents = new Student[getNumberOfActiveStudents()];

        int j = 0;

        for (int i = 0; i <= activeStudents.length; i++)
        {
            if (this.students.get(i).isActive())
            {
                activeStudents[j] = this.students.get(i);
                j++;
            }
        }
        return activeStudents;
    }

    public void removeStudent(String name)
    {
        int i = 0;

        while (i < students.size())
        {
            if (students.get(i).getName().equals(name))
            {
                students.remove(i);
                i--;
            }
            i++;
        }
    }


    @Override
    public String toString()
    {
        return "Team Info:" +
                "\nName: " + name + " " +
                "Room: " + room + " \n" +
                "Students: " + students + "\n";
    }
}




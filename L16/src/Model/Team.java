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

    public ArrayList<Student> getActiveStudents()
    {
        ArrayList<Student> activeStudents = new ArrayList<>();

        for (Student student : this.students)
        {
            if (student.isActive())
            {
                activeStudents.add(student);
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
            }
            i++;
        }
    }


    @Override
    public String toString()
    {
        return "Team{" +
                "name='" + name + '\'' +
                ", room='" + room + '\'' +
                ", students=" + students +
                '}';
    }
}




package Test;

import Model.Student;
import Model.Team;

import java.util.Arrays;

public class App
{

    public static void main(String[] args)
    {
        Student s1 = new Student("Nils", true);
        Student s2 = new Student("Micheal", false);
        Student s3 = new Student("Mikkel", true);
        Student s4 = new Student("Mia", true);
        Student s5 = new Student("Mads", true);
        Student s6 = new Student("Magnus", false);

        Team team1 = new Team("Team 1", "Room 1");
        team1.addStudent(s1);
        team1.addStudent(s2);
        team1.addStudent(s3);
        team1.addStudent(s4);

        Team team2 = new Team("Team 2", "Room 2");
        team2.addStudent(s1);
        team2.addStudent(s2);
        team2.addStudent(s3);
        team2.addStudent(s4);
        team2.addStudent(s5);
        team2.addStudent(s6);

        System.out.println("The Teams:");
        System.out.println(team1);
        System.out.println(team2);
        System.out.println();


        System.out.println("The active students on team 1 and team 2:");
        System.out.println(Arrays.toString(team1.getActiveStudents()));
        System.out.println(Arrays.toString(team2.getActiveStudents()));
        System.out.println();


        team1.removeStudent("Nils");
        team1.removeStudent("Micheal");

        team2.removeStudent("Nils");
        team2.removeStudent("Micheal");

        System.out.println("The teams after Nils and Micheal have been removed");
        System.out.println(team1);
        System.out.println(team2);


    }
}

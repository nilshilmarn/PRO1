package Test;

import Model.Student;
import Model.Team;

import java.util.Arrays;

public class App
{

    public static void main(String[] args)
    {
        Student s0 = new Student("Nils", false);
        Student s1 = new Student("Nils", true);
        Student s2 = new Student("Micheal", false);
        Student s3 = new Student("Mikkel", true);
        Student s4 = new Student("Mia", true);
        Student s5 = new Student("Mads", true);
        Student s6 = new Student("Magnus", false);
        Student s7 = new Student("Nils", false);

        Team team1 = new Team("Team 1", "Room 1");
        team1.addStudent(s0);
        team1.addStudent(s1);
        team1.addStudent(s2);
        team1.addStudent(s3);
        team1.addStudent(s4);
        team1.addStudent(s5);
        team1.addStudent(s6);
        team1.addStudent(s7);

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

        System.out.println("The teams after all students names Nils and Micheal have been removed");
        System.out.println(team1);
        System.out.println(team2);

        int[] grades = {4, 2, 12, 10, 7, -3};
        s1.setGrades(grades);

        System.out.println(s1);
        System.out.println();

        System.out.println("Higest grade: " + s1.getHighestGrade());
        System.out.println("Average grade for Student s1: " + s1.getAverageGrade());
        System.out.println();

        int[] grades3 = {4, 2, 2, 10, 7, -3};
        s3.setGrades(grades3);

        int[] grades4 = {12, 2, 2, 10, 4, -3};
        s4.setGrades(grades4);

        System.out.println(team1);
        System.out.printf("Average grade for Mikkel: %.2f\n", s3.getAverageGrade());
        System.out.printf("Average grade for Mia: %.2f\n", s4.getAverageGrade());
        System.out.printf("Average grade for Team 1: %.2f\n", team1.getAverageGrades());
        System.out.println();

        System.out.println("Active students with grade above 3: " + Arrays.toString(team1.highScoreStudents(3.0)));
        System.out.println();
        System.out.println("Active students with grade above 4: " + Arrays.toString(team1.highScoreStudents(4.0)));

        System.out.println(s1);
        System.out.println("Number of corrent answers for Nils: " + s1.correctAnswersCount());
        System.out.println();

        System.out.println(team1);
        System.out.println(Arrays.toString(team1.correctAnswersCount()));
        System.out.println(Arrays.toString(team1.getStudentsInfo()));
        System.out.println(team1);
        System.out.println("Number of students in team 1 that have correct anwers: " + Arrays.toString((team1.getStudentsCorrectAnswersCount())));


    }
}

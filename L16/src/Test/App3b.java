package Test;

import Model.Student;
import Model.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App3b
{

    public static void main(String[] args)
    {

        boolean isOn = true;
        Scanner input = new Scanner(System.in);

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        int teamCount = 0;
        int studentCount = 0;

        while (isOn)
        {

            System.out.println("MENU");
            System.out.println("1: Create a team");
            System.out.println("2: Create a student");
            System.out.println("3: Show one student's info and results");

            int option = input.nextInt();

            if (option == 1)
            {
                System.out.println("Team name and room: ");
                String teamName = input.next();
                String room = input.next();

                teams.add(new Team(teamName, room));

                teamCount++;

            } else if (option == 2)
            {

                System.out.println("Student's name and activity status (true/false): ");
                String name = input.next();
                boolean status = input.nextBoolean();

                System.out.println("Student's number of grades: ");
                int gradesCount = input.nextInt();

                System.out.println("Student's " + gradesCount + " grades: ");
                int[] grades = new int[gradesCount];
                for (int i = 0; i < gradesCount; i++)
                {
                    grades[i] = input.nextInt();
                }

                students.add(new Student(name, status));

                students.get(studentCount).setGrades(grades);

                if (teamCount > 0)
                {
                    System.out.println("Name of students team: ");
                    String teamName = input.next();

                    for (int i = 0; i < teams.size(); i++)
                    {
                        if (teamName.equals(teams.get(i).getName()))
                        {
                            teams.get(i).addStudent(students.get(studentCount));

                            System.out.print(students.get(studentCount));
                            System.out.println(" Created in team: " + teamName);


                        } else
                        {
                            System.out.println("That team doesn't excist");
                        }
                    }
                } else
                {
                    System.out.print(students.get(studentCount));
                }

                studentCount++;

            } else if (option == 3)
            {
                System.out.println("Name of the student: ");
                String name = input.next();

                if (studentCount > 0)
                {
                    for (int i = 0; i < students.size(); i++)
                    {
                        if (name.equals(students.get(i).getName()))
                        {
                            System.out.println(students.get(i));
                        } else
                        {
                            System.out.println("That student doesn't excist.");
                        }
                    }
                } else
                {
                    System.out.println("No students have been created.");
                }


            } else if (option == 4)
            {
                if (teamCount > 0)
                {
                    System.out.println("Team's name: ");
                    String teamName = input.next();

                    for (int i = 0; i < teams.size(); i++)
                    {
                        if (teamName.equals(teams.get(i).getName()))
                        {

                            System.out.println(teams.get(i));

                        } else
                        {
                            System.out.println("That team doesn't excist");
                        }
                    }
                } else
                {
                    System.out.println("No teams have been created");
                }
            }

        }


    }


}

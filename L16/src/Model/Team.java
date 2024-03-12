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


    // Tilføj også til Team en metode, der adderer en studerende til teamet.
    public void addStudent(Student student)
    {
        students.add(student);
    }


    // Helper method for getActiveStudents
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

    // Udvid klassen Team med en metode, der returnerer et array med alle de aktive studerende,
    // der er tilknyttet teamet (arrayet må ikke indeholde null)
    public Student[] getActiveStudents()
    {
        Student[] activeStudents = new Student[getNumberOfActiveStudents()];

        int j = 0;

        for (int i = 0; i < students.size(); i++)
        {
            if (this.students.get(i).isActive())
            {
                activeStudents[j] = this.students.get(i);
                j++;
            }
        }
        return activeStudents;
    }

    // Udvid klassen Team med en metode, der kan fjerne en studerende med et bestemt navn fra
    // teamet. Det er et krav, at metoden opretholder rækkefølgen af de studerende i teamet.
    // Metoden skal have nedenstående metodesignatur og anvende en while-sætning:
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

    // Udvid klassen Team med en metode, der kan returnere gennemsnittet af alle de karakterer,
    // der er givet for de studerende på teamet. (Det forudsættes, at alle teams har mindst én
    // studerende.)
    public double getAverageGrades()
    {
        double sumOfAverageGradesStudents = 0;

        for (Student student : students)
        {
            sumOfAverageGradesStudents += student.getAverageGrade();
        }
        return sumOfAverageGradesStudents / students.size(); // average grade for team
    }


    // Helper method for highScoreStudents
    private int getNumberOfActiveStudents(double minAverage)
    {
        int numberOfMinAverageStudents = 0;

        Student[] activestudents = getActiveStudents();

        for (int i = 0; i < activestudents.length; i++)
        {
            if (activestudents[i].getAverageGrade() >= minAverage)
            {
                numberOfMinAverageStudents++;
            }
        }
        return numberOfMinAverageStudents;
    }

    // Udvid klassen Team med en metode, der returnerer et array med de aktive studerende, som
    // har opnået mindst et gennemsnit givet ved parameteren minAverage. Metoden skal have
    // nedenstående header:
    public Student[] highScoreStudents(double minAverage)
    {
        Student[] highScoreStudents = new Student[getNumberOfActiveStudents(minAverage)];
        Student[] activestudents = getActiveStudents();
        int j = 0;

        for (int i = 0; i < activestudents.length; i++)
        {
            if (activestudents[i].getAverageGrade() >= minAverage)
            {
                highScoreStudents[j] = activestudents[i];
                j++;
            }
        }
        return highScoreStudents;
    }

    // Udvid også klassen Team med en metode, der returnerer et array med de studerendes antal
    // korrekte svar.

    public int[] correctAnswersCount()
    {
        int[] correctAnswersCount = new int[students.size()];

        for (int i = 0; i < students.size(); i++)
        {
            correctAnswersCount[i] = students.get(i).correctAnswersCount();
        }
        return correctAnswersCount;
    }

    // Udvid Team klassen med en metode, der returnerer et String array med en tekst for hver
    // studerende. Teksten skal indeholde navnet på den studerende, gennemsnittet af karakterer og
    // antal rigtige svar på multiple choice testen, opstillet i kolonner.

    public String[] getStudentsInfo()
    {
        String[] info = new String[students.size()];

        for (int i = 0; i < info.length; i++)
        {
            Student student = students.get(i); // Student
            String name = student.getName(); // Name of student
            String averageGrade = student.getAverageGrade() + ""; // Average grade
            String correctAnswersCount = student.correctAnswersCount() + "";

            info[i] = "\nName: " + name + "\nAverage grade: " + averageGrade + "\nCorrect Answers: " + correctAnswersCount + "\n";
        }
        return info;
    }

    // Det er interessant at se hvilke spørgsmål i multiple choice testen, de studerende har haft
    // let/svært ved. Udvid klassen Team med en metode, der for hvert spørgsmål i testen
    // returnerer, hvor mange af de studerende i klassen, der har svaret korrekt på spørgsmålet.

    public int[] getStudentsCorrectAnswersCount()
    {
        char[] correntAnswers = MultipleChoiseTest.correctAnswers;
        int[] correctAnswersCount = new int[10];

        for (int i = 0; i < students.size(); i++)
        {
            for (int j = 0; j < correntAnswers.length; j++)
            {
                if (students.get(i).getAnswers()[j] == correntAnswers[j])
                {
                    correctAnswersCount[j]++;
                }
            }
        }
        return correctAnswersCount;
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




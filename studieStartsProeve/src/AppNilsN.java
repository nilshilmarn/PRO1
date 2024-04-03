import java.util.Scanner;

public class AppNilsN
{

    public static void main(String[] args)
    {
        // Opret Scanner
        Scanner input = new Scanner(System.in);

        // Navn
        System.out.println("Indtast personens navn:");
        String navn = input.nextLine();

        // Vægt
        System.out.println("Indtast personens vægt i kg:");
        int weight = input.nextInt();

        // Højde
        System.out.println("Indtast personens højde i m:");
        double height = input.nextDouble();

        // BMI -> BMI = (vægt [kg]) / (højde [m^2])
        double BMI = (double) weight / Math.pow(height, 2);

        // Print BMI og vægtklasse ud
        System.out.printf("Beregnet BMI: %.2f\n", BMI);
        System.out.printf("%s, BMI siger: %s", navn, vægtKlasse(BMI));

    }

    // Helper method to calculate weightClass
    private static String vægtKlasse(double BMI)
    {
        String weightClass = "";

        if (BMI < 18.5)
        {
            weightClass = "undervægt";
        } else if (BMI < 25)
        {
            weightClass = "normal vægt";
        } else if (BMI < 30)
        {
            weightClass = "overvægt";
        } else
        {
            weightClass = "fedme";
        }
        return weightClass;
    }
}

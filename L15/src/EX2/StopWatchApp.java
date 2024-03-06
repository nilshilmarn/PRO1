package EX2;


import java.util.Scanner;

public class StopWatchApp
{

    public static void main(String[] args)
    {

        StopWatch stopWatch = new StopWatch();

        Scanner input = new Scanner(System.in);


        System.out.println("Start the stopwatch");
        if (input.nextLine().equals(""))
        {
            stopWatch.start();
        }
        System.out.println("Stop the stopwatch");
        if (input.nextLine().equals(""))
        {
            stopWatch.stop();
        }

        System.out.println(stopWatch.elapsedTime());

    }

}

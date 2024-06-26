package EX2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwimmerApp
{

    public static void main(String[] args)
    {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

//        ArrayList<Swimmer> swimmers = new ArrayList<>();
//        swimmers.add(jan);
//        swimmers.add(bo);
//        swimmers.add(mikkel);
//
//        for (Swimmer s : swimmers)
//        {
//            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
//        }

        TrainingPlan A = new TrainingPlan('A', 16, 10);
        TrainingPlan B = new TrainingPlan('B', 10, 6);

        A.addSwimmer(jan);
        A.addSwimmer(bo);

        B.addSwimmer(mikkel);

        ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();
        trainingPlans.add(A);
        trainingPlans.add(B);

        for (TrainingPlan trainingPlan : trainingPlans)
        {
            System.out.println(trainingPlan.getLevel());

            for (Swimmer s : trainingPlan.getSwimmers())
            {
                System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
            }
        }

    }
}

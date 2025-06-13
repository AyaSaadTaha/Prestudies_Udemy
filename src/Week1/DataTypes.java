package Week1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //1. Data types

            // 1. Your initials
            char Initials='A';
            System.out.println("Initials: " + Initials);

            // 2. Population in Germany
            int GermanyPopulation = 83200000;
            System.out.println("Population in Germany: " + GermanyPopulation);

            // 3. Population on earth
            long EarthPopulation = 8100000000L;
            System.out.println("Population in Germany: " + EarthPopulation);

            // 4. Is currently daytime?
            boolean isDaytime = true;
            System.out.println("Is it currently daytime? " + isDaytime);

            // 5. Goal strike quote (goals per game) of Mario Gomez at Bayern München
            int Goals=113;
            int NumOfGoals=174;
            float goalspergame = (float) Goals / NumOfGoals ;
            System.out.println("Mario Gomez's goal strike quote: " + goalspergame);

            // 6. Length of the java program in weeks
            int Weeks = 16;
            System.out.println("Length of the Java program in weeks: " + Weeks);

            // 7. The mathematical number PI
            double pi = 3.141592653589793;
            System.out.println("The mathematical number PI: " + pi);


    }
}

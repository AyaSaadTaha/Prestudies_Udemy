package Week1;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // <editor-fold desc="Time units">
            //1. Time units
        System.out.print("____________Time units____________ \n");
        System.out.print("Enter number of seconds : \n");
            // Read user seconds
            long totalSeconds = scanner.nextLong();
            long Sec_InMinute = 60;
            long Sec_InHour = 60 * Sec_InMinute;  // 3600
            long Sec_InDay = 24 * Sec_InHour;     // 86400
            long Sec_InYear = 365 * Sec_InDay;    // 31536000

            long years = totalSeconds / Sec_InYear;
            long remainder = totalSeconds % Sec_InYear;

            long days = remainder / Sec_InDay;
            remainder = remainder % Sec_InDay;

            long hours = remainder / Sec_InHour;
            remainder = remainder % Sec_InHour;

            long minutes = remainder / Sec_InMinute;
            long seconds = remainder % Sec_InMinute;

            System.out.println("Years: " + years);
            System.out.println("Days: " + days);
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);
            // </editor-fold>

            // <editor-fold desc="Cylinder">
            //2. Cylinder
            double PI = 3.14;
        System.out.print("____________Cylinder____________ \n");

        // Enter the circumference and height
            System.out.print("Enter the c: ");
            double c = scanner.nextDouble();
            System.out.print("Enter the h: ");
            double h = scanner.nextDouble();
            //calculate
            double d = c / PI;
            double al = PI * Math.pow(d / 2, 2);
            double ac = c * h;
            double at = 2 * al + ac;
            double volume = al * h;
            // result
            System.out.println("Diameter (d): " + d);
            System.out.println("Lid Area (al): " + al);
            System.out.println("Casing Area (ac): " + ac);
            System.out.println("Total Sheet Area (at): " + at);
            System.out.println("Volume of the can: " + volume);
            // </editor-fold>

            // <editor-fold desc="One line of code">
            //3. One line of code
        System.out.print("____________One line of code____________ \n");
        System.out.println(((Math.sqrt(3.5 + 15.5)* 5 )/ 3 )- (290.7));
            // </editor-fold>

            // <editor-fold desc="Metropolis">
            //4. Metropolis (Bonus exercise)
        System.out.print("____________Metropolis____________ \n");

        System.out.println("Name of the city:");
            scanner.nextLine();
            String CityName = scanner.nextLine();

            System.out.println("Is "+ CityName +" a capital ('true' or 'false')?  ");
            boolean Capital= scanner.nextBoolean();

            System.out.println("What is the population of "+ CityName +" ?");
            int Population= scanner.nextInt();

            System.out.println("Tax income per inhabitant: ");
            double Tax_income_per_inhabitant= scanner.nextDouble();
            double totalTaxIncome = Population * Tax_income_per_inhabitant;

            if ( (Capital && Population > 100_000 ) || ( Population > 200_000  && totalTaxIncome >= 1_000_000_000) ){
                System.out.println(CityName +" is a metropolis, because it is a capital with a population of " + Population);
            }
            else{
                System.out.println(CityName +" is no metropolis");
            }

            // </editor-fold>
    }
}

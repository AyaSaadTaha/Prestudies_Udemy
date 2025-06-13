package Week3.Computers;

import java.util.ArrayList;

public class ComputerShop {
    ArrayList<Computer> computers = new ArrayList<Computer>();

    public ComputerShop(ArrayList<Computer> computers){
        this.computers = computers;
    }


    public double calculateProfit() {
        double totalProfit = 0;
        for (Computer c : computers) {
            totalProfit += c.calculateProfit();
        }
        return totalProfit;
    }
}

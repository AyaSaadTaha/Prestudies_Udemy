package Week3.Computers;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        // Using full constructor
        Computer com1 = new Computer("Dell", 3200, 16, 1000, 4, 15.6, "Laptop", true);

        // Using minimum constructor
        Computer com2 = new Computer("HP", 14.0, false);

        // Using default constructor
        Computer com3 = new Computer();

        // Print computer details
        System.out.println(com1.toString());
        System.out.println(com2.toString());
        System.out.println(com3.toString());



        // ////////////////////////Part 2 and 3
        System.out.println("Part 2 and 3");
        // Create 5 computers
        Computer c1 = new Computer("Dell", 3000, 8, 512, 3, 15.6, "Laptop", true);
        c1.setPurchasePrice(500);
        c1.setSellingPrice(700);

        Computer c2 = new Computer("HP", 2500, 16, 1024, 4, 17.0, "Desktop", false);
        c2.setPurchasePrice(400);
        c2.setSellingPrice(650);

        Computer c3 = new Computer("Apple", 3200, 16, 512, 2, 13.3, "Laptop", true);
        c3.setPurchasePrice(1000);
        c3.setSellingPrice(1400);

        Computer c4 = new Computer("Lenovo", 2800, 8, 256, 3, 14.0, "Laptop", true);
        c4.setPurchasePrice(350);
        c4.setSellingPrice(600);

        Computer c5 = new Computer("Asus", 2700, 12, 512, 4, 15.0, "Desktop", false);
        c5.setPurchasePrice(450);
        c5.setSellingPrice(720);

        // Upgrade RAM for one computer
        System.out.println("Before RAM upgrade:"+c1.getRamSizeGB());
        c1.upgradeRam();

        // Print updated computer
        System.out.println("After RAM upgrade:"+c1.getRamSizeGB());

        // Add computers to shop
        ArrayList<Computer> inventory = new ArrayList<>();
        inventory.add(c1);
        inventory.add(c2);
        inventory.add(c3);
        inventory.add(c4);
        inventory.add(c5);

        // Create shop and calculate profit
        ComputerShop shop = new ComputerShop(inventory);
        double totalProfit = shop.calculateProfit();

        // Print total potential profit
        System.out.println("\nTotal potential profit for the shop: $" + totalProfit);

    }
}

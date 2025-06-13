package Week1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // <editor-fold desc="Guessing numbers">
            //1. Guessing numbers
        int targetNumber = (int) (Math.random() * 100) + 1;
        int guess = -1;
        System.out.println("Guess a number between 1 and 100");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! The number was " + targetNumber);
                }

            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        }


        // </editor-fold>

            // <editor-fold desc="Triangles">
            //2. Triangles
            System.out.println("How large should the triangles be?");
            int large = scanner.nextInt();
            System.out.println("How many triangles would you like?");
            int TrianglesNumber = scanner.nextInt();

            for (int x = 0; x < TrianglesNumber; x++) {
                for (int i = 1; i <= large; i++) {
                    // Inner loop
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                        if (j==i){
                            System.out.print("\n");
                        }
                    }
                }
                System.out.print("\n");
            }
            // </editor-fold>

            // <editor-fold desc="Christmas tree">
            //3. Christmas tree (Bonus exercise)
            System.out.println("how high the tree should be?");
            int height = scanner.nextInt();;
            int Count = 0;

            for (int i = 1; i <= height; i++) {
                // Draw the  space
                for (int k = i; k < height; k++) {
                    System.out.print(" ");
                }
                if (i  > 1) {
                    Count=Count+1;
                }
                // Draw the  star
                for (int j = 1; j <= i + Count; j++) {
                    System.out.print("*");
                    if (i == j - Count) {
                        System.out.print("\n");
                    }
                }

            }
            // Draw the  trunk
            for (int k = 1; k < height; k++) {
                System.out.print(" ");
            }
            System.out.println("|");
            // </editor-fold>

    }
}

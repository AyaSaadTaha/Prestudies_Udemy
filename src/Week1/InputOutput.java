package Week1;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // <editor-fold desc="Text input and output">
            //1. Text input and output
            // Create a Scanner object to read input
            String FullName;

            System.out.print("Please enter your name: \n");

            // Read user FullName
            FullName = scanner.nextLine();

            // Output user input
            System.out.println("Hello " + FullName +" , Welcome to the training!");

            // </editor-fold>

            // <editor-fold desc="Formatting text output">
            // 2. Formatting text output
            System.out.println("       _______");
            System.out.println("      // ||\\ \\ ");
            System.out.println("_____//__||_\\ \\____ ");
            System.out.println(")  _          _    \\ ");
            System.out.println("|_/ \\________/ \\___| ");
            System.out.println("__\\_/________\\_/______");
            // </editor-fold>
    }
}

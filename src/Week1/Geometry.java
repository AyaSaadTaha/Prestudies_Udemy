package Week1;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // 3. Week1.Geometry
            // <editor-fold desc="rectangle">
            //rectangle
        System.out.print("____________Rectangle____________ \n");
        System.out.print("Enter the length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the Width: ");
            double Width = scanner.nextDouble();
            //Area
            System.out.println("Area: "+ length * Width );
            //perimeter
            System.out.println("perimeter: "+ 2* (length + Width));
            // </editor-fold>

            // <editor-fold desc="triangle">
            //triangle
        System.out.print("____________Triangle____________ \n");
        System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            //Area
            System.out.println("Area: "+ 0.5 * base * height );
            // hypotenuse

            double hypotenuse = Math.sqrt(Math.pow(base,2)+ Math.pow(height,2));
            // perimeter
            System.out.println("perimeter: "+ (base +height + hypotenuse));

            // </editor-fold>

    }
}

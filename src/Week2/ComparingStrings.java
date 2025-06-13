package Week2;
/*
Compare two equal strings (e.g. the text Comparison ) both with the equals method and the
== operator.
1. Create both strings with a literal (e.g. String str1 = "Comparison"; ).
2. Create both strings with the constructor (e.g. String str = new
String("Comparison"); ).
Explain the result.
 */
public class ComparingStrings {
        public static void main(String[] args) {
            //   literal (Save in the same Place in Memory)
            String str1 = "Comparison";
            String str2 = "Comparison";

            //   new (Save in the different Place in Memory)
            String str3 = new String("Comparison");
            String str4 = new String("Comparison");

            // Literal comparison
            System.out.println("Literal ==: " + (str1 == str2));       // true
            System.out.println("Literal equals: " + str1.equals(str2)); // true

            // Constructor comparison
            System.out.println("New ==: " + (str3 == str4));           // false
            System.out.println("New equals: " + str3.equals(str4));     // true
        }
}



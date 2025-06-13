package Week2;
/*
For this exercise, it is necessary to refer to the documentation of the String class in Java:
Java String Documentation. Going back to the Variables Chapter in Udemy also might
help.
Create a String variable and assign the following text to it:
"Everybody said, it can’t be done. Then came one who did not know that and just
made it."
Perform the following text manipulations using String methods and print the results on the
console:
1. Retrieve the two uppercase letters from the text ( charAt ).
2. Compare the text with your name and interpret the result ( compareTo ).
3. Concatenate your first and last name ( concat or + ).
4. Check if the words "made" and "Java" are present ( contains ).
5. Compare two strings for equality ( equals ).
6. Output the index of the first occurrence of "d" ( indexOf ).
7. Check for an empty string ( isEmpty ).
8. Check a declared string for null .
9. Output the length of the text ( length ).
10. Extract the words "said" and "made" ( substring )

�� Questions to think about (discuss with your study buddy)
-If a method like substring or toUppercase is called on a string, does the string itself
change or not?
Nein, Methoden wie substring() oder toUpperCase() in Java sind unveränderlich (immutable) und erzeugen neue Strings(copy).

-A String is a reference type, why do you think the creators of Java decided to do so?
Strings sind oft lang, daher wäre das Kopieren teuer.
Als Referenztyp wird nur die Adresse übergeben – das spart Zeit und Speicher.

-What is the difference between a reference types and primitive types?
bei reference types: können wir einfach original Wert veränderen.
bei primitive types: können wir nicht original Wert veränderen.
 */
public class StringManipulation {
    public static void main(String[] args) {
        String text="Everybody said, it can’t be done. Then came one who did not know that and just made it." ;

                // 1. Retrieve the two uppercase letters
                System.out.println(text.charAt(0));  // 'E'
                System.out.println(text.charAt(23)); // 'T'

                // 2. Compare with name
                String myName = "Aya";
                System.out.println(text.compareTo(myName));

                // 3. Concatenate first and last name
                String fullName = "Aya" + " " + "Saad";
                System.out.println(fullName);

                // 4. Check if "made" and "Java" are present
                System.out.println(text.contains("made"));  // true
                System.out.println(text.contains("Java"));  // false

                // 5. Compare two strings for equality
                String str1 = "Text1";
                String str2 = "Text2";
                System.out.println(str1.equals(str2));  // false

                // 6. Output the index of the first occurrence of "d" ( indexOf ).
                System.out.println(text.indexOf('d'));

                // 7. Empty string
                String empty = "";
                System.out.println(empty.isEmpty());  // true

                // 8. Check for null
                String maybeNull = null;
                System.out.println(maybeNull == null);  // true

                // 9. Length of the text
                System.out.println(text.length()); //87

                // 10. Substrings
                System.out.println(text.substring(text.indexOf("said"), 14)); // "said"
                System.out.println(text.substring(text.indexOf("made"), text.indexOf("made") + 4)); // "made"

    }
}

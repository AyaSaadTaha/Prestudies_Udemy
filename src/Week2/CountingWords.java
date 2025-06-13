package Week2;
/*
Count the words in a text and print the result.
You can use this example:
String text = "Far out in the unexplored wastelands of something totally out of
fashion extension of the galaxy's western spiral arm, a little yellow sun glows
unnoticed. Orbiting them, also about ninety-one million miles away, is an absolutely
insignificant little blue-green planet whose ape bioforms are so amazingly primitive
that they still think digital clocks are an incredibly wonderful invention.";
 */
public class CountingWords {
    public static void main(String[] args) {
        String text = "Far out in the unexplored wastelands of something totally out of fashion extension of the galaxy's western spiral arm, a little yellow sun glows unnoticed. Orbiting them, also about ninety-one million miles away, is an absolutely insignificant little blue-green planet whose ape bioforms are so amazingly primitive that they still think digital clocks are an incredibly wonderful invention.";
        String[] words = text.split(" ");
        System.out.println("Number of words: " + words.length);
    }
}

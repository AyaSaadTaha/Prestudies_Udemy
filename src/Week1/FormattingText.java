package Week1;

import java.util.Scanner;

public class FormattingText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String:");
            String Words= scanner.nextLine();
            String[] Wordssplit = Words.split(" ");
            StringBuilder text = new StringBuilder();

            for (String i : Wordssplit) {
                String prefix = "";
                String suffix = "";

                while (i.length() > 0 && !Character.isLetterOrDigit(i.charAt(i.length() - 1)) &&
                        i.charAt(i.length() - 1) != '_' && i.charAt(i.length() - 1) != '#') {
                    suffix = i.charAt(i.length() - 1) + suffix;
                    i = i.substring(0, i.length() - 1);
                }

                if (i.startsWith("_") && i.endsWith("_")){
                    i = i.substring(1, i.length() - 1).toUpperCase();
                }
                else if (i.startsWith("#") && i.endsWith("#")){
                    i = i.substring(1, i.length() - 1).toLowerCase();
                }
                text.append(prefix).append(i).append(suffix).append(" ");
            }
            System.out.println(text.toString().trim());

    }
}

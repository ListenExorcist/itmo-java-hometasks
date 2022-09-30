package hw4;

import java.util.Locale;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("public String toLowerCase()\n" +
                "Converts all of the characters in this String to lower case using the rules of the default locale.");
        String testString = " TEST toLowerCase method TEST String TEST ";
        System.out.println("String: " + testString);
        System.out.println("String to lower case: " + testString.toLowerCase());
        System.out.println();
        System.out.println("public String toUpperCase()\n" +
                "Converts all of the characters in this String to upper case using the rules of the default locale.");
        testString = " test toUpperCase method test String test ";
        System.out.println("String: " + testString);
        System.out.println("String to upper case: " + testString.toUpperCase());
    }
}

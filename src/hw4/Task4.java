package hw4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("public int compareTo(String anotherString)\n" +
                "Compares two strings lexicographically.\n" +
                "The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal.");
        String testString1 = " test compareTo method test String test ";
        String testString2 = " test compareTo method test String test ";
        System.out.println("String1: " + testString1);
        System.out.println("Compares to: " + testString2);
        System.out.println(testString1.compareTo(testString2));
        System.out.println();
        System.out.println("public int compareToIgnoreCase(String str)\n" +
                "Compares two strings lexicographically, ignoring case differences.");
        testString1 = " test compareToIgnoreCase method test String test ";
        testString2 = " TEST compareToIgnoreCase method TEST String TEST ";
        System.out.println("String1: " + testString1);
        System.out.println("Compares to: " + testString2);
        System.out.println(testString1.compareToIgnoreCase(testString2));
    }
}

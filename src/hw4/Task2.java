package hw4;

public class Task2 {
    public static void main(String[] args) {
        String testString1 = " test contains method test String test ";
        String testString2 = "method test";
        System.out.println("public boolean contains(CharSequence s)\n" +
                "Returns true if and only if this string contains the specified sequence of char values.");
        System.out.println("String: " + testString1);
        System.out.println("Contains: " + testString2);
        System.out.println(testString1.contains(testString2));
        System.out.println();
        System.out.println("public boolean startsWith(String prefix)\n" +
                "Tests if this string starts with the specified prefix.");
        testString1 = " test statsWith method test String test ";
        testString2 = " test statsWith";
        System.out.println("String: " + testString1);
        System.out.println("Starts with: " + testString2);
        System.out.println(testString1.startsWith(testString2));
        System.out.println();
        System.out.println("public boolean endsWith(String suffix)\n" +
                "Tests if this string ends with the specified suffix.");
        testString1 = " test endsWith method test String test ";
        testString2 = "String test ";
        System.out.println("String: " + testString1);
        System.out.println("Ends with: " + testString2);
        System.out.println(testString1.endsWith(testString2));
    }
}

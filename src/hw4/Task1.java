package hw4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("public String replaceAll(String regex, String replacement)\n" +
                "Replaces each substring of this string that matches the given regular expression with the given replacement.");
        String testString = " test replaceAll method test String test ";
        System.out.println(testString);
        testString = testString.replaceAll("test", "TEST");
        System.out.println(testString);
        System.out.println();
        testString = " test replaceFirst method test String test ";
        System.out.println("public String  replaceFirst(String regex, String replacement)\n" +
                "Replaces the first substring of this string that matches the given regular expression with the given replacement.");
        System.out.println(testString);
        testString = testString.replaceFirst("test", "TEST");
        System.out.println(testString);
    }
}

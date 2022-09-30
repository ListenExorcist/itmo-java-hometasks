package hw4;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("public String repeat(int count)\n" +
                "Returns a string whose value is the concatenation of this string repeated count times.");
        String testString = " test repeat method test String test ";
        System.out.println("String: " + testString);
        System.out.println("String 5 times: " + testString.repeat(5));
    }
}

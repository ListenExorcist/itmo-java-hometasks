package hw4;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("public char charAt(int index)\n" +
                "Returns the char value at the specified index.");
        String testString = "test charAt method test String test";
        System.out.println("String: " + testString);
        if (testString == null || testString.length() == 0) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Char at position 0: " + testString.charAt(0));
            if (testString.length() > 2) {
                System.out.println("Char at position 2: " + testString.charAt(2));
            } else {
                System.out.println("Char at position 2: String is less than 3 characters long");
            }
            System.out.println("Last char: " + testString.charAt(testString.length() - 1));
        }
    }
}

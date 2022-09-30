package hw4;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("public boolean isBlank()\n" +
                "Returns true if the string is empty or contains only white space codepoints, otherwise false.");
        String testString1 = "     ";
        System.out.println("String is blank: " + testString1);
        System.out.println(testString1.isBlank());
        System.out.println();
        System.out.println("public boolean isEmpty()\n" +
                "Returns true if, and only if, length() is 0.");
        String testString2 = "";
        System.out.println("String is empty: " + testString1);
        System.out.println(testString1.isEmpty());
        System.out.println("String is empty: " + testString2);
        System.out.println(testString2.isEmpty());
    }
}

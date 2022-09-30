package hw4;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("public String trim()\n" +
                "Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).");
        String testString = " test trim method test String test ";
        System.out.println(testString);
        System.out.println(testString.trim());
        System.out.println();
        System.out.println("public String strip()\n" +
                "Returns a string whose value is this string, with all leading and trailing white space removed.");
        testString = " test strip method test String test ";
        System.out.println(testString);
        System.out.println(testString.strip());
        System.out.println();
        System.out.println("public String stripIndent()\n" +
                "Returns a string whose value is this string, with incidental white space removed from the beginning and end of every line.");
        testString = "  stripIndent method test String line1\n" +
                "    stripIndent method test String line2\n" +
                "      stripIndent method test String line3\n" +
                "    stripIndent method test String line4\n" +
                "  stripIndent method test String line5";
        System.out.println(testString);
        System.out.println(testString.stripIndent());
        System.out.println();
        System.out.println("public String stripLeading()\n" +
                "Returns a string whose value is this string, with all leading white space removed.");
        testString = " test stripLeading method test String test ";
        System.out.println(testString);
        System.out.println(testString.stripLeading());
        System.out.println();
        System.out.println("public String stripTrailing()\n" +
                "Returns a string whose value is this string, with all trailing white space removed.");
        testString = " test stripTrailing method test String test ";
        System.out.println(testString);
        System.out.println(testString.stripTrailing());

    }
}

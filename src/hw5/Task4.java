package hw5;

public class Task4 {
    public static void main(String[] args) {
        String sentence = "в предложении все слова разной длины";
        String[] words = sentence.split(" ");
        int maxSymbols = 0;
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxSymbols) {
                maxSymbols = words[i].length();
                longestWord = words[i];
            }
        }
        System.out.println("Предложение: " + sentence);
        System.out.println("Самое длинное слово: " + longestWord);
        System.out.println("Длина самого длинного слова: " + maxSymbols);
    }
}

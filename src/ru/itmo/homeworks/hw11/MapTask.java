package ru.itmo.homeworks.hw11;

import java.util.*;

public class MapTask {
    public static ArrayList<String> cityLogins(Map<String, String> citiesMap, String city) {
        ArrayList<String> result = new ArrayList<>();
        if (city == null) return result;
        for (Map.Entry<String, String> entry : citiesMap.entrySet()) {
            if (city.equals(entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static HashMap<String, Integer> repeatedWords(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.replace(word, result.get(word) + 1);
            }
        }
        return result;
    }

    public static HashMap<String, Customer> ageRangeCustomers(HashMap<String, Customer> customerMap, int from, int to) {
        HashMap<String, Customer> result = new HashMap<>();
        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
            if (entry.getValue().getAge() >= from && entry.getValue().getAge() < to) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public static HashMap<Integer, ArrayList<String>> mapWordsByLength(String text) {
        HashMap<Integer, ArrayList<String>> result = new HashMap<>();
        if (text == null) return result;
        String[] words = text.split(" ");
        for (String word : words) {
            if (!result.containsKey(word.length())) {
                result.put(word.length(), new ArrayList<String>());
                result.get(word.length()).add(word.toLowerCase());
            } else if (!result.get(word.length()).contains(word.toLowerCase())) {
                result.get(word.length()).add(word.toLowerCase());
            }
        }
        return result;
    }

    public static HashMap<String, Long> wordCountMap(String text, String word) {
        HashMap<String, Long> result = new HashMap<>();
        if (text == null || word == null) return result;
        String[] words = text.split(" ");
        long count = 0;
        for (String s : words) {
            if (word.toLowerCase().equals(s.toLowerCase())) count++;
        }
        result.put(word.toLowerCase(), count);
        return result;
    }

    public static void print10MostFrequentWords(String text) {
        if (text == null) return;
        String[] words = text.split(" ");
        HashMap<String, Long> map = new HashMap<>();
        for (String word : words) {
            map.putAll(wordCountMap(text, word));
        }
        long count = 0;
        String word = "";
        for (int i = 0; i < Math.min(10, map.size()); i++) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                if (entry.getValue() > count) {
                    count = entry.getValue();
                    word = entry.getKey();
                }
            }
            System.out.println(word);
            map.remove(word);
            count = 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        ArrayList<String> cityLogins = cityLogins(firstTaskMap, city);
        System.out.println(cityLogins);

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        HashMap<String, Integer> repeatedWords = repeatedWords(words);
        System.out.println(repeatedWords);

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        HashMap<String, Customer> ageRangeCustomers = ageRangeCustomers(customerMap, 17, 48);
        System.out.println(ageRangeCustomers);

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        HashMap<String, Long> wordCountMap = wordCountMap(text, "web");
        System.out.println(wordCountMap);

        HashMap<Integer, ArrayList<String>> wordsByLength = mapWordsByLength(text);
        System.out.println(wordsByLength);

        print10MostFrequentWords(text);
    }
}

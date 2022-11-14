package ru.itmo.homeworks.hw12.student;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentTask {
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        System.out.println("Students by gender:");
        Map<Student.Gender, ArrayList<Student>> studentsByGenderMap = students.stream()
                .collect(Collectors.groupingBy(
                Student::getGender,
                Collectors.toCollection(ArrayList::new)
        ));
        System.out.println(studentsByGenderMap);
        System.out.println();

        System.out.println("Average age:");
        double averageAge = students.stream()
                .collect(Collectors.averagingInt(
                student -> LocalDate.now().getYear() - student.getBirth().getYear()
        ));
        System.out.println(averageAge);
        System.out.println();

        Comparator<Student> ageComparator = (s1, s2) -> s2.getBirth().getYear() - s1.getBirth().getYear();

        System.out.println("Youngest student:");
        Student youngestStudent = students.stream()
                .min(ageComparator)
                .orElse(null);
        System.out.println(youngestStudent);
        System.out.println();

        System.out.println("Oldest student:");
        Student oldestStudent = students.stream()
                .max(ageComparator)
                .orElse(null);
        System.out.println(oldestStudent);
        System.out.println();

        System.out.println("Students by birth year:");
        Map<Integer, List<Student>> studentsByBirthYear = students.stream()
                .collect(Collectors.groupingBy(
                s -> s.getBirth().getYear()
        ));
        System.out.println(studentsByBirthYear);
        System.out.println();

        System.out.println("Without repeating names:");
        /*students.stream()
                .filter(distinctByKey(Student::getName))
                .forEach(s -> System.out.println(s.getName() + " " + s.getBirth()));*/
        Collection<Student> uniqueByName = students.stream()
                        .collect(Collectors.toMap(
                                Student::getName,
                                Function.identity(), // student -> student
                                ((student1, student2) -> student1)
                        )).values();
        uniqueByName.forEach(s -> System.out.println(s.getName() + " " + s.getBirth()));
        System.out.println();

        System.out.println("Sorted:");
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator
                        .comparing(Student::getGender)
                        .thenComparing(Student::getBirth)
                        .thenComparing((s1, s2) -> s2.getName().compareTo(s1.getName())))
                        .toList();
        System.out.println(sortedStudents);
        System.out.println();

        int from = 8;
        int to = 15;
        System.out.println("Students from " + from + " to " + to + " years old:");
        students.stream()
                .filter(s -> LocalDate.now().getYear() - s.getBirth().getYear() >= from)
                .filter(s -> LocalDate.now().getYear() - s.getBirth().getYear() < to)
                .forEach(System.out::println);
        System.out.println();

        String someName = "Алена";
        System.out.println("Students with name " + someName + ':');
        List<Student> someNameList = students.stream()
                .filter(s -> s.getName().equals(someName))
                .toList();
        System.out.println(someNameList);
        System.out.println();

        System.out.println("Gender-TotalAge map:");
        Map<Student.Gender, Integer> genderTotalAgeMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.summingInt(s -> LocalDate.now().getYear() - s.getBirth().getYear())
                ));
        System.out.println(genderTotalAgeMap);
    }
}

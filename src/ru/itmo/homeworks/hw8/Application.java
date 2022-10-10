package ru.itmo.homeworks.hw8;

public class Application {
    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[10];
        pupils[0] = new Pupil("Вася", 10, "Математика", 1);
        pupils[1] = new Pupil("Коля", 9, "Русский язык", 1);
        pupils[2] = new Pupil("Лена", 8, "Математика", 1);
        pupils[3] = new Pupil("Петя", 8, "Русский язык", 1);
        pupils[4] = new Pupil("Толя", 9, "Математика", 1);
        pupils[5] = new Pupil("Лиза", 10, "Русский язык", 1);
        pupils[6] = new Pupil("Света", 10, "Математика", 1);
        pupils[7] = new Pupil("Антон", 9, "Русский язык", 1);
        pupils[8] = new Pupil("Кирилл", 8, "Математика", 1);
        pupils[9] = new Pupil("Аня", 10, "Русский язык", 1);

        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher("Мария Ивановна", 30, "Русский язык", 4);
        teachers[1] = new Teacher("Максим Андреевич", 29, "МАтематика", 5);

        Director director = new Director("Тамара Петровна", 50);

        School school = new School("239", director, teachers, pupils);
        for (int i = 0; i < pupils.length; i++) {
            System.out.println(pupils[i].getName() + ": " + pupils[i].getKnowledge());
        }
        school.dayAtSchool();
        for (int i = 0; i < pupils.length; i++) {
            System.out.println(pupils[i].getName() + ": " + pupils[i].getKnowledge());
        }
    }
}

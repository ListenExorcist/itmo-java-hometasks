package ru.itmo.homeworks.hw6.task1;

public class Application {
    public static void main(String[] args) {
        Alpinist alpinist1 = new Alpinist("Виктор", "Москва");
        Alpinist alpinist2 = new Alpinist("Игорь", "Москва");
        Alpinist alpinist3 = new Alpinist("Наталья", "Москва");
        Alpinist alpinist4 = new Alpinist("Кирилл", "Москва");
        Alpinist alpinist5 = new Alpinist("Андрей", "Москва");
        Alpinist alpinist6 = new Alpinist("Алина", "Москва");
        Alpinist alpinist7 = new Alpinist("Светлана", "Москва");

        Mountain mountain1 = new Mountain("Лупгхар-Шар", "Пакистан", 7200);
        Mountain mountain2 = new Mountain("Поронг-Ри", "Китай", 7292);
        Mountain mountain3 = new Mountain("Пик Исмоила Сомони", "Таджикистан", 7495);

        Alpinist[] alpinists1 = new Alpinist[10];
        Alpinist[] alpinists2 = new Alpinist[10];
        Alpinist[] alpinists3 = new Alpinist[10];

        alpinists1[0] = alpinist1;
        alpinists1[1] = alpinist2;
        alpinists1[2] = alpinist3;
        alpinists2[0] = alpinist4;
        alpinists2[1] = alpinist5;
        alpinists3[0] = alpinist6;
        alpinists3[1] = alpinist7;

        Group group1 = new Group(false, alpinists1, mountain1);
        Group group2 = new Group(true, alpinists2, mountain2);
        Group group3 = new Group(true, alpinists3, mountain3);
    }
}

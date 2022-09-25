package hw2;

public class Task3 {
    public static void main(String[] args) {
        int count = 68;
        if (count <= 100 && count >= 90) {
            System.out.println("Отлично");
        } else if (count <= 89 && count >= 60) {
            System.out.println("Хорошо");
        } else if (count <= 59 && count >= 40) {
            System.out.println("Удовлетворительно");
        } else if (count <= 39 && count >= 0) {
            System.out.println("Попробуйте в следующий раз");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }
}

package hw2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 10000;
        int saleCode = 9011;
        double toPay;
        switch (saleCode) {
            case 4525:
                toPay = sum * 0.7;
                break;
            case 6424:
            case 7012:
                toPay = sum * 0.8;
                break;
            case 7647:
            case 9011:
            case 6612:
                toPay = sum * 0.9;
                break;
            default:
                toPay = sum;
        }
        System.out.println(toPay);
    }
}

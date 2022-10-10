package ru.itmo.homeworks.hw6.task2;

public class MyProducts {
    private final double maxProtein = 15;
    private final double maxFats = 10;
    private final double maxCarbohydrates = 40;
    private final int maxCalories = 200;
    private Product[] products = new Product[100];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                if (product.getProtein() > maxProtein) {
                    System.out.println("Продукт не может быть добавлен. Слишком большое содержание белков.");
                    return;
                }
                if (product.getFats() > maxFats) {
                    System.out.println("Продукт не может быть добавлен. Слишком большое содержание жиров.");
                    return;
                }
                if (product.getCarbohydrates() > maxCarbohydrates) {
                    System.out.println("Продукт не может быть добавлен. Слишком большое содержание углеводов.");
                    return;
                }
                if (product.getCalories() > maxCalories) {
                    System.out.println("Продукт не может быть добавлен. Слишком большое содержание калорий.");
                    return;
                }
                products[i] = product;
                System.out.println("Продукт добавлен: " + product.getName());
                return;
            }
        }
        System.out.println("Продукт не может быть добавлен. Список полон");
    }

    public void listProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return;
            }
            System.out.println(products[i].getName());
        }
    }
}

package ru.itmo.homeworks.hw6.task2;

public class Product {
    private String name;
    private double protein, fats, carbohydrates;
    private int calories;

    public Product(String name, double protein, double fats, double carbohydrates, int calories) {
        setName(name);
        setProtein(protein);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    public Product(String name, double protein, double fats, double carbohydrates) {
        setName(name);
        setProtein(protein);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories((int) (protein * 4 + carbohydrates * 4 + fats * 9));
    }

    public Product(String name) {
        setName(name);
        setProtein(7.97);
        setFats(2.68);
        setCarbohydrates(39.5);
        setCalories((int) (protein * 4 + carbohydrates * 4 + fats * 9));
    }

    public Product() {
        setName("Хлебушек");
        setProtein(7.97);
        setFats(2.68);
        setCarbohydrates(39.5);
        setCalories((int) (protein * 4 + carbohydrates * 4 + fats * 9));
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("имя не может быть null");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("имя не может быть пустым");
        }
        this.name = name;
    }

    private void setProtein(double protein) {
        if (protein <= 0) {
            throw new IllegalArgumentException("Количество протеинов должно быть больше 0");
        }
        this.protein = protein;
    }

    private void setFats(double fats) {
        if (fats <= 0) {
            throw new IllegalArgumentException("Количество жиров должно быть больше 0");
        }
        this.fats = fats;
    }

    private void setCarbohydrates(double carbohydrates) {
        if (carbohydrates <= 0) {
            throw new IllegalArgumentException("Количество углеводов должно быть больше 0");
        }
        this.carbohydrates = carbohydrates;
    }

    private void setCalories(int calories) {
        if (calories <= 0) {
            throw new IllegalArgumentException("Количество калорий должно быть больше 0");
        }
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getProtein() {
        return protein;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }
}

package ru.itmo.homeworks.hw6.task2;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Белый хлебушек");
        Product product3 = new Product("Мясной рулет", 14.3, 8.6, 4.2);
        Product product4 = new Product("Борщ", 3.8, 2.9, 4.3, 59);

        MyProducts myProducts = new MyProducts();
        myProducts.addProduct(product1);
        myProducts.addProduct(product2);
        myProducts.addProduct(product3);
        myProducts.addProduct(product4);
        myProducts.listProducts();
    }
}

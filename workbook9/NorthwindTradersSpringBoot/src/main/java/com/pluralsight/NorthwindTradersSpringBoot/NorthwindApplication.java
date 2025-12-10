package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nNorthwind Admin Menu");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    for (Product p : productDao.getAll()) {
                        System.out.printf("%d | %s | %s | $%.2f%n",
                                p.getProductId(), p.getName(), p.getCategory(), p.getPrice());
                    }
                }
                case 2 -> {
                    System.out.print("Product ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Product product = new Product(id, name, category, price);
                    productDao.add(product);

                    System.out.println("Product added.");
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

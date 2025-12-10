package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        products.add(new Product(1, "Chai", "Beverages", 18.0));
        products.add(new Product(2, "Bread", "Food", 7.0));
        products.add(new Product(3, "Ketchup", "Condiments", 8.0));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}

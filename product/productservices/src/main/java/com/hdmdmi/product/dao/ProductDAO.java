package com.hdmdmi.product.dao;

import com.hdmdmi.product.dto.Product;

public interface ProductDAO {
    void create(Product p);

    Product read(int id);

    void update(Product p);

    void delete(int id);
}

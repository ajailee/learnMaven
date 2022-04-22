package com.hdmdmi.product.bo;

import com.hdmdmi.product.dto.Product;

public interface ProductBo {
    void create(Product p);
    Product findProduct(int id);
}

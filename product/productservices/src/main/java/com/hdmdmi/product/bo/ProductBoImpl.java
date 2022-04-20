package com.hdmdmi.product.bo;

import com.hdmdmi.product.dao.ProductDAO;
import com.hdmdmi.product.dao.ProductDAOImpl;
import com.hdmdmi.product.dto.Product;

public class ProductBoImpl implements ProductBo {
    static ProductDAO dao = new ProductDAOImpl();
    @Override
    public void create(Product p) {
        dao.create(p);
    }

    @Override
    public Product findProduct(int id) {
        return  dao.read(id);
    }
}

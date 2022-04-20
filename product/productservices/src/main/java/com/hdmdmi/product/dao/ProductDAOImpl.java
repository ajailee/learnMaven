package com.hdmdmi.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.hdmdmi.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

    Map<Integer, Product> map = new HashMap<>();

    @Override
    public void create(Product p) {
        map.put(p.getId(), p);
    }

    @Override
    public Product read(int id) {
        return map.get(id);
    }

    @Override
    public void update(Product p) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

}

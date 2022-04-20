package com.hdmdmi.dao;

import com.hdmdmi.product.dao.ProductDAO;
import com.hdmdmi.product.dao.ProductDAOImpl;
import com.hdmdmi.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateProduct() {
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("iphone");
        product.setDescription("awesome");
        product.setPrice(100000);
        dao.create(product);
        Product result = dao.read(1);
        assertNotNull(result);
        assertEquals("iphone", result.getName());
    }
}

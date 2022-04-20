package com.hdmdmi.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hdmdmi.product.bo.*;
import com.hdmdmi.product.dto.Product;

/**
 * Servlet implementation class CreateProductServlets
 */
public class CreateProductServlets extends HttpServlet {
	static ProductBo bo = new ProductBoImpl();
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setDescription(description);
		p.setPrice(price);
		
		bo.create(p);
		
		response.getWriter().print("product Created");
	}

}

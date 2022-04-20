package com.hdmdmi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdmdmi.product.bo.ProductBo;
import com.hdmdmi.product.bo.ProductBoImpl;
import com.hdmdmi.product.dto.Product;

/**
 * Servlet implementation class DisplayProductsDetailsServlet
 */
public class DisplayProductsDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static ProductBo bo = new ProductBoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt( request.getParameter("id"));
		 RequestDispatcher view = request.getRequestDispatcher("/details.html");
	        // don't add your web-app name to the path
	    view.forward(request, response);  
		Product p=bo.findProduct(id);
//		PrintWriter out =  response.getWriter();
//		out.write("Product Details");
//		out.write("Product Id: "+p.getId());
//		out.write("Product Name: "+p.getName());
//		out.write("Product Description: "+p.getDescription());
//		out.write("Product Price: "+p.getPrice());
	}

}

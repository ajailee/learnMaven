<%@page import="com.hdmdmi.product.bo.*" %>



<html>
<body>
<h2>Hello World!</h2>
<a href="product.html">Add Product</a>
<% String s=new ProductBoImpl().findProduct(1).getName(); %>
<%= s %>
</body>
</html>

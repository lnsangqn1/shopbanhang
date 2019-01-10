<%-- 
    Document   : manager_product
    Created on : Dec 10, 2018, 5:11:10 PM
    Author     : quang
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ProductBean"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Product</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%

            ProductDAO productDAO = new ProductDAO();
            ArrayList<ProductBean> listProduct = productDAO.getListProduct();
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
                <div id="rightContent">
                    <h3>Quản lý sản phẩm</h3>
                    
                    <a href="insert_product.jsp">Thêm sản phẩm</a>

                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã sản phẩm</th>
                            <th class="data">Mã danh mục</th>
                            <th class="data">Tên sản phẩm</th>
                            <th class="data">Giá sản phẩm</th>
                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                        
                        <%
                            int count = 0;
                            for(ProductBean product : listProduct){
                                count++;
                        %>
                        <tr class="data">
                            <td class="data" width="30px"><%=count%></td>
                            <td class="data"><%=product.getProductId()%></td>
                            <td class="data"><%=product.getCategoryId()%></td>
                            <td class="data"><%=product.getProductName()%></td>
                            <td class="data"><%=product.getProductPrice()%></td>
                            <td class="data" width="75px">
                        <center>
                            <a href="update_product.jsp?command=update&product_id=<%=product.getProductId()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;  
                            <a href="/SHOP-ONLINE1/admin/ManagerProductServlet?command=delete&product_id=<%=product.getProductId()%>">Xóa</a>
                        </center>
                        </td>
                        </tr>
                        <%}%>
                    </table>
                </div>
                <div class="clear"></div>

                <jsp:include page="footer.jsp"></jsp:include>

            </div>
    </body>
</html>

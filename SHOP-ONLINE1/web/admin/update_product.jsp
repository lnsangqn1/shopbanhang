<%-- 
    Document   : insert_category
    Created on : Dec 10, 2018, 5:32:32 PM
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
        <title>Cập nhật sản phẩm</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        
        <% 
            String id = request.getParameter("product_id");
            ProductDAO productDAO = new ProductDAO();
            ArrayList<ProductBean> listProduct = productDAO.getListProductById(id);
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Cập nhật sản phẩm</h3>

                    <form action="ManagerProductServlet" enctype="multipart/form-data" method="post">                    
                    <table width="95%">     
                        <%
                            for(ProductBean pb : listProduct){
                        %>
                        <tr>
                            <td style="float: right"><b>Mã sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_id" value="<%= pb.getProductId()%>" disabled></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Mã danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_id" value="<%= pb.getCategoryId()%>" disabled></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tên sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_name" value="<%= pb.getProductName()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giá sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_price" value="<%= pb.getProductPrice()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giá giảm giá:</b></td>
                            <td><input type="text" class="sedang" name="product_sale" value="<%= pb.getProductSale()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm:</b></td>
                            <td><input type="file" class="sedang" name="product_image"><br>Link ảnh: <%= pb.getProductImage()%></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm 2:</b></td>
                            <td><input type="file" class="sedang" name="product_image2"><br>Link ảnh: <%= pb.getProductImage2()%></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm 3:</b></td>
                            <td><input type="file" class="sedang" name="product_image3"><br>Link ảnh: <%= pb.getProductImage3()%></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Miêu tả sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_description" value="<%= pb.getProductDescription()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tổng quan sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_overview" value="<%= pb.getProductOverview()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Thông tin khác:</b></td>
                            <td><input type="text" class="sedang" name="product_more" value="<%= pb.getProductMore()%>"></td>
                        </tr>
                        <%}%>
                        <tr><td></td><td>
                                <input type="hidden" name="command" value="update">
                                <input type="hidden" name="product_id" value="<%=request.getParameter("product_id")%>">
                                <input type="submit" class="button" value="Lưu dữ liệu">
                            </td></tr>
                    </table>
                    </form>
                </div>
                <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>
    </body>
</html>

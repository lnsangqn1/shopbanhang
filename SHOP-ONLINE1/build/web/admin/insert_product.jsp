<%-- 
    Document   : insert_category
    Created on : Dec 10, 2018, 5:32:32 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý sản phẩm</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script language="javascript" type="text/javascript">
            
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Thêm sản phẩm</h3>

                    <form action="ManagerProductServlet" enctype="multipart/form-data" method="post">                    
                    <table width="95%">
                        <tr>
                            <td style="float: right"><b>Mã danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_id"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tên sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_name"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giá sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_price"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giá giảm giá:</b></td>
                            <td><input type="text" class="sedang" name="product_sale"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm:</b></td>
                            <td><input type="file" class="sedang" name="product_image"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm 2:</b></td>
                            <td><input type="file" class="sedang" name="product_image2"><label for="file">Choose a file</label></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Ảnh sản phẩm 3:</b></td>
                            <td><input type="file" class="sedang" name="product_image3"><label for="file">Choose a file</label></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Miêu tả sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_description"><label for="file">Choose a file</label></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tổng quan sản phẩm:</b></td>
                            <td><input type="text" class="sedang" name="product_overview"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Thông tin khác:</b></td>
                            <td><input type="text" class="sedang" name="product_more"></td>
                        </tr>
                        <tr><td></td><td>
                                <input type="hidden" name="command" value="insert">
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

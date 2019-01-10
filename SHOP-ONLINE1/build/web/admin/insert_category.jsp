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
        <title>Quản lý danh mục</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Thêm danh mục</h3>

                    <form action="ManagerCategoryServlet" method="post">                    
                    <table width="95%">                        
                        <tr>
                            <td style="float: right"><b>Mã danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_id"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tên danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_name"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giới tính:</b></td>
                            <td><input type="text" class="sedang" name="category_sex"></td>
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

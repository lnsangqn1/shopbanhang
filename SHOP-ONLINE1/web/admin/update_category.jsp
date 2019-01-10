<%-- 
    Document   : insert_category
    Created on : Dec 10, 2018, 5:32:32 PM
    Author     : quang
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.CategoryBean"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật danh mục</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        
        <% 
            String id = request.getParameter("category_id");
            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<CategoryBean> listCategory = categoryDAO.getListCategoryById(id);
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Cập nhật danh mục</h3>

                    <form action="ManagerCategoryServlet" method="post">                    
                    <table width="95%">     
                        <%
                            for(CategoryBean cb : listCategory){
                        %>
                        <tr>
                            <td style="float: right"><b>Mã danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_id" value="<%= cb.getCategoryId()%>" disabled></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Tên danh mục:</b></td>
                            <td><input type="text" class="sedang" name="category_name" value="<%= cb.getCategoryName()%>"></td>
                        </tr>
                        <tr>
                            <td style="float: right"><b>Giới tính:</b></td>
                            <td><input type="text" class="sedang" name="category_sex" value="<%= cb.getCategorySex()%>"></td>
                        </tr>
                        <%}%>
                        <tr><td></td><td>
                                <input type="hidden" name="command" value="update">
                                <input type="hidden" name="category_id" value="<%=request.getParameter("category_id")%>">
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

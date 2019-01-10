<%-- 
    Document   : manager_category
    Created on : Dec 10, 2018, 5:10:44 PM
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
        <title>Quản lý danh mục</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        
        <%

            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<CategoryBean> listCategory = categoryDAO.getListCategory();
        %>
        
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
                <div id="rightContent">
                    <h3>Quản lý danh mục</h3>
                    
                    <a href="insert_category.jsp">Thêm danh mục</a>

                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã danh mục</th>
                            <th class="data">Tên danh mục</th>
                            <th class="data">Giới tính</th>
                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                        
                        <%
                            int count = 0;
                            for(CategoryBean category : listCategory){
                                count++;
                        %>
                        <tr class="data">
                            <td class="data" width="30px"><%=count%></td>
                            <td class="data"><%=category.getCategoryId()%></td>
                            <td class="data"><%=category.getCategoryName()%></td>
                            <td class="data"><%=category.getCategorySex()%></td>
                            <td class="data" width="90px">
                                <center>
                                    <a href="update_category.jsp?command=update&category_id=<%=category.getCategoryId()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;                                
                                    <a href="/SHOP-ONLINE1/admin/ManagerCategoryServlet?command=delete&category_id=<%=category.getCategoryId()%>">Xóa</a>
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

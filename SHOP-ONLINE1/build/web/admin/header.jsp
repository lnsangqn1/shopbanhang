<%-- 
    Document   : header
    Created on : Dec 10, 2018, 11:11:01 AM
    Author     : quang
--%>

<%@page import="model.ProfileBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
    </head>
    <body>   
        <div id="header">
            <div class="inHeader">
                <div class="mosAdmin">
                    
                    <% ProfileBean profileBean = (ProfileBean) session.getAttribute("admin");
                        if(profileBean == null){
                            response.sendRedirect("../login.jsp");
                        }else{
                    %>
                    Xin chào, <%= profileBean.getName()%><%}%><br>
                    <a href="ProcessLogoutAdmin">Đăng xuất</a>
                </div>
                <div class="clear"></div>
            </div>
        </div> 
    </body>
</html>

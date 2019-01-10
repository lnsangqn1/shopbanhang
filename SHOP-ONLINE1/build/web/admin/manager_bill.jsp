<%-- 
    Document   : manager_category
    Created on : Dec 10, 2018, 5:10:44 PM
    Author     : quang
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Bill"%>
<%@page import="dao.BillDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager_Bill</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%

            BillDAO billDAO = new BillDAO();
            ArrayList<Bill> listBill = billDAO.getListCategory();
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
                <div id="rightContent">
                    <h3>Quản lý hóa đơn</h3>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã khách hàng</th>
                            <th class="data">Tổng tiền hóa đơn</th>
                            <th class="data">Phương thức thanh toán</th>
                            <th class="data">Địa chỉ khách hàng</th>
                            <th class="data">Ngày giao dịch</th>
                            <th class="data">Xác nhận đơn hàng</th>
                        </tr>
                        <%
                            int count = 0;
                            for(Bill bll : listBill){
                                count++;
                        %>
                        <tr class="data">
                            <td class="data" width="30px"><%=count%></td>
                            <td class="data"><%=bll.getUserId()%></td>
                            <td class="data"><%=bll.getBillTotal()%></td>
                            <td class="data"><%=bll.getBillPayment()%></td>
                            <td class="data"><%=bll.getBillAddress()%></td>
                            <td class="data"><%=bll.getBillDate()%></td>
                            <td class="data">
                                <% if(bll.getBillAccept()==1){
                                    out.print("Đã xác nhận");}
                                    else{
                                    out.print("Chưa xác nhận");
                                };%>
                            </td>
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

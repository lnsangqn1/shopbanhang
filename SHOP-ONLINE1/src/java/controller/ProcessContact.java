/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ContactDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contact;
import model.ProfileBean;

/**
 *
 * @author LeSang97
 */
public class ProcessContact extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String yourn = request.getParameter("yourn");
        String youre = request.getParameter("youre");
        String yours = request.getParameter("yours");
        String yourm = request.getParameter("yourm");

        Contact cont = new Contact(yourn, youre, yours, yourm);
        ContactDAO contdao = new ContactDAO();
        contdao.insertContact(cont);
        response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            pw.println("<script type=\"text/javascript\">");
            pw.println("alert('Send contact success');");
            pw.println("location='index.jsp';");
            pw.println("</script>");
    }
    
}

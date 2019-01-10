/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CategoryBean;

/**
 *
 * @author quang
 */
public class ManagerCategoryServlet extends HttpServlet {

    CategoryDAO categoryDAO = new CategoryDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String command = request.getParameter("command");

        String category_id = request.getParameter("category_id");

        String url = "";
        try {
            switch (command) {
                case "delete":
                    categoryDAO.deleteCategory(category_id);
                    url = "/admin/manager_category.jsp";
                    break;
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String command = request.getParameter("command");

        String category_id = request.getParameter("category_id");
        String category_name = request.getParameter("category_name");
        String category_sex = request.getParameter("category_sex");

        CategoryBean cb = new CategoryBean(category_id, category_name, category_sex);

        String url = "", error = "";
        if (category_id.equals("")) {
            error = "Vui lòng nhập mã danh mục";
            request.setAttribute("error", error);
        }

        try {
            if (error.length() == 0) {
                switch (command) {
                    case "insert":
                        categoryDAO.insertCategory(cb);
                        url = "/admin/manager_category.jsp";
                        break;
                    case "update":
                        categoryDAO.updateCategory(cb);
                        url = "/admin/manager_category.jsp";
                        break;
                }
            } else {
                url = "/admin/insert_category.jsp";
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
}

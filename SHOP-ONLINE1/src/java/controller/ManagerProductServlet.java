/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.ProductBean;

/**
 *
 * @author quang
 */
public class ManagerProductServlet extends HttpServlet {

    ProductDAO productDAO = new ProductDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String command = request.getParameter("command");

        String product_id = request.getParameter("product_id");

        String url = "";
        try {
            switch (command) {
                case "delete":
                    productDAO.deleteProduct(product_id);
                    url = "/admin/manager_product.jsp";
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
        String product_id = request.getParameter("product_id"); 
        String category_id = request.getParameter("category_id");
        String product_name = request.getParameter("product_name");
        String product_price = request.getParameter("product_price");
        String product_sale = request.getParameter("product_sale");
        
        String product_description = request.getParameter("product_description");
        String product_overview = request.getParameter("product_overview");
        String product_more = request.getParameter("product_more");
        
        Part filePart = request.getPart("product_image");
        Part filePart2 = request.getPart("product_image2");
        Part filePart3 = request.getPart("product_image3");
        String product_image = this.getFolderUpload().getAbsolutePath() + File.separator +extractFileName(filePart);
        String product_image2 = this.getFolderUpload().getAbsolutePath() + File.separator +extractFileName(filePart2);
        String product_image3 = this.getFolderUpload().getAbsolutePath() + File.separator +extractFileName(filePart3);
        
        filePart.write(product_image);
        filePart2.write(product_image2);
        filePart3.write(product_image3);
        
        ProductBean productBean = new ProductBean(category_id, product_name, Integer.parseInt(product_price), 
                                                Integer.parseInt(product_sale), product_image, product_image2, 
                                                product_image3, product_description, product_overview, product_more);
        
     

        String url = "", error = "";

        try {
            if (error.length() == 0) {
                switch (command) {
                    case "insert":
                        productDAO.insertProduct(productBean);
                        url = "/admin/manager_product.jsp";
                        break;
                    case "update":
                        ProductBean productBean1 = new ProductBean(Integer.parseInt(product_id), category_id, product_name, Integer.parseInt(product_price), 
                                                Integer.parseInt(product_sale), product_image, product_image2, 
                                                product_image3, product_description, product_overview, product_more);              

                        productDAO.updateProduct(productBean1);
                        url = "/admin/manager_product.jsp";
                        break;
                }
            } else {
                url = "/admin/insert_product.jsp";
            }
        } catch (SQLException e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
    private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

	public File getFolderUpload() {
		File folderUpload = new File("D:/SHOP-ONLINE1/web/images/img_sanpham");
		if (!folderUpload.exists()) {
			folderUpload.mkdirs();
		}
		return folderUpload;
	}
}

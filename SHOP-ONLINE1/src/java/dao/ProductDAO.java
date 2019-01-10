/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ProductBean;

/**
 *
 * @author Sinh
 */
public class ProductDAO {

    public static Connection openConnection() {
        Connection conn = null;
        try {
            Class.forName(DBConfig.driver);
            conn = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return conn;
    }

    public ArrayList<ProductBean> getProductByCategoryId(String categoryId) {
        ArrayList<ProductBean> list = new ArrayList<>();
        String query = "select * from product where category_id = ?";
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductBean b = new ProductBean();
                b.setProductId(rs.getInt("product_id"));
                b.setCategoryId(rs.getString("category_id"));
                b.setProductName(rs.getString("product_name"));
                b.setProductPrice(rs.getInt("product_price"));
                b.setProductSale(rs.getInt("product_sale"));
                b.setProductImage(rs.getString("product_image"));
                b.setProductImage2(rs.getString("product_image2"));
                b.setProductImage3(rs.getString("product_image3"));
                b.setProductDescription(rs.getString("product_description"));
                b.setProductOverview(rs.getString("product_overview"));
                b.setProductMore(rs.getString("product_more"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        return list;
    }
    

    public ProductBean getProductById(int product_id) {
        ProductBean b = new ProductBean();
        String query = "select * from product where product_id = ?";
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, product_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                b.setProductId(rs.getInt("product_id"));
                b.setCategoryId(rs.getString("category_id"));
                b.setProductName(rs.getString("product_name"));
                b.setProductPrice(rs.getInt("product_price"));
                b.setProductSale(rs.getInt("product_sale"));
                b.setProductImage(rs.getString("product_image"));
                b.setProductImage2(rs.getString("product_image2"));
                b.setProductImage3(rs.getString("product_image3"));
                b.setProductDescription(rs.getString("product_description"));
                b.setProductOverview(rs.getString("product_overview"));
                b.setProductMore(rs.getString("product_more"));
            }
        } catch (Exception ex) {
            System.out.println("Error :" + ex.getMessage());
        }
        return b;
    }
    
    public ArrayList<ProductBean> getProductTop() {
        ArrayList<ProductBean> list = new ArrayList<>();
        String query = "SELECT * FROM product ORDER BY product_id DESC LIMIT 6";
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductBean b = new ProductBean();
                b.setProductId(rs.getInt("product_id"));
                b.setCategoryId(rs.getString("category_id"));
                b.setProductName(rs.getString("product_name"));
                b.setProductPrice(rs.getInt("product_price"));
                b.setProductSale(rs.getInt("product_sale"));
                b.setProductImage(rs.getString("product_image"));
                b.setProductImage2(rs.getString("product_image2"));
                b.setProductImage3(rs.getString("product_image3"));
                b.setProductDescription(rs.getString("product_description"));
                b.setProductOverview(rs.getString("product_overview"));
                b.setProductMore(rs.getString("product_more"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        return list;
    }
    
    public ArrayList<ProductBean> getListProduct() {
        String query = "select * from product ";
        ArrayList<ProductBean> list = new ArrayList<>();
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductBean pb = new ProductBean();
                pb.setProductId(rs.getInt("product_id"));
                pb.setCategoryId(rs.getString("category_id"));
                pb.setProductName(rs.getString("product_name"));
                pb.setProductPrice(rs.getInt("product_price"));
                list.add(pb);
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return list;
    }

    public ArrayList<ProductBean> getListProductById(String id) {
        String query = "select * from product where product_id = ?";
        ArrayList<ProductBean> list = new ArrayList<>();
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductBean pb = new ProductBean();
                pb.setProductId(rs.getInt("product_id"));
                pb.setCategoryId(rs.getString("category_id"));
                pb.setProductName(rs.getString("product_name"));
                pb.setProductPrice(rs.getInt("product_price"));
                pb.setProductSale(rs.getInt("product_sale"));
                pb.setProductImage(rs.getString("product_image"));
                pb.setProductImage2(rs.getString("product_image2"));
                pb.setProductImage3(rs.getString("product_image3"));
                pb.setProductDescription(rs.getString("product_description"));
                pb.setProductOverview(rs.getString("product_overview"));
                pb.setProductMore(rs.getString("product_more"));
                list.add(pb);
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return list;
    }

    public boolean insertProduct (ProductBean pb) throws SQLException {
        try(Connection c = openConnection()) {     
            String sql = "INSERT INTO product(category_id, product_name, product_price, product_sale,"
                    + "product_image, product_image2, product_image3, product_description, product_overview,"
                    + "product_more) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, pb.getCategoryId());
            ps.setString(2, pb.getProductName());
            ps.setInt(3, pb.getProductPrice());
            ps.setInt(4, pb.getProductSale());
            ps.setString(5, pb.getProductImage());
            ps.setString(6, pb.getProductImage2());
            ps.setString(7, pb.getProductImage3());
            ps.setString(8, pb.getProductDescription());
            ps.setString(9, pb.getProductOverview());
            ps.setString(10, pb.getProductMore());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean updateProduct(ProductBean pb) {

        try (Connection c = openConnection()){
            String sql = "UPDATE product SET category_id = ?, product_name = ?, product_price = ?, "
                    + "product_sale = ?,product_image = ?,product_image2 = ?, product_image3 = ?, "
                    + "product_description = ?, product_overview = ?,product_more = ? WHERE product_id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            
//            pb.setCategoryId("222");
//            pb.setProductName("222");
//            pb.setProductPrice(11);
//            pb.setProductSale(11);
//            pb.setProductImage("11");
//            pb.setProductImage2("11");
//            pb.setProductImage3("11");
//            pb.setProductDescription("11");
//            pb.setProductMore("11");
//            pb.setProductOverview("11");
            
            ps.setString(1, pb.getCategoryId());
            ps.setString(2, pb.getProductName());
            ps.setInt(3, pb.getProductPrice());
            ps.setInt(4, pb.getProductSale());
            ps.setString(5, pb.getProductImage());
            ps.setString(6, pb.getProductImage2());
            ps.setString(7, pb.getProductImage3());
            ps.setString(8, pb.getProductDescription());
            ps.setString(9, pb.getProductOverview());
            ps.setString(10, pb.getProductMore());
            ps.setInt(11, pb.getProductId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    public boolean deleteProduct(String product_id) throws SQLException {
        try (Connection c = openConnection()){
            String sql = "DELETE FROM product WHERE product_id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, product_id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}

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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CategoryBean;

/**
 *
 * @author Sinh
 */
public class CategoryDAO {

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

    public ArrayList<CategoryBean> getListCategory(String category_sex) {
        String query = "select * from category where category_sex = ?";
        ArrayList<CategoryBean> list = new ArrayList<>();
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, category_sex);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CategoryBean cat = new CategoryBean();
                cat.setCategoryId(rs.getString("category_id"));
                cat.setCategoryName(rs.getString("category_name"));
                list.add(cat);
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return list;
    }

    public String getCategoryName(String category_id) {
        String query = "select * from category where category_id = ?";
        String name = "";
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, category_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("category_name");
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return name;
    }

    public ArrayList<CategoryBean> getListCategory() {
        String query = "select * from category ";
        ArrayList<CategoryBean> list = new ArrayList<>();
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CategoryBean cat = new CategoryBean();
                cat.setCategoryId(rs.getString("category_id"));
                cat.setCategoryName(rs.getString("category_name"));
                cat.setCategorySex(rs.getString("category_sex"));
                list.add(cat);
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return list;
    }

    public ArrayList<CategoryBean> getListCategoryById(String id) {
        String query = "select * from category where category_id = ?";
        ArrayList<CategoryBean> list = new ArrayList<>();
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CategoryBean cat = new CategoryBean();
                cat.setCategoryId(rs.getString("category_id"));
                cat.setCategoryName(rs.getString("category_name"));
                cat.setCategorySex(rs.getString("category_sex"));
                list.add(cat);
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return list;
    }

    public boolean insertCategory(CategoryBean cb) throws SQLException {
        try (Connection c = openConnection()) {
            String sql = "INSERT INTO category(category_id, category_name, category_sex) VALUES(?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cb.getCategoryId());
            ps.setString(2, cb.getCategoryName());
            ps.setString(3, cb.getCategorySex());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean updateCategory(CategoryBean cb) throws SQLException {
        try (Connection c = openConnection()) {
            String sql = "UPDATE category SET category_name=?, category_sex=? WHERE category_id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cb.getCategoryName());
            ps.setString(2, cb.getCategorySex());
            ps.setString(3, cb.getCategoryId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteCategory(String category_id) throws SQLException {
        try (Connection c = openConnection()) {
            String sql = "DELETE FROM category WHERE category_id = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, category_id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}

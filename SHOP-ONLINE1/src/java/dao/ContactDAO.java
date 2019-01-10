/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.BillDAO.openConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Bill;
import model.Contact;

/**
 *
 * @author LeSang97
 */
public class ContactDAO {
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
    public static boolean insertContact(Contact cont) {
        String query = "insert into contact values (?,?,?,?)";
        try (Connection c = openConnection()) {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, cont.getYourname());
            ps.setString(2, cont.getYouremail());
            ps.setString(3, cont.getSubject());
            ps.setString(4, cont.getYourmessage());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
        return false;
    }

}

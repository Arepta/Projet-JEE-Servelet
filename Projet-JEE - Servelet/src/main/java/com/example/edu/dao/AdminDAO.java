
package com.example.edu.dao;

import com.example.edu.model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    private Connection connection;

    public AdminDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Admin> findAll() {
        List<Admin> admins = new ArrayList<>();
        try {
            String query = "SELECT * FROM admins";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Admin admin = new Admin(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
                );
                admins.add(admin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admins;
    }
}

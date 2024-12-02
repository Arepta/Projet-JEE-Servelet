
package com.example.edu.dao;

import com.example.edu.model.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {
    private Connection connection;

    public TeacherDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Teacher> findAll() {
        List<Teacher> teachers = new ArrayList<>();
        try {
            String query = "SELECT * FROM teachers";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Teacher teacher = new Teacher(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email")
                );
                teachers.add(teacher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teachers;
    }
}

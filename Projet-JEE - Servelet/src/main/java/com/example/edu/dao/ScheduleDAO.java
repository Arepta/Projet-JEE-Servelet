
package com.example.edu.dao;

import com.example.edu.model.Schedule;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScheduleDAO {
    private Connection connection;

    public ScheduleDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Schedule> findAll() {
        List<Schedule> schedules = new ArrayList<>();
        try {
            String query = "SELECT * FROM schedules";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Schedule schedule = new Schedule(
                    rs.getInt("id"),
                    rs.getString("day"),
                    rs.getString("time"),
                    rs.getString("room")
                );
                schedules.add(schedule);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return schedules;
    }
}


package com.example.edu.service;

import com.example.edu.dao.ScheduleDAO;
import com.example.edu.model.Schedule;
import java.util.List;

public class ScheduleService {
    private ScheduleDAO scheduleDAO;

    public ScheduleService(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    public List<Schedule> getAllSchedules() {
        return scheduleDAO.findAll();
    }
}

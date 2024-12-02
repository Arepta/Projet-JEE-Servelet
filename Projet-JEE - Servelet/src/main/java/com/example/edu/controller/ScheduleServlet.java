
package com.example.edu.controller;

import com.example.edu.model.Schedule;
import com.example.edu.service.ScheduleService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ScheduleServlet", urlPatterns = "/schedule")
public class ScheduleServlet extends HttpServlet {
    private ScheduleService scheduleService;

    @Override
    public void init() throws ServletException {
        scheduleService = new ScheduleService(new com.example.edu.dao.ScheduleDAO(
            (java.sql.Connection) getServletContext().getAttribute("DBConnection")
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Schedule> schedules = scheduleService.getAllSchedules();
        req.setAttribute("schedules", schedules);
        req.getRequestDispatcher("/WEB-INF/views/schedules.jsp").forward(req, resp);
    }
}

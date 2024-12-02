
package com.example.edu.controller;

import com.example.edu.model.Teacher;
import com.example.edu.service.TeacherService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TeacherServlet", urlPatterns = "/teacher")
public class TeacherServlet extends HttpServlet {
    private TeacherService teacherService;

    @Override
    public void init() throws ServletException {
        teacherService = new TeacherService(new com.example.edu.dao.TeacherDAO(
            (java.sql.Connection) getServletContext().getAttribute("DBConnection")
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> teachers = teacherService.getAllTeachers();
        req.setAttribute("teachers", teachers);
        req.getRequestDispatcher("/WEB-INF/views/teachers.jsp").forward(req, resp);
    }
}


package com.example.edu.controller;

import com.example.edu.model.Student;
import com.example.edu.service.StudentService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/student")
public class StudentServlet extends HttpServlet {
    private StudentService service;

    @Override
    public void init() throws ServletException {
        // Initialize with DAO and Service setup
        service = new StudentService(new com.example.edu.dao.StudentDAO(
            (java.sql.Connection) getServletContext().getAttribute("DBConnection")
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> items = service.getAll();
        req.setAttribute("items", items);
        req.getRequestDispatcher("/WEB-INF/views/students.jsp").forward(req, resp);
    }
}

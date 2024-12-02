
package com.example.edu.controller;

import com.example.edu.model.Admin;
import com.example.edu.service.AdminService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminServlet", urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {
    private AdminService adminService;

    @Override
    public void init() throws ServletException {
        adminService = new AdminService(new com.example.edu.dao.AdminDAO(
            (java.sql.Connection) getServletContext().getAttribute("DBConnection")
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Admin> admins = adminService.getAllAdmins();
        req.setAttribute("admins", admins);
        req.getRequestDispatcher("/WEB-INF/views/admins.jsp").forward(req, resp);
    }
}

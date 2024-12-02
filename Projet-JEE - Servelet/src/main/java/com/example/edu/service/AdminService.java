
package com.example.edu.service;

import com.example.edu.dao.AdminDAO;
import com.example.edu.model.Admin;
import java.util.List;

public class AdminService {
    private AdminDAO adminDAO;

    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    public List<Admin> getAllAdmins() {
        return adminDAO.findAll();
    }
}

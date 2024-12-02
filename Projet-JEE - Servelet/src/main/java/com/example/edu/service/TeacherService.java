
package com.example.edu.service;

import com.example.edu.dao.TeacherDAO;
import com.example.edu.model.Teacher;
import java.util.List;

public class TeacherService {
    private TeacherDAO teacherDAO;

    public TeacherService(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    public List<Teacher> getAllTeachers() {
        return teacherDAO.findAll();
    }
}

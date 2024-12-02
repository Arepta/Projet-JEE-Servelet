
package com.example.edu.service;

import com.example.edu.dao.StudentDAO;
import com.example.edu.model.Student;
import java.util.List;

public class StudentService {
    private StudentDAO dao;

    public StudentService(StudentDAO dao) {
        this.dao = dao;
    }

    public List<Student> getAll() {
        return dao.findAll();
    }
}

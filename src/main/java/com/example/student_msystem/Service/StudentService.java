package com.example.student_msystem.Service;

import com.example.student_msystem.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    void deleteStudentById(Long id);
}

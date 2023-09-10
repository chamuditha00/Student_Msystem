package com.example.student_msystem.Controller;

import com.example.student_msystem.Entity.Student;
import com.example.student_msystem.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
       model.addAttribute("students",studentService.getAllStudents());
       return "students";
    }

    @GetMapping ("/students/new")
    public String CreateStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "CreateStudent";
    }

    @PostMapping("/students")
    public String SaveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";

    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";


    }
}

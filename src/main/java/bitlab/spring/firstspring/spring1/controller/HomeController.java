package bitlab.spring.firstspring.spring1.controller;

import bitlab.spring.firstspring.spring1.db.DBManager;
import bitlab.spring.firstspring.spring1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String mainPage(Model model) {
        model.addAttribute("students", DBManager.getStudents());
        return "main-page";
    }

    @GetMapping(value = "add-page")
    public String addPage() {
        return "add-page";
    }

    @PostMapping(value = "add-student")
    public String addStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }
}

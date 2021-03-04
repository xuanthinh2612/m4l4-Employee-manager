package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")

public class EmployeeController {

    @GetMapping("/show")
    public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/show")
    public String showInfo(@ModelAttribute Employee employee) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("employee",employee);
        return "/showInfo";
    }
}

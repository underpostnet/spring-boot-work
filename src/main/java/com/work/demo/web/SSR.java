package com.work.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.work.demo.model.EmployeeEntity;
import com.work.demo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class SSR {

    @Autowired
    EmployeeService service;

    // this message we are reading from application.properties file
    // @Value("${employees}")
    private List<EmployeeEntity> employees;

    @GetMapping("/")
    public String a(Model model) {
        this.employees = service.getAllEmployees();
        model.addAttribute("employees", this.employees);
        return "employees_list"; // view name
    }
}
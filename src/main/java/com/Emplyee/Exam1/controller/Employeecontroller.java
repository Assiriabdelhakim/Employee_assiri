package com.Emplyee.Exam1.controller;


import com.Emplyee.Exam1.model.EmployeeModel;
import com.Emplyee.Exam1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class Employeecontroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployee(@RequestBody EmployeeModel employeeModel) {
           employeeService.CreateEmployee(employeeModel);
    }

    @PostMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/")
    public List<EmployeeModel> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("{id}")
    public EmployeeModel getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById();
    }

    @PostMapping('/update')
    public void
}

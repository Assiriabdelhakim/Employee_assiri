package com.Emplyee.Exam1.service;

import com.Emplyee.Exam1.model.EmployeeModel;
import com.Emplyee.Exam1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void CreateEmployee (EmployeeModel employeeModel){
        employeeRepository.save(employeeModel);
    }
    public List<EmployeeModel> getAllEmployees(){
         return employeeRepository.findAll();
    }
    public EmployeeModel getEmployeeById(int id){
        Optional<EmployeeModel> con = employeeRepository.findById(id);
        return con.get();
    }
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }

    public void updateEmployee(EmployeeModel employeeModel){
        employeeRepository.save(employeeModel);
    }
}

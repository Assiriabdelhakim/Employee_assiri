package com.Emplyee.Exam1.repository;

import com.Emplyee.Exam1.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeModel, Integer>{

}

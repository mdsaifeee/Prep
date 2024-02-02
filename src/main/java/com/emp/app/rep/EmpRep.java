package com.emp.app.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.app.ent.Employee;

public interface EmpRep extends JpaRepository<Employee , Integer>{

}	

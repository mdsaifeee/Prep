package com.emp.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.app.ent.Employee;
import com.emp.app.rep.EmpRep;

@Repository
public class EmpDao {
	@Autowired
	EmpRep er;
	public String addemp(List<Employee> e) {
		er.saveAll(e);
		return "Successfully Added";
	}
	public List<Employee> getall(){
		return er.findAll();
	}
	
}

package com.emp.app.ser;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.app.Exc.NameNotFoundException;
import com.emp.app.dao.EmpDao;
import com.emp.app.ent.Employee;

@Service
public class EmpSer {
	@Autowired
	EmpDao ed;

	public String addemp(List<Employee> e) {
		return ed.addemp(e);
	}

	public List<Employee> getall() {
		return ed.getall();
	}

	public List<Employee> getemp(String n) throws NameNotFoundException {
		List<Employee> e = getall();
		List<Employee> eo = e.stream().filter(x -> x.getName().equals(n)).collect(Collectors.toList());
		if (eo.isEmpty()) {
			throw new NameNotFoundException("Enter Valid Name");
		}
		else {
			return eo;
		}
	}
}

package com.emp.app.cont;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.app.Exc.NameNotFoundException;
import com.emp.app.ent.Employee;
import com.emp.app.ser.EmpSer;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(value = "/admin")
public class EmpCon {
	static Logger log=Logger.getLogger(EmpCon.class);
	@Autowired
	EmpSer es;

	@PostMapping(value = "/addemp")
	public String addemp(@RequestBody List<Employee> e) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(es.addemp(e));
		return es.addemp(e);
	}

	@GetMapping(value = "/getall")
	public List<Employee> getall() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(es.getall());
		return es.getall();
	}

	@GetMapping(value = "/getemp/{n}")
	public List<Employee> getemp(@PathVariable String n) throws NameNotFoundException {
		return es.getemp(n);
	}
}

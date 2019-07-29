package com.codesby.rest.webservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("fieldFiltering")
	public Employee showEmployee() {
		return new Employee("Thomas", "Schmidt", 23, "thomas.schmidt@gmail.com");
	}
	
	@GetMapping("fieldFilteringVersion2")
	public List<Employee> showAllEmployee(){
		return Arrays.asList(new Employee("Thomas", "Schmidt", 23, "thomas.schmidt@gmail.com"), 
				new Employee("Jack", "Parker", 45, "jack.parker@gmail.com"));
	}

}

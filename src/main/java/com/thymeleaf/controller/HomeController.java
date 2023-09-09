package com.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thymeleaf.model.Employee;

@Controller
public class HomeController {
	// this mapping given in curly braces means it can access both "/" and "/home"
	// requests.
	@GetMapping({ "/", "/home" })
	public String getHome(Model model) {
		Employee e = new Employee();
		e.setName("Somu");
		e.setMob("12/45/78");
		Employee e1 = new Employee();
		e1.setName("Gomu");
		e1.setMob("12/45/78");
		model.addAttribute("myEmployee", e);
		model.addAttribute("myEmployee1", e1);
		return "home";
	}

	@GetMapping("/contact")
	public String getContact(Model model) {
		model.addAttribute("EID", 105);
		return "contact";
	}

	@ResponseBody
	@GetMapping("/emp/{eid}")
	public String getEmployee(@PathVariable(name = "eid") String empId) {
		return "your employee = " + empId;
	}

	@ResponseBody
	@GetMapping("/emp")
	public String getEmployeePathId(@RequestParam(name = "empId") String eid) {
		return "Employee Data = " + eid;
	}

	@GetMapping("/message")
	public String getMessage() {
		return "message";
	}

	@GetMapping("/conditional")
	public String getConditional(Model model) {

		Employee employee = new Employee();
		employee.setName("somya");
		employee.setMob("0-0-0");
		employee.setSalary(1200.90);
		model.addAttribute("employee", employee);
		return "conditional";
	}

	@GetMapping("/switch")
	public String getSwitch(Model model) {
		Employee employee = new Employee();
		employee.setName("gomya");

		model.addAttribute("emp", employee);
		return "switch";
	}

	@GetMapping("/looping")
	public String getLooping(Model model) {
		List<Employee> empList = Arrays.asList(
				new Employee(1, "somu", "1111", 1000),
				new Employee(2, "gomu", "2222", 2000), 
				new Employee(3, "somya", "3333", 3000),
				new Employee(4, "gomya", "4444", 4000));

		model.addAttribute("empList", empList);
		return "looping";
	}

}
package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thymeleaf.model.Employee;

@Controller
public class RegistrationController {
	@GetMapping("/registration")
	public String resisterEmployee(@ModelAttribute(name = "employee") Employee emp) {
		return "registration";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee emp, RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("savedEmp", emp);
		return "redirect:/empdetails";
	}

	@GetMapping("/empdetails")
	public String showEmpDetails() {
		return "empdetails";
	}

}

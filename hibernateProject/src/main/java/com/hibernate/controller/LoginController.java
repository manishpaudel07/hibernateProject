package com.hibernate.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hibernate.dao.dto.EmployeeDTO;
import com.hibernate.service.EmployeeService;

@Controller
public class LoginController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping({"/auth","/"})
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String registerEmployee()
	{
		return"register";
	}
	
	@PostMapping("/users")
	public String employeeRegister(@ModelAttribute EmployeeDTO employeeDTO,Model model) throws IOException 
	{

		
		byte[] bphoto=employeeDTO.getPhoto().getBytes();
		employeeDTO.setBphoto(bphoto);
		employeeDTO.setRole("customer");
		employeeDTO.setDOB(new Timestamp(new Date().getTime()));
		employeeService.insertEmployee(employeeDTO);
		model.addAttribute("message", "successfully registered");
		return "register";
	}
	
}

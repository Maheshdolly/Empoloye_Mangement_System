package com.project.springBootProject1.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.springBootProject1.Entity.Employee;
import com.project.springBootProject1.Service.EmpService;

import jakarta.servlet.http.HttpSession;
@Controller
public class EmpController {
	@Autowired
	private EmpService Service;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Employee> emp = Service.getAllEmp();
		m.addAttribute("emp",emp);
				return "index";
	}
	@GetMapping("/addEmp")
	public String addEmp() {
		
		return "add_Emp";
	}
	@PostMapping("/register")
    public String empRegister(@ModelAttribute Employee em, HttpSession session ) {
    	System.out.println(em);
    	Service.addemp(em);
    	session.setAttribute("msg", "Employee added successfully...");
    	
    	return "redirect:/";
    	
    }
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m ) {
		Employee e=Service.getEmpById(id);
		m.addAttribute("emp", e);
		return "edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
		Service.addemp(e);
		session.setAttribute("msg", "EMP Data Edited Successfully");
		return "redirect/";
	}
	@GetMapping("/delete/{id}")
	public String deleteEMp(@PathVariable int id, HttpSession session) {

		Service.deleteEMp(id);
		session.setAttribute("msg", "Emp Data Delete Sucessfully..");
		return "redirect:/";
	}

}
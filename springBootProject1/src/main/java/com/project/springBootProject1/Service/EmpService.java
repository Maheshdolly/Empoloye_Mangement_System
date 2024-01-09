package com.project.springBootProject1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springBootProject1.Entity.Employee;
import com.project.springBootProject1.Repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository repo;
	
	public void addemp(Employee e) {
		repo.save(e);
		
	}
	public List<Employee>getAllEmp(){
		return repo.findAll();
	}
	public Employee getEmpById(int id) {
		Optional<Employee> e=repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteEMp(int id) {
		repo.deleteById(id);
	}

}

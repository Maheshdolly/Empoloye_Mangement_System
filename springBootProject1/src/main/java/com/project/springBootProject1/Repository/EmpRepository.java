package com.project.springBootProject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springBootProject1.Entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}

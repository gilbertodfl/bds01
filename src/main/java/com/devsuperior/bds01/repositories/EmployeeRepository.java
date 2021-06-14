package com.devsuperior.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds01.entities.Employee;
//repare que aqui é uma INTERFACE 
// e quem precisa importar o import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository <Employee, Long>{
	

}

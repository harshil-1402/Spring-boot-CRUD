package com.harshil.springbootcrud;

import com.harshil.springbootcrud.Repository.EmployeeRepository;
import com.harshil.springbootcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFist_name("Harshil");
		employee.setLast_name("Pathria");
		employee.setEmail("harshilvk18@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFist_name("Bhavika");
		employee1.setLast_name("Paladugu");
		employee1.setEmail("paladugubhavika@gmail.com");
		employeeRepository.save(employee1);
	}
}

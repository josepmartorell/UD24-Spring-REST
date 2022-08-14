/**
 * 
 */
package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Employee;
import com.crud.h2.service.EmployeeServiceImpl;

/**
 * @author jtech
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServideImpl;
	
	@GetMapping("/employees")
	public List<Employee> listEmployees(){
		return employeeServideImpl.listEmployees();
	}
	
	//list Customers by name field
	@GetMapping("/employees/name/{name}")
	public List<Employee> listarClienteNombre(@PathVariable(name="name") String name) {
	    return employeeServideImpl.listEmployeeName(name);
	}
	
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeServideImpl.saveEmployee(employee);
	}
	
	
	@GetMapping("/employees/{id}")
	public Employee clienteXID(@PathVariable(name="id") Long id) {
		
		Employee employee_xid= new Employee();
		
		employee_xid=employeeServideImpl.employeeXID(id);
		
		System.out.println("Employee XID: "+employee_xid);
		
		return employee_xid;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name="id")Long id,@RequestBody Employee employee) {
		
		Employee employee_selected= new Employee();
		Employee employee_updated= new Employee();
		
		employee_selected= employeeServideImpl.employeeXID(id);
		
		employee_selected.setName(employee.getName());
		employee_selected.setSurname(employee.getSurname());
		employee_selected.setJob(employee.getJob());
		employee_selected.setDni(employee.getDni());
		employee_selected.setDate(employee.getDate());
		
		employee_updated = employeeServideImpl.updateEmployee(employee_selected);
		
		System.out.println("The updated client is: "+ employee_updated);
		
		return employee_updated;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name="id")Long id) {
		employeeServideImpl.deleteEmployee(id);
	}

}

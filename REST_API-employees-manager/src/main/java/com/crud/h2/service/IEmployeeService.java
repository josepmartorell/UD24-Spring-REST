/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Employee;

/**
 * @author jtech
 *
 */
public interface IEmployeeService {
	
	//CRUD METHODS
	public List<Employee> listEmployees(); //List ALL 
	
	public Employee saveEmployee(Employee employee);	//Save an employee CREATE
	
	public Employee employeeXID(Long id); //read client data READ
	
	public List<Employee> listEmployeeName(String name);//List employees by name field
	
	public Employee updateEmployee(Employee employee); //Updates client data UPDATE
	
	public void deleteEmployee(Long id);// Delete a client DELETE

}

/**
 * 
 */
package com.crud.h2.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Employee;

/**
 * @author jtech
 *
 */
public interface IEmployeeDAO extends JpaRepository<Employee, Long>{
	//LISTS EMPLOYEES BY FIELD OR NAME
	public List<Employee> findByName(String name);

}

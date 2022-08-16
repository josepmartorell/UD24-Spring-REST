/**
 * 
 */
package com.crud.h2.dto;

/**
 * @author jtech
 *
 */
public enum Jobs {
	GUITARMAN ("guitarman", 100000.00F), 
	DEVELOPER ("developer", 90000.00F), 
	POLICTICIAN ("politician", 600000.00F),
	POLICEMAN ("policeman", 35000.00F); 

	public String job; 
	public Float salary; 

	Jobs(String job, Float salary) 
	{ 
		this.job= job; 
		this.salary= salary; 
	}
	

}

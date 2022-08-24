package com.crud.h2.dto;

import java.util.Date;
import java.util.Hashtable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

@Entity
@Table(name="employee")
public class Employee {
	//ENTITY EMPLOYEE ATRIBUTES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO INCREMENTAL VALUE
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "job")
	private String job;
	@Column(name = "salary")
	private Double salary;
	@Column(name = "dni")
	private int dni;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;	
	//CONSTRUCTORS
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param name
	 * @param surname
	 * @param job
	 * @param salary
	 * @param dni
	 * @param date
	 */
	public Employee(Long id, String name, String surname, String job, int dni, Date fecha) {
		super();
		Hashtable<String, Double> assign = assignSalary();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.job = job;
		System.out.println(assign.get(job));
		this.salary = assign.get(job);
		this.dni = dni;
		this.fecha = fecha;
	}	
	
	//GETTERS AND SETTERS
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return fecha;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.fecha = date;
	}
	//TOSTRING METHOD
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", job=" + job + ", salary=" + salary
				+ ", dni=" + dni + ", date=" + fecha + "]";
	}
	
	//AUTOMATIC INSERTION OF SALARIES ACCORDING TO PROFESSION
	public Hashtable<String, Double> assignSalary() {
		String jobs[] = {"AWS Engineer","Java Developer","React Engineer","Project Manager","Python Developer"};
	    Double salaries[] = {60000.00, 45000.00, 34000.00, 42000.00, 29000.00};
		
		Hashtable<String, Double> assignment = new Hashtable<String, Double>();
		for (int j = 0; j < salaries.length; j++) {
			assignment.put(jobs[j], salaries[j]);
		}	
		return assignment;
	}
	

	

	

	

}

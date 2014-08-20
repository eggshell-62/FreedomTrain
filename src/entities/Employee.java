package entities;

import javax.persistence.Entity;

import support.Contract;
import support.JobDescription;

@Entity
public class Employee extends Person{
	protected JobDescription job;
	protected Contract[] contracts;
	protected int employeeId;
	
	public Employee(){
		
	}
}

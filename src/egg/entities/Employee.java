package egg.entities;

import javax.persistence.Entity;

import egg.support.Contract;
import egg.support.JobDescription;

@Entity
public class Employee extends Person{
	protected JobDescription job;
	protected Contract[] contracts;
	protected int employeeId;
	
	public Employee(){
		
	}
}

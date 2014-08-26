package egg.entities;



import egg.support.Contract;
import egg.support.JobDescription;

public class Employee extends Person{
	protected JobDescription job;
	protected Contract[] contracts;
	protected int employeeId;
	
	public Employee(){
		
	}
}

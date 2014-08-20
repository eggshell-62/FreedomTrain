package egg.support;

public class JobDescription {
	private String jobTitle;
	private double payRate;
	private boolean isHourly; //check this first to determin whether payRate is salary or not
	
	public JobDescription(){
		this.isHourly = true;
		this.payRate = 15.00;
		this.jobTitle = "Developer I";
	}

	//TODO getters and setters for updates and retrievals
	
}

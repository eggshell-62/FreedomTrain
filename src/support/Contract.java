package support;

public class Contract {
	protected String lengthOfAssignment; //may change this to an int to track days
	protected String client;
	protected boolean isCurrent;
	
	public Contract(){
		this.isCurrent = false;
		//TODO finish
	}
	
	public void  contractStart(){
		this.isCurrent = true;
		//TODO finish
	}
	
	public void updateAssignmentLength(String newTotal){
		this.lengthOfAssignment = newTotal;
	}

}

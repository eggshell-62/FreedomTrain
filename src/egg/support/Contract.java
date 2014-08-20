package egg.support;

public class Contract {
	protected String lengthOfAssignment; //may change this to an int to track days on assignment
	protected String client;
	protected boolean isCurrent;
	
	public Contract(){
		this.isCurrent = false;
		//TODO finish
	}
	
	public Contract(String len, String cl){
		this.lengthOfAssignment = len;
		this.client = cl;
		this.isCurrent = false;
	}
	
	public Contract(String len, String cl, boolean curr){
		this.lengthOfAssignment = len;
		this.client = cl;
		this.isCurrent = curr;
	}
	
	public void contractStart(){
		this.isCurrent = true;
		//TODO finish
	}
	
	public void updateAssignmentLength(String newTotal){
		this.lengthOfAssignment = newTotal;
	}

	
}

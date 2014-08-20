package support;

import entities.Employee;

public interface JobDuties {
	
	public void promote(Employee emp);
	
	public void discipline(Employee inTrouble);
		
	//will eventually return a really long string for an explanation
	public void denyPromotion(Employee screwed);
	
	public void fire(Employee fired);
	
	public void sue(Employee screwedHarder);
}

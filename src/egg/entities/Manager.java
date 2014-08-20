package egg.entities;

import javax.persistence.Entity;

import egg.support.JobDuties;

@Entity
public class Manager extends Employee implements JobDuties{

	
	public Manager(){
		
	}

	public void promote(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void discipline(Employee inTrouble) {
		// TODO Auto-generated method stub
		
	}

	public void denyPromotion(Employee screwed) {
		// TODO Auto-generated method stub
		
	}

	public void fire(Employee fired) {
		// TODO Auto-generated method stub
		
	}

	public void sue(Employee screwedHarder) {
		// TODO Auto-generated method stub
		
	}

}

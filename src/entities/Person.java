package entities;

import support.Address;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected Address homeAddr;
	
	
	public Person(){
		
	}
	
	public Person(String fn, String ln, Address home){
		this.firstName = fn;
		this.lastName = ln;
		this.homeAddr = home;
	}
	
	/**
	 * 
	 * @param fn
	 * @param ln
	 * @param strt
	 * @param city
	 * @param state
	 * @param phone
	 * @param zip
	 * 
	 * in case Address obj not instantiated beforehand
	 */
	public Person(String fn, String ln, 
			String strt, String city, String state, String phone, int zip){
		this.firstName = fn;
		this.lastName = ln;
		this.homeAddr = new Address(strt, city, state, phone, zip);		
	}

	public void updateFirstname(String fn){
		this.firstName = fn;
	}
	
	public void updateLastname(String ln){
		this.lastName = ln;
	}
	
	public void updateHomeAddress(){
		//TODO not sure how to go about this yet
	}
}

package egg.support;

/**
 * 
 * @author ajackson
 *keep all employee address info together
 */
public class Address {
	protected String streetAddr;
	protected String city;
	protected String state;
	protected int zipCode;
	protected String homePhone;
	
	public Address(){
		
	}
	
	public Address(String strt, String cit, String st, String phone, int zip){
		this.streetAddr = strt;
		this.state = st;
		this.city = cit;
		this.zipCode = zip;
		this.homePhone = phone;
	}
	
	/**
	 * 
	 * @return
	 */
	public Address getAddressInfo(){
		return this;
	}
}

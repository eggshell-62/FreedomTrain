package egg.daos;



public abstract class BaseDAO {

	
	//these methods will be universal across the DAOs
	public abstract void persist(Object o);
	public abstract void destroy(Object o);
	

}

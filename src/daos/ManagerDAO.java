package daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ManagerDAO extends BaseDAO{
	@PersistenceContext
	protected EntityManager em;

	@Override
	public void persist(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy(Object o) {
		// TODO Auto-generated method stub
		
	}

}

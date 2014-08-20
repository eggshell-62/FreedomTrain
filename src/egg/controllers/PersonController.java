package egg.controllers;

import javax.servlet.http.HttpServletRequest;




import egg.daos.EmployeeDAO;
import egg.daos.ManagerDAO;



/**
 * 
 * @author ajackson
 *
 *class will form basis for any of the application's controllers
 */
public class PersonController extends BaseController{

	private EmployeeDAO eDao;
	

	private ManagerDAO mDao;
	
	
/*
	public String homePage(final HttpServletRequest request, final Model model){
		
		
		
		return "home";
	}*/
}

package egg.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egg.daos.EmployeeDAO;



/**
 * 
 * @author ajackson
 *
 *class will form basis for any of the application's controllers
 */
@Controller
public class PersonController{
	@Autowired
	private EmployeeDAO eDao;
	
	
	@RequestMapping
	public String homePage(final HttpServletRequest request, final Model model){
		
		
		
		return "home";
	}
}

package com.robin.warhorse.business.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.robin.warhorse.business.domain.user.Administrator;
import com.robin.warhorse.business.service.IAdministratorService;

@Controller
@RequestMapping("/admin")
public class AdministratorController {
	@Autowired
	private IAdministratorService administratorService;
	
	private Logger log = LoggerFactory.getLogger(AdministratorController.class);
	
	@RequestMapping(value="/dashboard",method=RequestMethod.POST)
	public ModelAndView getAdministrator(HttpServletRequest request,HttpServletResponse response){
		String adminName = request.getParameter("email");
		String password = request.getParameter("password");
		Administrator adm = new Administrator(adminName,password);
		Administrator admin = administratorService.getAdministratorByName(adm);
		return new ModelAndView("dashboard", "Administrator", admin);
		
	}
	public Boolean addAdministrator(Administrator administrator){
		log.warn(administrator.toString() + " Login");
		return administratorService.saveAdministrator(administrator);
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView view = new ModelAndView("login");
		view.addObject("HelloWorld", "HelloWorld");
		return view;
	}
	
}

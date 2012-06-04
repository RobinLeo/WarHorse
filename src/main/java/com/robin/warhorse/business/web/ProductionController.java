package com.robin.warhorse.business.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.robin.warhorse.business.domain.Production;
import com.robin.warhorse.business.service.IProductionService;

@Controller
@RequestMapping("/")
public class ProductionController {
	@Autowired
	private IProductionService productionService;
	
	private final static Logger log = LoggerFactory.getLogger(ProductionController.class);

	@RequestMapping(value="/production",method=RequestMethod.GET)
	public ModelAndView getProduct(Model model){
		Production p = new Production(14,"Mac",new BigDecimal(11111),"Good");
		System.err.println(p.toString()+"???????");
		System.out.println(p.toString()+"------");
		log.warn(p.toString()+"!!!!!!");
		return new ModelAndView("Production","Production",p); 
	}
	@RequestMapping(value="/addProduction")
	public ModelAndView addProduction(Production production){
		
		productionService.saveProduction(production);
		Production p = new Production(14,"Mac",new BigDecimal(2222),"Good");
		return new ModelAndView("editProduction","Production",p); 
	}
	@RequestMapping(value="/editProduction")
	public String editProduction(Model model){
		Production p = new Production(14,"Mac",new BigDecimal(2222),"Good");
		productionService.updateProduction(p);
		return "production";
	}
	@RequestMapping(value="/deleteProduction")
	public String deleteProduction(String productionid){
		List<String> listIds = new ArrayList<String>();
		listIds.add(productionid);
		productionService.deleteProduction(listIds);
		return "production";
	}

}

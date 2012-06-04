package com.robin.warhorse.business.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robin.warhorse.business.domain.Production;
import com.robin.warhorse.business.persistence.ProductionMapper;
import com.robin.warhorse.business.service.IProductionService;

@Service("productionService")
public class ProductionServiceImpl implements IProductionService {
	@Autowired
	private ProductionMapper productionMapper;


	public Production getProductionByName(String pName){	
		Production production = productionMapper.selectProductionByName("bbb");
		return production;
	}


	public boolean saveProduction(Production production) {
//		productionMapper.insertProduction(production);
//		production.setProductionid("10000001");
//		production.setPrice(new BigDecimal(1.0));
//		production.setProductionname("NoteBook");
//		production.setDetail("IBM Thinkpad R400");
		System.out.println(production.toString());
		int success = productionMapper.insertProduction(production);
		return success > 0;
	}


	public boolean updateProduction(Production production) {
//		production.setProductionid("10000001");
//		production.setPrice(new BigDecimal(1.0));
//		production.setProductionname("NoteBook");
//		production.setDetail("IBM Thinkpad R400");
		int success = productionMapper.updateProduction(production);
		return success > 0;
	}


	public boolean deleteProduction(List<String> listIds) {
		int success = 0;
		for(int i =0; i < listIds.size(); i++){
			success += productionMapper.deleteProduction(listIds.get(i));
		}
		return success > 0;
	}
}


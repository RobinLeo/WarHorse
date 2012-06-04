package com.robin.warhorse.business.persistence;

import com.robin.warhorse.business.domain.Production;

public interface ProductionMapper {
	
	public Production selectProductionByName(String pName);
	
	public int insertProduction(Production p);
	
	public int updateProduction(Production p);
	
	public int deleteProduction(String id);

}



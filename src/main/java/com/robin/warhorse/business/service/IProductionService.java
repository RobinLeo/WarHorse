package com.robin.warhorse.business.service;

import java.util.List;

import com.robin.warhorse.business.domain.Production;

public interface IProductionService {

	public Production getProductionByName(String pName);

	public boolean saveProduction(Production production);

	public boolean updateProduction(Production production);

	public boolean deleteProduction(List<String> listIds);

}

package com.robin.warhorse.business.service;

import java.util.List;

import com.robin.warhorse.business.domain.user.Administrator;

public interface IAdministratorService {

	public Administrator getAdministratorByName(Administrator admin);

	public boolean saveAdministrator(Administrator administrator);

	public boolean updateAdministrator(Administrator administrator);

	public boolean deleteAdministrators(List<Integer> listIds);

}

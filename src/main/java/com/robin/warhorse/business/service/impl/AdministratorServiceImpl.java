package com.robin.warhorse.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robin.warhorse.business.domain.user.Administrator;
import com.robin.warhorse.business.persistence.AdministratorMapper;
import com.robin.warhorse.business.service.IAdministratorService;
@Service("administratorService")
public class AdministratorServiceImpl implements IAdministratorService {
	@Autowired
	private AdministratorMapper administratorMapper;

	public boolean deleteAdministrators(List<Integer> listIds) {
		int success = 0;
		for(Integer id : listIds){
			success = administratorMapper.deleteAdministrator(id);
		}
		return success > 0;
	}

	public Administrator getAdministratorByName(Administrator admin) {
		Administrator administrator = administratorMapper.selectAdministratorByParams(admin);
		return administrator;
	}

	public boolean saveAdministrator(Administrator administrator) {
		int success = administratorMapper.insertAdministrator(administrator);
		return success > 0;
	}

	public boolean updateAdministrator(Administrator administrator) {
		int success = administratorMapper.updateAdministrator(administrator);
		return success > 0;
	}

}

package com.robin.warhorse.business.persistence;

import com.robin.warhorse.business.domain.user.Administrator;

public interface AdministratorMapper {
	
	public int insertAdministrator(Administrator admin);
	
	public int updateAdministrator(Administrator admin);
	
	public int deleteAdministrator(int adminId);
	
	public Administrator selectAdministratorByParams(Administrator admin);

}

package org.hra.repository;

import org.springframework.stereotype.Component;

@Component
public class ApiDaoImpl implements ApiDao{

	@Override
	public String getApiVersion() {
		return "V-1.0";
	}

}

package org.hra.service;

import org.hra.repository.ApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ApiServiceImpl implements ApiService{
	@Autowired
	private ApiDao apiDao;
	@Override
	public String getApiVersion() {
		return apiDao.getApiVersion();
	}

}

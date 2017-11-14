package org.hra.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ApiDao {
	String getApiVersion();
}

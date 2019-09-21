package com.chenlin.specialroute.repository;

import org.springframework.data.repository.CrudRepository;

import com.chenlin.specialroute.model.AbTestingRoute;

/**
 * @author Chen Lin
 * @date 2019-09-21
 */

public interface AbTestingRouteRepository extends CrudRepository<AbTestingRoute, String> {
	public AbTestingRoute findByServiceName(String serviceName);
}

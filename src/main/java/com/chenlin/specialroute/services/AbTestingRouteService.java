package com.chenlin.specialroute.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenlin.specialroute.exception.NoRouteFound;
import com.chenlin.specialroute.model.AbTestingRoute;
import com.chenlin.specialroute.repository.AbTestingRouteRepository;

/**
 * @author Chen Lin
 * @date 2019-09-21
 */

@Service
public class AbTestingRouteService {
	
	@Autowired
	private AbTestingRouteRepository abTestingRouteRepository;
	
	public AbTestingRoute getRoute(String serviceName) {
		AbTestingRoute route = abTestingRouteRepository.findByServiceName(serviceName);
		if(route==null) {
			throw new NoRouteFound();
		}
		
		return route;
	}
	
	public void saveAbTestinRoute(AbTestingRoute route) {
		abTestingRouteRepository.save(route);
	}
	
	public void updateRouteAbTestingRoute(AbTestingRoute route) {
		abTestingRouteRepository.save(route);
	}
	
	public void deleteRoute(AbTestingRoute route) {
		abTestingRouteRepository.delete(route);
	}
	
}

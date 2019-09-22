package com.chenlin.specialroute.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenlin.specialroute.model.AbTestingRoute;
import com.chenlin.specialroute.services.AbTestingRouteService;

/**
 * @author Chen Lin
 * @date 2019-09-22
 */

@RestController
@RequestMapping(value="v1/route")
public class SpecialRoutesServiceController {
	
	@Autowired
	AbTestingRouteService routeService;
	
	@RequestMapping(value="abtesting/{serviceName}",method=RequestMethod.GET)
	public AbTestingRoute abstestings(@PathVariable("serviceName") String serviceName) {
		return routeService.getRoute(serviceName);
	}
}

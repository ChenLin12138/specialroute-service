package com.chenlin.specialroute.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Chen Lin
 * @date 2019-09-21
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoRouteFound extends RuntimeException {

}

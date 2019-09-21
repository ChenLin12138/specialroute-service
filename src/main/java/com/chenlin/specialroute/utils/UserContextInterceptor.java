package com.chenlin.specialroute.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @author Chen Lin
 * @date 2019-09-14
 */

public class UserContextInterceptor implements ClientHttpRequestInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(UserContextInterceptor.class);
	//此方法在RestTemplate发生之前实际的https调用之前被调用
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		HttpHeaders headers = request.getHeaders();
		//为出站https数据添加请求首部
		headers.add(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
		logger.debug("Licensing-service Correlation id:{}",UserContextHolder.getContext().getCorrelationId());
		headers.add(UserContext.AUTH_TOKEN, UserContextHolder.getContext().getAuthToken());
		return execution.execute(request, body);
	}

}

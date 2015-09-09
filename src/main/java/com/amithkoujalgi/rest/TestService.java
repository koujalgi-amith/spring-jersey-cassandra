package com.amithkoujalgi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amithkoujalgi.dao.TestDAOInterface;
import com.amithkoujalgi.utils.ResponseBuilder;

@Component
@Path("/test")
public class TestService {

	@Autowired
	TestDAOInterface testDao;

	@GET
	@Path("/")
	public Response testGetService() {
		String result = testDao.test();
		return ResponseBuilder.build(result, 200);
	}

}
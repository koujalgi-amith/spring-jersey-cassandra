package com.amithkoujalgi.utils;

import javax.ws.rs.core.Response;

public class ResponseBuilder {
	public static Response build(Object o, int status) {
		return Response.status(status).entity(o).build();
	};
}
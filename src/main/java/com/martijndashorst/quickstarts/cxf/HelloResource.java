package com.martijndashorst.quickstarts.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class HelloResource {
	@GET
	public String hello() {
		return "Hello, World!";
	}
}

package com.moti.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/get")
public class GetName {

	
	  @GET
	  public String getHtml() {
	        return "Moti Malka & Nehora";
	    }
}

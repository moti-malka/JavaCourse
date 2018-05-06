package com.moti.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import Object.Player;

@Path("/login")
public class LoginHendler {

	
	/*
	  @GET
	  @Produces("application/json")
	  @Path("{name}")
	  public String createPlayer(@PathParam("name") String name) {
		  
		  Player player = new Player();
		  player.setPlayerName(name);
		      return "The player: " + player.toString();
	    }
	    */
	  
	  @GET
	  @Produces("application/json")
	  public String createPlayer() {
		  
		  Player player = new Player();
		  player.setPlayerName("Moti");
		      return "The player: " + player.toString();
	    }
}

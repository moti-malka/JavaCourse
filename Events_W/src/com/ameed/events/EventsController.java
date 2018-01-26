package com.ameed.events;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/event")
public class EventsController {

	@GET
	@Path("/all")
	public List<Event> getAllEvents() {
		List<Event> list = EventsDAO.listAll();
		System.out.println("Found " + list.size() + " events");
		return list;
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public int addEvent(Event newEvent) {
		int id = EventsDAO.insert(newEvent).getId();
		System.out.println("A new event was added: " + newEvent);
		return id;
	}

	@DELETE
	@Path("/{id}")
	public boolean removeEvent(@PathParam("id") int eventId) {
		Event deletedObject = EventsDAO.delete(eventId);
		System.out.println("An event was deleted: " + deletedObject);
		return deletedObject != null;
	}
}
